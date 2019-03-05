package me.duncte123.ticTacToe.entities

import me.duncte123.ticTacToe.ButtonListener
import me.duncte123.ticTacToe.Main

import javax.swing.*
import java.awt.*

class TttButton extends JButton {

    private final int btnId

    TttButton(int id, Main instance) {
        super()

        this.btnId = id

        addActionListener(new ButtonListener(instance: instance))
        setBackground(Color.BLACK)
        setForeground(Color.WHITE)
        setFont(new Font("Arial", Font.PLAIN, 100))
    }

    int getBtnId() { btnId }

}
