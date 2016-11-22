package org.j8unit.repository.javax.print.attribute;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.print.attribute.HashDocAttributeSet;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class HashDocAttributeSetTest
implements FactoryBasedJ8UnitTest<HashDocAttributeSet>, HashDocAttributeSetTests<HashDocAttributeSet> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.HashDocAttributeSet]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(HashDocAttributeSet::new);
    }

    @Parameter(0)
    public Callable<HashDocAttributeSet> sutFactory;

    @Override
    public Callable<HashDocAttributeSet> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.HashDocAttributeSet]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.HashDocAttributeSet]

}
