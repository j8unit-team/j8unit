package org.j8unit.repository.javax.swing.plaf.multi;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.plaf.multi.MultiDesktopIconUI;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class MultiDesktopIconUITest
implements FactoryBasedJ8UnitTest<MultiDesktopIconUI>, MultiDesktopIconUITests<MultiDesktopIconUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.multi.MultiDesktopIconUI]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(MultiDesktopIconUI::new);
    }

    @Parameter(0)
    public Callable<MultiDesktopIconUI> sutFactory;

    @Override
    public Callable<MultiDesktopIconUI> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.multi.MultiDesktopIconUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.multi.MultiDesktopIconUI]

}
