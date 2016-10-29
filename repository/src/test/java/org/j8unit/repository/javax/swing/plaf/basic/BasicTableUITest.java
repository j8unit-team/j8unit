package org.j8unit.repository.javax.swing.plaf.basic;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.plaf.basic.BasicTableUI;
import javax.swing.plaf.basic.BasicTableUI.FocusHandler;
import javax.swing.plaf.basic.BasicTableUI.KeyHandler;
import javax.swing.plaf.basic.BasicTableUI.MouseInputHandler;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class BasicTableUITest
implements FactoryBasedJ8UnitTest<BasicTableUI>, org.j8unit.repository.javax.swing.plaf.basic.BasicTableUITests<BasicTableUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTableUI]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(BasicTableUI::new);
    }

    @Parameter(0)
    public Callable<BasicTableUI> sutFactory;

    @Override
    public Callable<BasicTableUI> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTableUI]

    @RunWith(J8Unit4.class)
    public static class FocusHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTableUITests.FocusHandlerTests<FocusHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTableUI$FocusHandler]

        @Override
        public FocusHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTableUI.FocusHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTableUI$FocusHandler]

    }

    @RunWith(J8Unit4.class)
    public static class MouseInputHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTableUITests.MouseInputHandlerTests<MouseInputHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTableUI$MouseInputHandler]

        @Override
        public MouseInputHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTableUI.MouseInputHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTableUI$MouseInputHandler]

    }

    @RunWith(J8Unit4.class)
    public static class KeyHandlerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTableUITests.KeyHandlerTests<KeyHandler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTableUI$KeyHandler]

        @Override
        public KeyHandler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicTableUI.KeyHandler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicTableUI$KeyHandler]

    }

}
