package org.j8unit.repository.java.awt;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.GridLayout;
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
public class GridLayoutTest
implements FactoryBasedJ8UnitTest<GridLayout>, GridLayoutTests<GridLayout> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.GridLayout]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(GridLayout::new);
    }

    @Parameter(0)
    public Callable<GridLayout> sutFactory;

    @Override
    public Callable<GridLayout> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.GridLayout]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.GridLayout]

}
