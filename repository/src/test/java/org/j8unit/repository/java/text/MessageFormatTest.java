package org.j8unit.repository.java.text;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class MessageFormatTest
implements org.j8unit.repository.java.text.MessageFormatTests<java.text.MessageFormat> {

    @Override
    public java.text.MessageFormat createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.text.MessageFormat] available.");
    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class FieldTest
    implements org.j8unit.repository.java.text.MessageFormatTests.FieldTests<java.text.MessageFormat.Field> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(java.text.MessageFormat.Field.ARGUMENT);
        }

        @Parameter(0)
        public java.text.MessageFormat.Field sut;

        @Override
        public java.text.MessageFormat.Field createNewSUT() {
            return this.sut;
        }

    }

}
