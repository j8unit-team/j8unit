package org.j8unit.repository.javax.swing.colorchooser;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.colorchooser.DefaultColorSelectionModel;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DefaultColorSelectionModelTest
implements FactoryBasedJ8UnitTest<DefaultColorSelectionModel>,
org.j8unit.repository.javax.swing.colorchooser.DefaultColorSelectionModelTests<DefaultColorSelectionModel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.colorchooser.DefaultColorSelectionModel]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(DefaultColorSelectionModel::new);
    }

    @Parameter(0)
    public Callable<DefaultColorSelectionModel> sutFactory;

    @Override
    public Callable<DefaultColorSelectionModel> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.colorchooser.DefaultColorSelectionModel]

}
