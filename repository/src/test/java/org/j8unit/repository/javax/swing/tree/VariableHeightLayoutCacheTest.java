package org.j8unit.repository.javax.swing.tree;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.tree.VariableHeightLayoutCache;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class VariableHeightLayoutCacheTest
implements FactoryBasedJ8UnitTest<VariableHeightLayoutCache>, VariableHeightLayoutCacheTests<VariableHeightLayoutCache> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.tree.VariableHeightLayoutCache]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(VariableHeightLayoutCache::new);
    }

    @Parameter(0)
    public Callable<VariableHeightLayoutCache> sutFactory;

    @Override
    public Callable<VariableHeightLayoutCache> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.tree.VariableHeightLayoutCache]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.tree.VariableHeightLayoutCache]

}
