package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.JSpinner;
import javax.swing.JSpinner.DateEditor;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.JSpinner.ListEditor;
import javax.swing.JSpinner.NumberEditor;
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
public class JSpinnerTest
implements FactoryBasedJ8UnitTest<JSpinner>, JSpinnerTests<JSpinner> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JSpinner]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(JSpinner::new);
    }

    @Parameter(0)
    public Callable<JSpinner> sutFactory;

    @Override
    public Callable<JSpinner> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.JSpinner]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.JSpinner]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link DateEditor} (by simply reusing
     * the J8Unit test interface {@link org.j8unit.repository.javax.swing.JSpinnerTests.DateEditorTests}).
     */

    @RunWith(J8Unit4.class)
    public static class DateEditorTest
    implements DateEditorTests<DateEditor> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JSpinner$DateEditor]

        @Override
        public DateEditor createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.JSpinner.DateEditor], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.JSpinner$DateEditor]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.JSpinner$DateEditor]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link NumberEditor} (by simply reusing
     * the J8Unit test interface {@link org.j8unit.repository.javax.swing.JSpinnerTests.NumberEditorTests}).
     */

    @RunWith(J8Unit4.class)
    public static class NumberEditorTest
    implements NumberEditorTests<NumberEditor> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JSpinner$NumberEditor]

        @Override
        public NumberEditor createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.JSpinner.NumberEditor], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.JSpinner$NumberEditor]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.JSpinner$NumberEditor]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link DefaultEditor} (by simply reusing
     * the J8Unit test interface {@link org.j8unit.repository.javax.swing.JSpinnerTests.DefaultEditorTests}).
     */

    @RunWith(J8Unit4.class)
    public static class DefaultEditorTest
    implements DefaultEditorTests<DefaultEditor> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JSpinner$DefaultEditor]

        @Override
        public DefaultEditor createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.JSpinner.DefaultEditor], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.JSpinner$DefaultEditor]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.JSpinner$DefaultEditor]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link ListEditor} (by simply reusing
     * the J8Unit test interface {@link org.j8unit.repository.javax.swing.JSpinnerTests.ListEditorTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ListEditorTest
    implements ListEditorTests<ListEditor> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JSpinner$ListEditor]

        @Override
        public ListEditor createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.JSpinner.ListEditor], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.JSpinner$ListEditor]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.JSpinner$ListEditor]

    }

}
