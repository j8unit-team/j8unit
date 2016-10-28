package org.j8unit.repository.java.beans;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.beans.SimpleBeanInfo;
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
public class SimpleBeanInfoTest
implements FactoryBasedJ8UnitTest<SimpleBeanInfo>, org.j8unit.repository.java.beans.SimpleBeanInfoTests<SimpleBeanInfo> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.SimpleBeanInfo]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(SimpleBeanInfo::new);
    }

    @Parameter(0)
    public Callable<SimpleBeanInfo> sutFactory;

    @Override
    public Callable<SimpleBeanInfo> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.SimpleBeanInfo]

}
