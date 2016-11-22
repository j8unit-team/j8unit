package org.j8unit.repository.javax.swing.plaf.multi;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.plaf.multi.MultiListUI;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class MultiListUITest
implements FactoryBasedJ8UnitTest<MultiListUI>, MultiListUITests<MultiListUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.multi.MultiListUI]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(MultiListUI::new);
    }

    @Parameter(0)
    public Callable<MultiListUI> sutFactory;

    @Override
    public Callable<MultiListUI> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.multi.MultiListUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.multi.MultiListUI]

}
