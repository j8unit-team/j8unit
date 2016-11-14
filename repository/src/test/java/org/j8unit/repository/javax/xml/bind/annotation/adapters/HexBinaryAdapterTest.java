package org.j8unit.repository.javax.xml.bind.annotation.adapters;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class HexBinaryAdapterTest
implements FactoryBasedJ8UnitTest<HexBinaryAdapter>, HexBinaryAdapterTests<HexBinaryAdapter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.adapters.HexBinaryAdapter]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(HexBinaryAdapter::new);
    }

    @Parameter(0)
    public Callable<HexBinaryAdapter> sutFactory;

    @Override
    public Callable<HexBinaryAdapter> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.annotation.adapters.HexBinaryAdapter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.annotation.adapters.HexBinaryAdapter]

}
