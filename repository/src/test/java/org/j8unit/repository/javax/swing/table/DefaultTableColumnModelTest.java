package org.j8unit.repository.javax.swing.table;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.table.DefaultTableColumnModel;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DefaultTableColumnModelTest
implements FactoryBasedJ8UnitTest<DefaultTableColumnModel>, DefaultTableColumnModelTests<DefaultTableColumnModel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.table.DefaultTableColumnModel]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(DefaultTableColumnModel::new);
    }

    @Parameter(0)
    public Callable<DefaultTableColumnModel> sutFactory;

    @Override
    public Callable<DefaultTableColumnModel> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.table.DefaultTableColumnModel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.table.DefaultTableColumnModel]

}
