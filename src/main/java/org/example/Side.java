package org.example;

public enum Side {
    X,
    O;

    Side flip() {
        if(this.equals(Side.X))
            return Side.O;
        return Side.X;
    }
}
