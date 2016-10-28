package org.j8unit.repository.java.rmi.server;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.rmi.server.ObjID;
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
public class ObjIDTest
implements FactoryBasedJ8UnitTest<ObjID>, org.j8unit.repository.java.rmi.server.ObjIDTests<ObjID> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.ObjID]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ObjID::new);
    }

    @Parameter(0)
    public Callable<ObjID> sutFactory;

    @Override
    public Callable<ObjID> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.ObjID]

}
