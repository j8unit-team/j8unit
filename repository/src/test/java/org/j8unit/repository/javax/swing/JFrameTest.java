package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.JFrame;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class JFrameTest
implements FactoryBasedJ8UnitTest<JFrame>, org.j8unit.repository.javax.swing.JFrameTests<JFrame> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JFrame]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(JFrame::new);
    }

    @Parameter(0)
    public Callable<JFrame> sutFactory;

    @Override
    public Callable<JFrame> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.JFrame]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.JFrame]

}
