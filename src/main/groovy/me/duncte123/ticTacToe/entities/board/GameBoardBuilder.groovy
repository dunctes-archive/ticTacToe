package me.duncte123.ticTacToe.entities.board

import me.duncte123.ticTacToe.Main
import me.duncte123.ticTacToe.entities.Player
import me.duncte123.ticTacToe.entities.TttButton

import javax.swing.*
import java.awt.*

class GameBoardBuilder extends JFrame {

    final Player player1
    final Player player2

    GameBoardBuilder(int w, int h, Player p1, Player p2, Main instance) {
        super("Tic Tac Toe")

        this.player1 = p1
        this.player2 = p2

        setBounds(0, 0, w, h)
        setDefaultCloseOperation(EXIT_ON_CLOSE)

        addButtons(instance)

        def panel = new JPanel()
        panel.setBounds(0, 0, this.width, this.height)
        panel.setBackground(Color.WHITE)

        this.contentPane.add(panel)
    }

    private void addButtons(Main instance) {
        def columns = 3
        def rows = 3

        def columnSpace = this.height / columns //Y
        def rowSpace = this.width / rows //X
        int btnSize = columnSpace - 20
        def btnCount = 0

        3.times {
            def whatColumn = it % 3
            3.times {
                def whatRow = it % 9
                def btn = new TttButton(btnCount, instance)
                btn.setBounds((int) (columnSpace * whatColumn), (int) (rowSpace * whatRow), btnSize, btnSize)
                this.contentPane.add(btn)
                btnCount++
            }
        }
    }


    GameBoard build() {
        return new GameBoard(player1, player2, this)
    }

}
