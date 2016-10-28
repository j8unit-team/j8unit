package org.j8unit.repository.javax.swing.table;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.table.DefaultTableModel;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DefaultTableModelTest
implements FactoryBasedJ8UnitTest<DefaultTableModel>, org.j8unit.repository.javax.swing.table.DefaultTableModelTests<DefaultTableModel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.table.DefaultTableModel]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(DefaultTableModel::new);
    }

    @Parameter(0)
    public Callable<DefaultTableModel> sutFactory;

    @Override
    public Callable<DefaultTableModel> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.table.DefaultTableModel]

}
