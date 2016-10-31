package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.SpringLayout;
import javax.swing.SpringLayout.Constraints;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.j8unit.util.TestParametersUtil;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class SpringLayoutTest
implements FactoryBasedJ8UnitTest<SpringLayout>, org.j8unit.repository.javax.swing.SpringLayoutTests<SpringLayout> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.SpringLayout]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(SpringLayout::new);
    }

    @Parameter(0)
    public Callable<SpringLayout> sutFactory;

    @Override
    public Callable<SpringLayout> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.SpringLayout]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.SpringLayout]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class ConstraintsTest
    implements FactoryBasedJ8UnitTest<Constraints>, org.j8unit.repository.javax.swing.SpringLayoutTests.ConstraintsTests<Constraints> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.SpringLayout$Constraints]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(Constraints::new);
        }

        @Parameter(0)
        public Callable<Constraints> sutFactory;

        @Override
        public Callable<Constraints> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.SpringLayout$Constraints]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.SpringLayout$Constraints]

    }

}
