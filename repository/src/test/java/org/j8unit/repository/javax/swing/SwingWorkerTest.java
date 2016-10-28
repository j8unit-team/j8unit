package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import javax.swing.SwingWorker;
import javax.swing.SwingWorker.StateValue;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class SwingWorkerTest<T, V>
implements org.j8unit.repository.javax.swing.SwingWorkerTests<SwingWorker<T, V>, T, V> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.SwingWorker]

    @Override
    public SwingWorker<T, V> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.SwingWorker], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.SwingWorker]

    @RunWith(J8Unit4.class)
    public static class StateValueTest
    implements org.j8unit.repository.javax.swing.SwingWorkerTests.StateValueTests<StateValue> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.SwingWorker$StateValue]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(StateValue.class);
        }

        @Parameter(0)
        public StateValue sut;

        @Override
        public StateValue createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.SwingWorker$StateValue]

    }

}
