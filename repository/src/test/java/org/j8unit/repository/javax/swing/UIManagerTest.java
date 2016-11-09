package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
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
public class UIManagerTest
implements FactoryBasedJ8UnitTest<UIManager>, UIManagerTests<UIManager> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.UIManager]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(UIManager::new);
    }

    @Parameter(0)
    public Callable<UIManager> sutFactory;

    @Override
    public Callable<UIManager> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.UIManager]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.UIManager]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link LookAndFeelInfo} (by simply
     * reusing the J8Unit test interface {@link LookAndFeelInfoTests}).
     */

    @RunWith(J8Unit4.class)
    public static class LookAndFeelInfoTest
    implements LookAndFeelInfoTests<LookAndFeelInfo> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.UIManager$LookAndFeelInfo]

        @Override
        public LookAndFeelInfo createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.UIManager.LookAndFeelInfo], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.UIManager$LookAndFeelInfo]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.UIManager$LookAndFeelInfo]

    }

}
