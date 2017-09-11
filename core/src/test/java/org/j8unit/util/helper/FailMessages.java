package org.j8unit.util.helper;

import org.j8unit.util.ToStringBasedCharSequence;

public enum FailMessages
implements ToStringBasedCharSequence {

    NULL("illegal null string"),

    LENGTH("string has illegal length"),

    INVALID("malformed java identifier string");

    private final String msg;

    private FailMessages(final String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return this.msg;
    }

}
