package org.j8unit.repository.javax.swing.plaf.metal;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.plaf.metal.DefaultMetalTheme;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DefaultMetalThemeTest
implements FactoryBasedJ8UnitTest<DefaultMetalTheme>, org.j8unit.repository.javax.swing.plaf.metal.DefaultMetalThemeTests<DefaultMetalTheme> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.DefaultMetalTheme]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(DefaultMetalTheme::new);
    }

    @Parameter(0)
    public Callable<DefaultMetalTheme> sutFactory;

    @Override
    public Callable<DefaultMetalTheme> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.DefaultMetalTheme]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.DefaultMetalTheme]

}
