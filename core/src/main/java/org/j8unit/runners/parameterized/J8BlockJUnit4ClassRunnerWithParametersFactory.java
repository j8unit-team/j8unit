package org.j8unit.runners.parameterized;

import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.model.J8TestClass;
import org.junit.runner.Runner;
import org.junit.runners.model.InitializationError;
import org.junit.runners.parameterized.BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runners.parameterized.ParametersRunnerFactory;
import org.junit.runners.parameterized.TestWithParameters;

/**
 * <p>
 * A {@link ParametersRunnerFactory} that creates {@link J8BlockJUnit4ClassRunnerWithParameters}. This factory is
 * intended to be used in addition to {@link J8Parameterized}:
 * </p>
 *
 * <pre class="brush:java">
 * &#064;RunWith(J8Parameterized.class)
 * &#064;UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
 * public class FoobarTest {
 *     [&hellip;]
 * }
 * </pre>
 *
 * @since 4.12
 */
public class J8BlockJUnit4ClassRunnerWithParametersFactory
extends BlockJUnit4ClassRunnerWithParametersFactory {

    /**
     * {@inheritDoc}
     *
     * <p>
     * In order to support {@code default} {@link org.junit.Test &#64;Test} annotated {@code default} methods
     * implemented {@code interface}s, the {@linkplain Runner test runner} returned by this method uses
     * {@link J8TestClass} internally.
     * </p>
     */
    @Override
    public J8BlockJUnit4ClassRunnerWithParameters createRunnerForTestWithParameters(final TestWithParameters test)
    throws InitializationError {
        return new J8BlockJUnit4ClassRunnerWithParameters(test);
    }

}
