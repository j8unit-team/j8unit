package org.j8unit.repository.java.util;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.util.Formatter;
import java.util.Formatter.BigDecimalLayoutForm;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class FormatterTest
implements FactoryBasedJ8UnitTest<Formatter>, org.j8unit.repository.java.util.FormatterTests<Formatter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Formatter]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(Formatter::new);
    }

    @Parameter(0)
    public Callable<Formatter> sutFactory;

    @Override
    public Callable<Formatter> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Formatter]

    @RunWith(J8Unit4.class)
    public static class BigDecimalLayoutFormTest
    implements org.j8unit.repository.java.util.FormatterTests.BigDecimalLayoutFormTests<BigDecimalLayoutForm> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Formatter$BigDecimalLayoutForm]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(BigDecimalLayoutForm.class);
        }

        @Parameter(0)
        public BigDecimalLayoutForm sut;

        @Override
        public BigDecimalLayoutForm createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Formatter$BigDecimalLayoutForm]

    }

}
