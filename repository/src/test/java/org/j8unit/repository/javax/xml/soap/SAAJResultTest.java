package org.j8unit.repository.javax.xml.soap;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.xml.soap.SAAJResult;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class SAAJResultTest
implements FactoryBasedJ8UnitTest<SAAJResult>, SAAJResultTests<SAAJResult> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.soap.SAAJResult]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(SAAJResult::new);
    }

    @Parameter(0)
    public Callable<SAAJResult> sutFactory;

    @Override
    public Callable<SAAJResult> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.soap.SAAJResult]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.soap.SAAJResult]

}
