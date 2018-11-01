package me.duncte123.ticTacToe.entities.board

import groovy.transform.PackageScope
import me.duncte123.ticTacToe.entities.Player

import javax.swing.JFrame

class GameBoard {

    public final Player player1
    public final Player player2
    public final JFrame frame

    @PackageScope
    GameBoard(Player p1, Player p2, JFrame f) {
        this.player1 = p1
        this.player2 = p2
        this.frame = f
    }

    def swapPlayers() {
        player1.current = !player1.current
        player2.current = !player2.current
    }

}
