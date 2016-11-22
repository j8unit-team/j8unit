package org.j8unit.repository.javax.swing.plaf.multi;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.plaf.multi.MultiSpinnerUI;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class MultiSpinnerUITest
implements FactoryBasedJ8UnitTest<MultiSpinnerUI>, MultiSpinnerUITests<MultiSpinnerUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.multi.MultiSpinnerUI]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(MultiSpinnerUI::new);
    }

    @Parameter(0)
    public Callable<MultiSpinnerUI> sutFactory;

    @Override
    public Callable<MultiSpinnerUI> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.multi.MultiSpinnerUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.multi.MultiSpinnerUI]

}
