package me.duncte123.ticTacToe

import me.duncte123.ticTacToe.entities.Player
import me.duncte123.ticTacToe.entities.TttButton
import me.duncte123.ticTacToe.utils.CheckForWin

import javax.swing.*
import java.awt.event.ActionEvent
import java.awt.event.ActionListener

class ButtonListener implements ActionListener {

    @Override
    void actionPerformed(ActionEvent e) {
        def source = (TttButton) e.source
        def curPlayer = null
        def board = Main.instance.board
        def p1 = board.player1
        def p2 = board.player2

        if (!source.text.empty) return

        if (p1.current) {
            curPlayer = p1
        }

        if (p2.current) {
            curPlayer = p2
        }


        source.setText(curPlayer.symbol)
        boolean hasPlayerWon = CheckForWin.hasPlayerWon(curPlayer, source.getBtnId())

        if (hasPlayerWon) {
            JOptionPane.showMessageDialog(null, "Player $curPlayer.name has won.\n" +
                    "App will now close.")
            System.exit(0)
        }

        board.swapPlayers()
    }
}
