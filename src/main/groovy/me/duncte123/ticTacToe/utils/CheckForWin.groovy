package me.duncte123.ticTacToe.utils

import me.duncte123.ticTacToe.Main
import me.duncte123.ticTacToe.entities.Player
import me.duncte123.ticTacToe.entities.TttButton

class CheckForWin {

    static boolean hasPlayerWon(Main instance, Player p, int btnId) {
        def flag1 = false
        def flag2 = false
        def flag3 = false
        def flag4 = false

        def sym = p.symbol

        switch (btnId) {
            case 0:
                flag1 = checkButtons(instance, 1, 2, sym)
                flag2 = checkButtons(instance, 3, 6, sym)
                flag3 = checkButtons(instance, 4, 8, sym)
                break
            case 1:
                flag1 = checkButtons(instance, 0, 2, sym)
                flag2 = checkButtons(instance, 4, 7, sym)
                break
            case 2:
                flag1 = checkButtons(instance, 1, 0, sym)
                flag2 = checkButtons(instance, 5, 8, sym)
                flag3 = checkButtons(instance, 4, 6, sym)
                break
            case 3:
                flag1 = checkButtons(instance, 6, 0, sym)
                flag2 = checkButtons(instance, 5, 4, sym)
                break
            case 4:
                flag1 = checkButtons(instance, 0, 8, sym)
                flag2 = checkButtons(instance, 2, 6, sym)
                flag3 = checkButtons(instance, 1, 7, sym)
                flag4 = checkButtons(instance, 3, 5, sym)
                break
            case 5:
                flag1 = checkButtons(instance, 2, 8, sym)
                flag2 = checkButtons(instance, 3, 4, sym)
                break
            case 6:
                flag1 = checkButtons(instance, 0, 3, sym)
                flag2 = checkButtons(instance, 7, 8, sym)
                flag3 = checkButtons(instance, 4, 2, sym)
                break
            case 7:
                flag1 = checkButtons(instance, 6, 8, sym)
                flag2 = checkButtons(instance, 1, 4, sym)
                break
            case 8:
                flag1 = checkButtons(instance, 2, 5, sym)
                flag2 = checkButtons(instance, 6, 7, sym)
                flag3 = checkButtons(instance, 0, 4, sym)
                break
        }

        /*
            Button field:

            0   3   6

            1   4   7

            2   5   8
         */
        return flag1 || flag2 || flag3 || flag4
    }

    static boolean checkButtons(Main instance, int btn1, int btn2, String sym) {
        return getButtonFromId(instance, btn1).text == sym && getButtonFromId(instance, btn2).text == sym
    }

    static TttButton getButtonFromId(Main instance, int id) {
        return (TttButton) instance.board.frame.contentPane.getComponent(id)
    }
}
