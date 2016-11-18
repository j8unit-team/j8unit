package org.j8unit;

/**
 * Default implementation of the {@link CharSequence} interface by simply reusing the result of {@link #toString()}.
 *
 * @since 4.12.1
 */
public abstract interface StringBasedCharSequence
extends CharSequence {

    /**
     * @implSpec The default implementation refers to {@link String#subSequence(int, int)} of the {@link #toString()}
     *           result.
     * @implSpec The default implementation will throw a {@link NullPointerException} if the result of
     *           {@link #toString()} is {@code null}.
     */
    @Override
    public default CharSequence subSequence(final int start, final int end) {
        return toString().subSequence(start, end);
    }

    /**
     * @implSpec The default implementation refers to {@link String#length()} of the {@link #toString()} result.
     * @implSpec The default implementation will throw a {@link NullPointerException} if the result of
     *           {@link #toString()} is {@code null}.
     */
    @Override
    public default int length() {
        return toString().length();
    }

    /**
     * @implSpec The default implementation refers to {@link String#charAt(int)} of the {@link #toString()} result.
     * @implSpec The default implementation will throw a {@link NullPointerException} if the result of
     *           {@link #toString()} is {@code null}.
     */
    @Override
    public default char charAt(final int index) {
        return toString().charAt(index);
    }

}
