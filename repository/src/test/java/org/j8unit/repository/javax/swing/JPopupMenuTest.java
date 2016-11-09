package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.JPopupMenu;
import javax.swing.JPopupMenu.Separator;
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
public class JPopupMenuTest
implements FactoryBasedJ8UnitTest<JPopupMenu>, JPopupMenuTests<JPopupMenu> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JPopupMenu]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(JPopupMenu::new);
    }

    @Parameter(0)
    public Callable<JPopupMenu> sutFactory;

    @Override
    public Callable<JPopupMenu> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.JPopupMenu]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.JPopupMenu]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class SeparatorTest
    implements FactoryBasedJ8UnitTest<Separator>, org.j8unit.repository.javax.swing.JPopupMenuTests.SeparatorTests<Separator> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JPopupMenu$Separator]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(Separator::new);
        }

        @Parameter(0)
        public Callable<Separator> sutFactory;

        @Override
        public Callable<Separator> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.JPopupMenu$Separator]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.JPopupMenu$Separator]

    }

}
