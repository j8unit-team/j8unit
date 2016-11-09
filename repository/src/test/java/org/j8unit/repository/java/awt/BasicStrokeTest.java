package org.j8unit.repository.java.awt;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.BasicStroke;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class BasicStrokeTest
implements FactoryBasedJ8UnitTest<BasicStroke>, BasicStrokeTests<BasicStroke> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.BasicStroke]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(BasicStroke::new);
    }

    @Parameter(0)
    public Callable<BasicStroke> sutFactory;

    @Override
    public Callable<BasicStroke> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.BasicStroke]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.BasicStroke]

}
