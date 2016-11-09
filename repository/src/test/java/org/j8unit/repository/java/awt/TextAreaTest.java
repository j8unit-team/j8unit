package org.j8unit.repository.java.awt;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.TextArea;
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
public class TextAreaTest
implements FactoryBasedJ8UnitTest<TextArea>, TextAreaTests<TextArea> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.TextArea]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(TextArea::new);
    }

    @Parameter(0)
    public Callable<TextArea> sutFactory;

    @Override
    public Callable<TextArea> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.TextArea]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.TextArea]

}
