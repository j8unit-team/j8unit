package org.j8unit.repository.java.util;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class FormatterTest
implements org.j8unit.repository.java.util.FormatterTests<java.util.Formatter> {

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class BigDecimalLayoutFormTest
    implements org.j8unit.repository.java.util.FormatterTests.BigDecimalLayoutFormTests<java.util.Formatter.BigDecimalLayoutForm> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(java.util.Formatter.BigDecimalLayoutForm.class);
        }

        @Parameter(0)
        public java.util.Formatter.BigDecimalLayoutForm sut;

        @Override
        public java.util.Formatter.BigDecimalLayoutForm createNewSUT() {
            return this.sut;
        }

    }

    @Override
    public java.util.Formatter createNewSUT() {
        return new java.util.Formatter();
    }

}
