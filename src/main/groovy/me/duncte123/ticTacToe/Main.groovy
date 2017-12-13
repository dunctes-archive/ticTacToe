package me.duncte123.ticTacToe

import me.duncte123.ticTacToe.entities.Player

class Main {

    public static GameBoard board

    static void main(String... args) {
        def player1 = new Player("player 1", 'X')
        player1.setCurrent(true)
        def player2 = new Player("player 2", 'O')

        def boardBuilder = new GameBoardBuilder(500, 500, player1, player2)

        boardBuilder.setVisible(true)

        board = boardBuilder.build()

    }

}
