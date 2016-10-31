package org.j8unit.repository.java.text;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.text.DecimalFormatSymbols;
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
public class DecimalFormatSymbolsTest
implements FactoryBasedJ8UnitTest<DecimalFormatSymbols>, org.j8unit.repository.java.text.DecimalFormatSymbolsTests<DecimalFormatSymbols> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.DecimalFormatSymbols]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(DecimalFormatSymbols::new);
    }

    @Parameter(0)
    public Callable<DecimalFormatSymbols> sutFactory;

    @Override
    public Callable<DecimalFormatSymbols> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.DecimalFormatSymbols]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.DecimalFormatSymbols]

}
