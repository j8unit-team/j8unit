package org.j8unit.repository.org.omg.CORBA;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.CORBA.PrincipalHolder;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
@SuppressWarnings("deprecation")
public class PrincipalHolderTest
implements FactoryBasedJ8UnitTest<PrincipalHolder>, PrincipalHolderTests<PrincipalHolder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.PrincipalHolder]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(PrincipalHolder::new);
    }

    @Parameter(0)
    public Callable<PrincipalHolder> sutFactory;

    @Override
    public Callable<PrincipalHolder> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.PrincipalHolder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.PrincipalHolder]

}
