package org.j8unit.runners;

import org.j8unit.runners.model.J8TestClass;
import org.junit.runners.model.InitializationError;

/**
 * Aliases the current default J8Unit {@code class} {@linkplain org.junit.runner.Runner runner}, for future-proofing.
 * Right now, the default J8Unit {@linkplain org.junit.runner.Runner runner} aliases {@link J8BlockJUnit4ClassRunner}.
 *
 * If future versions of J8Unit change the default {@linkplain org.junit.runner.Runner runner} {@code class}, they will
 * also change the definition of this {@code class}. Thus, developers should not assume any specific behaviour of this
 * {@linkplain org.junit.runner.Runner runner}. Instead, the required {@linkplain org.junit.runner.Runner runner} should
 * be used directly.
 *
 * To invoke the default J8Unit {@linkplain org.junit.runner.Runner runner} just use the {@link org.junit.runner.RunWith
 * &#64;RunWith} annotation:
 *
 * <pre>
 * &#064;RunWith(J8Unit4.class)
 * public class FoobarTest {
 *     [&hellip;]
 * }
 * </pre>
 *
 * @see org.junit.runner.RunWith
 * @see J8TestClass
 *
 * @since 4.12
 */
public class J8Unit4
extends J8BlockJUnit4ClassRunner {

    /**
     * Constructs a new instance of the default J8Unit runner.
     *
     * @param clazz
     *            the test class
     * @throws InitializationError
     *             if the test class is malformed
     */
    public J8Unit4(final Class<?> clazz)
    throws InitializationError {
        super(clazz);
    }
}
