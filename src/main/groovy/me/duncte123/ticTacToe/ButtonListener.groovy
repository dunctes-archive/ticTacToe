package me.duncte123.ticTacToe

import javax.swing.JButton
import java.awt.event.ActionEvent
import java.awt.event.ActionListener

class ButtonListener implements ActionListener {

    @Override
    void actionPerformed(ActionEvent e) {
        JButton source = (JButton)e.source

        if(!source.getText().isEmpty()) return

        if(Main.board.player1.isCurrent) {
            source.setText(Main.board.player1.symbol)
        } else if(Main.board.player2.isCurrent) {
            source.setText(Main.board.player2.symbol)
        }

        Main.board.swapPlayers()
    }
}
