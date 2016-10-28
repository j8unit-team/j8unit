package org.j8unit.repository.org.omg.CORBA.ORBPackage;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.CORBA.ORBPackage.InconsistentTypeCode;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class InconsistentTypeCodeTest
implements FactoryBasedJ8UnitTest<InconsistentTypeCode>, org.j8unit.repository.org.omg.CORBA.ORBPackage.InconsistentTypeCodeTests<InconsistentTypeCode> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.ORBPackage.InconsistentTypeCode]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(InconsistentTypeCode::new);
    }

    @Parameter(0)
    public Callable<InconsistentTypeCode> sutFactory;

    @Override
    public Callable<InconsistentTypeCode> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.ORBPackage.InconsistentTypeCode]

}
