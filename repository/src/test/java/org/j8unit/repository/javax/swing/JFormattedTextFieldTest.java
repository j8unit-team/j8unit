package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.JFormattedTextField;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JFormattedTextField.AbstractFormatterFactory;
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
public class JFormattedTextFieldTest
implements FactoryBasedJ8UnitTest<JFormattedTextField>, org.j8unit.repository.javax.swing.JFormattedTextFieldTests<JFormattedTextField> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JFormattedTextField]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(JFormattedTextField::new);
    }

    @Parameter(0)
    public Callable<JFormattedTextField> sutFactory;

    @Override
    public Callable<JFormattedTextField> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JFormattedTextField]

    @RunWith(J8Unit4.class)
    public static class AbstractFormatterFactoryTest
    implements org.j8unit.repository.javax.swing.JFormattedTextFieldTests.AbstractFormatterFactoryTests<AbstractFormatterFactory> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JFormattedTextField$AbstractFormatterFactory]

        @Override
        public AbstractFormatterFactory createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.JFormattedTextField.AbstractFormatterFactory], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JFormattedTextField$AbstractFormatterFactory]

    }

    @RunWith(J8Unit4.class)
    public static class AbstractFormatterTest
    implements org.j8unit.repository.javax.swing.JFormattedTextFieldTests.AbstractFormatterTests<AbstractFormatter> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JFormattedTextField$AbstractFormatter]

        @Override
        public AbstractFormatter createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.JFormattedTextField.AbstractFormatter], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JFormattedTextField$AbstractFormatter]

    }

}
