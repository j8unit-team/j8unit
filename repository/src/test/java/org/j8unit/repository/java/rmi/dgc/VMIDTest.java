package org.j8unit.repository.java.rmi.dgc;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.rmi.dgc.VMID;
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
public class VMIDTest
implements FactoryBasedJ8UnitTest<VMID>, org.j8unit.repository.java.rmi.dgc.VMIDTests<VMID> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.dgc.VMID]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(VMID::new);
    }

    @Parameter(0)
    public Callable<VMID> sutFactory;

    @Override
    public Callable<VMID> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.dgc.VMID]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.dgc.VMID]

}
