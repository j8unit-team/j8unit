package org.j8unit.repository.java.text;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.text.DateFormatSymbols;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DateFormatSymbolsTest
implements FactoryBasedJ8UnitTest<DateFormatSymbols>, DateFormatSymbolsTests<DateFormatSymbols> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.DateFormatSymbols]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(DateFormatSymbols::new);
    }

    @Parameter(0)
    public Callable<DateFormatSymbols> sutFactory;

    @Override
    public Callable<DateFormatSymbols> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.DateFormatSymbols]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.DateFormatSymbols]

}