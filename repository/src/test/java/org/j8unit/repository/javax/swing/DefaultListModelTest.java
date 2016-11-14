package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.DefaultListModel;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DefaultListModelTest<E>
implements FactoryBasedJ8UnitTest<DefaultListModel<E>>, DefaultListModelTests<DefaultListModel<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.DefaultListModel]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(DefaultListModel::new);
    }

    @Parameter(0)
    public Callable<DefaultListModel<E>> sutFactory;

    @Override
    public Callable<DefaultListModel<E>> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.DefaultListModel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.DefaultListModel]

}
