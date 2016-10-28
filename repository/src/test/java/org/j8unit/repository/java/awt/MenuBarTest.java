package org.j8unit.repository.java.awt;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.MenuBar;
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
public class MenuBarTest
implements FactoryBasedJ8UnitTest<MenuBar>, org.j8unit.repository.java.awt.MenuBarTests<MenuBar> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.MenuBar]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(MenuBar::new);
    }

    @Parameter(0)
    public Callable<MenuBar> sutFactory;

    @Override
    public Callable<MenuBar> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.MenuBar]

}
