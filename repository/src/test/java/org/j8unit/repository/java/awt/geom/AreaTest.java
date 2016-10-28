package org.j8unit.repository.java.awt.geom;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.geom.Area;
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
public class AreaTest
implements FactoryBasedJ8UnitTest<Area>, org.j8unit.repository.java.awt.geom.AreaTests<Area> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.geom.Area]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(Area::new);
    }

    @Parameter(0)
    public Callable<Area> sutFactory;

    @Override
    public Callable<Area> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.geom.Area]

}
