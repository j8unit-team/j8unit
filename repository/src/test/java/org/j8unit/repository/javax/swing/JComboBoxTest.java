package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.JComboBox;
import javax.swing.JComboBox.KeySelectionManager;
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
public class JComboBoxTest<E>
implements FactoryBasedJ8UnitTest<JComboBox<E>>, org.j8unit.repository.javax.swing.JComboBoxTests<JComboBox<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JComboBox]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(JComboBox::new);
    }

    @Parameter(0)
    public Callable<JComboBox<E>> sutFactory;

    @Override
    public Callable<JComboBox<E>> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.JComboBox]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.JComboBox]

    @RunWith(J8Unit4.class)
    public static class KeySelectionManagerTest
    implements org.j8unit.repository.javax.swing.JComboBoxTests.KeySelectionManagerTests<KeySelectionManager> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JComboBox$KeySelectionManager]

        @Override
        public KeySelectionManager createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.JComboBox.KeySelectionManager], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.JComboBox$KeySelectionManager]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.JComboBox$KeySelectionManager]

    }

}
