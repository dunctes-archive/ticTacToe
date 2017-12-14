package me.duncte123.ticTacToe

import me.duncte123.ticTacToe.entities.Player
import me.duncte123.ticTacToe.entities.TttButton
import me.duncte123.ticTacToe.utils.CheckForWin

import javax.swing.JOptionPane
import java.awt.event.ActionEvent
import java.awt.event.ActionListener

class ButtonListener implements ActionListener {

    @Override
    void actionPerformed(ActionEvent e) {
        TttButton source = (TttButton)e.source
        boolean hasPlayerWon = false
        Player curPlayer = null

        if(!source.getText().isEmpty()) return

        if(Main.board.player1.isCurrent) {
            source.setText(Main.board.player1.symbol)
            hasPlayerWon = CheckForWin.hasPlayerWon(Main.board.player1, source.getBtnId())
            curPlayer = Main.board.player1
        } else if(Main.board.player2.isCurrent) {
            source.setText(Main.board.player2.symbol)
            hasPlayerWon = CheckForWin.hasPlayerWon(Main.board.player2, source.getBtnId())
            curPlayer = Main.board.player2
        }

        if(hasPlayerWon) {
            JOptionPane.showMessageDialog(null, "Player $curPlayer.name has won.\n" +
                    "App will now close.")
            System.exit(0)
        } else {
            Main.board.swapPlayers()
        }

    }
}
