package org.j8unit.repository.javax.swing.plaf.metal;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.plaf.metal.MetalPopupMenuSeparatorUI;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class MetalPopupMenuSeparatorUITest
implements FactoryBasedJ8UnitTest<MetalPopupMenuSeparatorUI>,
org.j8unit.repository.javax.swing.plaf.metal.MetalPopupMenuSeparatorUITests<MetalPopupMenuSeparatorUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalPopupMenuSeparatorUI]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(MetalPopupMenuSeparatorUI::new);
    }

    @Parameter(0)
    public Callable<MetalPopupMenuSeparatorUI> sutFactory;

    @Override
    public Callable<MetalPopupMenuSeparatorUI> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalPopupMenuSeparatorUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalPopupMenuSeparatorUI]

}
