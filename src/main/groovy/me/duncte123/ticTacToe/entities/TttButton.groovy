package me.duncte123.ticTacToe.entities

import me.duncte123.ticTacToe.ButtonListener

import javax.swing.*
import java.awt.*

class TttButton extends JButton {

    private final int btnId

    TttButton(int id) {
        super()

        this.btnId = id

        addActionListener(new ButtonListener())
        setBackground(Color.BLACK)
        setForeground(Color.WHITE)
        setFont(new Font("Arial", Font.PLAIN, 100))
    }

    int getBtnId() { btnId }

}
