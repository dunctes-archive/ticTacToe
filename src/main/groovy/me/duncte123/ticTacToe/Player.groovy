package me.duncte123.ticTacToe

class Player {

    private String name
    private String symbol
    public boolean isCurrent

    Player(String n, String s) {
        this.name = n
        this.symbol = s
        this.isCurrent = false
    }

    String getName() {
        return name
    }

    def setCurrent(boolean b) {
        this.isCurrent = b
    }

    String getSymbol() {
        return symbol
    }

}
