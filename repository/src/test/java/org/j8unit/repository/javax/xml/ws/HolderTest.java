package org.j8unit.repository.javax.xml.ws;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.xml.ws.Holder;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class HolderTest<T>
implements FactoryBasedJ8UnitTest<Holder<T>>, HolderTests<Holder<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.Holder]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(Holder::new);
    }

    @Parameter(0)
    public Callable<Holder<T>> sutFactory;

    @Override
    public Callable<Holder<T>> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.Holder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.Holder]

}
