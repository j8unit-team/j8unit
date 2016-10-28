package org.j8unit.repository.javax.naming.directory;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.naming.directory.BasicAttributes;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class BasicAttributesTest
implements FactoryBasedJ8UnitTest<BasicAttributes>, org.j8unit.repository.javax.naming.directory.BasicAttributesTests<BasicAttributes> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.directory.BasicAttributes]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(BasicAttributes::new);
    }

    @Parameter(0)
    public Callable<BasicAttributes> sutFactory;

    @Override
    public Callable<BasicAttributes> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.directory.BasicAttributes]

}
