package me.duncte123.ticTacToe.utils

import me.duncte123.ticTacToe.Main
import me.duncte123.ticTacToe.entities.Player
import me.duncte123.ticTacToe.entities.TttButton

class CheckForWin {

    static boolean hasPlayerWon(Player p, int btnId) {
        boolean flag1 = false
        boolean flag2 = false
        boolean flag3 = false
        boolean flag4 = false

        String sym = p.symbol

        switch (btnId) {
            case 0:
                flag1 = checkButtons(1,2,sym)
                flag2 = checkButtons(3,6,sym)
                flag3 = checkButtons(4,8,sym)
                break
            case 1:
                flag1 = checkButtons(0,2,sym)
                flag2 = checkButtons(4,7,sym)
                break
            case 2:
                flag1 = checkButtons(1,0,sym)
                flag2 = checkButtons(5,8,sym)
                flag3 = checkButtons(4,6,sym)
                break
            case 3:
                flag1 = checkButtons(6,0,sym)
                flag2 = checkButtons(5,4,sym)
                break
            case 4:
                flag1 = checkButtons(0,8,sym)
                flag2 = checkButtons(2,6,sym)
                flag3 = checkButtons(1,7,sym)
                flag4 = checkButtons(3,5,sym)
                break
            case 5:
                flag1 = checkButtons(2,8,sym)
                flag2 = checkButtons(3,4,sym)
                break
            case 6:
                flag1 = checkButtons(0,3,sym)
                flag2 = checkButtons(7,8,sym)
                flag3 = checkButtons(4,2,sym)
                break
            case 7:
                flag1 = checkButtons(6,8,sym)
                flag2 = checkButtons(1,4,sym)
                break
            case 8:
                flag1 = checkButtons(2,5,sym)
                flag2 = checkButtons(6,7,sym)
                flag3 = checkButtons(0,4,sym)
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

    static boolean checkButtons(int btn1, int btn2, String sym) {
        return getButtonFromId(btn1).text == sym && getButtonFromId(btn2).text == sym
    }

    static TttButton getButtonFromId(int id) {
        return (TttButton)Main.board.frame.contentPane.getComponent(id)
    }
}
