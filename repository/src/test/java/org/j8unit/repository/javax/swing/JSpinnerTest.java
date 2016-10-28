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
implements FactoryBasedJ8UnitTest<JSpinner>, org.j8unit.repository.javax.swing.JSpinnerTests<JSpinner> {

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

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JSpinner]

    @RunWith(J8Unit4.class)
    public static class NumberEditorTest
    implements org.j8unit.repository.javax.swing.JSpinnerTests.NumberEditorTests<NumberEditor> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JSpinner$NumberEditor]

        @Override
        public NumberEditor createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.JSpinner.NumberEditor], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JSpinner$NumberEditor]

    }

    @RunWith(J8Unit4.class)
    public static class DefaultEditorTest
    implements org.j8unit.repository.javax.swing.JSpinnerTests.DefaultEditorTests<DefaultEditor> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JSpinner$DefaultEditor]

        @Override
        public DefaultEditor createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.JSpinner.DefaultEditor], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JSpinner$DefaultEditor]

    }

    @RunWith(J8Unit4.class)
    public static class ListEditorTest
    implements org.j8unit.repository.javax.swing.JSpinnerTests.ListEditorTests<ListEditor> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JSpinner$ListEditor]

        @Override
        public ListEditor createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.JSpinner.ListEditor], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JSpinner$ListEditor]

    }

    @RunWith(J8Unit4.class)
    public static class DateEditorTest
    implements org.j8unit.repository.javax.swing.JSpinnerTests.DateEditorTests<DateEditor> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JSpinner$DateEditor]

        @Override
        public DateEditor createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.JSpinner.DateEditor], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JSpinner$DateEditor]

    }

}
