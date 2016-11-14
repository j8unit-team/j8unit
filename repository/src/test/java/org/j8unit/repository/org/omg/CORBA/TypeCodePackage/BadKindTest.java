package org.j8unit.repository.org.omg.CORBA.TypeCodePackage;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.CORBA.TypeCodePackage.BadKind;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class BadKindTest
implements FactoryBasedJ8UnitTest<BadKind>, BadKindTests<BadKind> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.TypeCodePackage.BadKind]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(BadKind::new);
    }

    @Parameter(0)
    public Callable<BadKind> sutFactory;

    @Override
    public Callable<BadKind> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.TypeCodePackage.BadKind]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.TypeCodePackage.BadKind]

}
