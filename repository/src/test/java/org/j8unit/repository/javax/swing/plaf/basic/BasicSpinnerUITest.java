package org.j8unit.repository.javax.swing.plaf.basic;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.plaf.basic.BasicSpinnerUI;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class BasicSpinnerUITest
implements FactoryBasedJ8UnitTest<BasicSpinnerUI>, BasicSpinnerUITests<BasicSpinnerUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicSpinnerUI]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(BasicSpinnerUI::new);
    }

    @Parameter(0)
    public Callable<BasicSpinnerUI> sutFactory;

    @Override
    public Callable<BasicSpinnerUI> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicSpinnerUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicSpinnerUI]

}
