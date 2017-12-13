package me.duncte123.ticTacToe

import javax.swing.JFrame

class GameBoard {

    public final Player player1
    public final Player player2
    public final JFrame frame

    GameBoard(Player p1, Player p2, JFrame f) {
        this.player1 = p1
        this.player2 = p2
        this.frame = f
    }

    def swapPlayers() {
        player1.setCurrent(!player1.isCurrent)
        player2.setCurrent(!player2.isCurrent)
    }

}
