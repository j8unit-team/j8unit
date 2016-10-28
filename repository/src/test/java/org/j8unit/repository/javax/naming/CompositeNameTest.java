package org.j8unit.repository.javax.naming;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.naming.CompositeName;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class CompositeNameTest
implements FactoryBasedJ8UnitTest<CompositeName>, org.j8unit.repository.javax.naming.CompositeNameTests<CompositeName> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.CompositeName]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(CompositeName::new);
    }

    @Parameter(0)
    public Callable<CompositeName> sutFactory;

    @Override
    public Callable<CompositeName> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.CompositeName]

}
