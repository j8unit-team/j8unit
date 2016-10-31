package org.j8unit.repository.java.awt;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.GridBagLayout;
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
public class GridBagLayoutTest
implements FactoryBasedJ8UnitTest<GridBagLayout>, org.j8unit.repository.java.awt.GridBagLayoutTests<GridBagLayout> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.GridBagLayout]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(GridBagLayout::new);
    }

    @Parameter(0)
    public Callable<GridBagLayout> sutFactory;

    @Override
    public Callable<GridBagLayout> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.GridBagLayout]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.GridBagLayout]

}
