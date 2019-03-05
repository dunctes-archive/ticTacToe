package me.duncte123.ticTacToe

import me.duncte123.ticTacToe.entities.Player
import me.duncte123.ticTacToe.entities.board.GameBoard
import me.duncte123.ticTacToe.entities.board.GameBoardBuilder

class Main {

    final GameBoard board

    private Main() {
        def player1 = new Player(name: 'player 1', symbol: 'X', current: true)
        def player2 = new Player(name: 'player 2', symbol: 'O')

        def boardBuilder = new GameBoardBuilder(500, 500, player1, player2, this)

        board = boardBuilder.build()

        board.frame.setVisible(true)
    }

    static void main(String... args) {
        new Main()
    }

}
