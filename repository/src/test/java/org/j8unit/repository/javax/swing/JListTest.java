package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.JList;
import javax.swing.JList.DropLocation;
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
public class JListTest<E>
implements FactoryBasedJ8UnitTest<JList<E>>, JListTests<JList<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JList]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(JList::new);
    }

    @Parameter(0)
    public Callable<JList<E>> sutFactory;

    @Override
    public Callable<JList<E>> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.JList]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.JList]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link DropLocation} (by simply reusing
     * the J8Unit test interface {@link org.j8unit.repository.javax.swing.JListTests.DropLocationTests}).
     */
    @RunWith(J8Unit4.class)
    public static class DropLocationTest
    implements org.j8unit.repository.javax.swing.JListTests.DropLocationTests<DropLocation> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JList$DropLocation]

        @Override
        public DropLocation createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.JList.DropLocation], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.JList$DropLocation]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.JList$DropLocation]

    }

}
