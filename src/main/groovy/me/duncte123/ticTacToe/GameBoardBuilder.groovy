package me.duncte123.ticTacToe

import me.duncte123.ticTacToe.entities.Player
import me.duncte123.ticTacToe.entities.TttButton

import javax.swing.*
import java.awt.*

class GameBoardBuilder extends JFrame {

    public final Player player1
    public final Player player2

    GameBoardBuilder(int w, int h, Player p1, Player p2) {
        super("Tic Tac Toe")

        this.player1 = p1
        this.player2 = p2

        setBounds(0, 0, w, h)
        setDefaultCloseOperation(EXIT_ON_CLOSE)

        addButtons(this)

        def panel = new JPanel()
        panel.setBounds(0, 0, this.width, this.height)
        panel.setBackground(Color.WHITE)

        this.contentPane.add(panel)
    }

    private static def addButtons(JFrame window) {
        def columns = 3
        def rows = 3

        def columnSpace = window.height / columns //Y
        def rowSpace = window.width / rows //X
        int btnSize = columnSpace - 20
        int btnCount = 0

        3.times {
            def whatColumn = it % 3
            3.times {
                def whatRow = it % 9
                def btn = new TttButton(btnCount)
                //btn.addActionListener(new ButtonListener())
                btn.setBounds((int) (columnSpace * whatColumn), (int) (rowSpace * whatRow), btnSize, btnSize)
//                btn.setBackground(Color.BLACK)
//                btn.setForeground(Color.WHITE)
//                btn.setFont(new Font("Arial", Font.PLAIN, 100))
                window.contentPane.add(btn)
                btnCount++
            }
        }
    }


    GameBoard build() {
        return new GameBoard(player1, player2, this)
    }

}
