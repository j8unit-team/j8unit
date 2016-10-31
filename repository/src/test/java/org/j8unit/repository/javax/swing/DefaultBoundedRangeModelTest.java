package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.DefaultBoundedRangeModel;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DefaultBoundedRangeModelTest
implements FactoryBasedJ8UnitTest<DefaultBoundedRangeModel>, org.j8unit.repository.javax.swing.DefaultBoundedRangeModelTests<DefaultBoundedRangeModel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.DefaultBoundedRangeModel]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(DefaultBoundedRangeModel::new);
    }

    @Parameter(0)
    public Callable<DefaultBoundedRangeModel> sutFactory;

    @Override
    public Callable<DefaultBoundedRangeModel> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.DefaultBoundedRangeModel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.DefaultBoundedRangeModel]

}
