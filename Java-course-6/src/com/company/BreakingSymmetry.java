package com.company;

import java.util.Objects;

public class BreakingSymmetry implements Cloneable {

    String y;

    public BreakingSymmetry(String y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {

        if (o instanceof String) {
            return y.equals(o);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(y);
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}

