package org.j8unit;

/**
 * <p>
 * Default implementation of the {@link CharSequence} interface by simply reusing the result of {@link #toString()}.
 *
 * Its main intention is to allow small fail message enumerations to be used in conjunction with the assertion methods
 * of {@link Assert}:
 *
 * <pre class="brush:java">
 * package mypackage;
 * import static mypackage.MyTest.FailMessages.NULL;
 * import static org.j8unit.Assert.*;
 * import org.junit.Test;
 *
 * public class MyTest {
 *
 *     static enum FailMessages
 *     implements ToStringBasedCharSequence {
 *         NULL("illegal null string"),
 *         LENGTH("string has illegal length"),
 *         INVALID("malformed java identifier string");
 *         // ... FURTHER FAIL MESSAGES HERE ...;
 *
 *         private final String msg;
 *         private FailMessages(final String msg) { this.msg = msg; }
 *         public String toString() { return this.msg; }
 *     }
 *
 *     &#64;Test
 *     public void testNotNullString()
 *     throws Exception {
 *         final String s = "...";
 *         assertNotNull(NULL, s);
 *     }
 *
 *     // ... FURTHER TESTS HERE ...
 *
 * }
 * </pre>
 * </p>
 *
 * @since 4.12.1
 */
public abstract interface ToStringBasedCharSequence
extends CharSequence {

    /**
     * @implSpec The default implementation refers to {@link String#subSequence(int, int)} of the {@link #toString()}
     *           result.
     * @implSpec The default implementation will throw a {@link NullPointerException} if the result of
     *           {@link #toString()} is {@code null}.
     */
    @Override
    public default CharSequence subSequence(final int start, final int end) {
        return this.toString().subSequence(start, end);
    }

    /**
     * @implSpec The default implementation refers to {@link String#length()} of the {@link #toString()} result.
     * @implSpec The default implementation will throw a {@link NullPointerException} if the result of
     *           {@link #toString()} is {@code null}.
     */
    @Override
    public default int length() {
        return this.toString().length();
    }

    /**
     * @implSpec The default implementation refers to {@link String#charAt(int)} of the {@link #toString()} result.
     * @implSpec The default implementation will throw a {@link NullPointerException} if the result of
     *           {@link #toString()} is {@code null}.
     */
    @Override
    public default char charAt(final int index) {
        return this.toString().charAt(index);
    }

}
