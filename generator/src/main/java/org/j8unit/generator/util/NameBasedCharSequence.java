package org.j8unit.generator.util;

public abstract interface NameBasedCharSequence
extends CharSequence {

    public abstract String name();

    @Override
    public default int length() {
        return this.name().length();
    }

    @Override
    public default char charAt(final int index) {
        return this.name().charAt(index);
    }

    @Override
    public default CharSequence subSequence(final int start, final int end) {
        return this.name().subSequence(start, end);
    }

}
