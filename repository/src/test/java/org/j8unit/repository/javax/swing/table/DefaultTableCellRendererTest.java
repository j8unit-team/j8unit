package org.j8unit.repository.javax.swing.table;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableCellRenderer.UIResource;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.j8unit.util.TestParametersUtil;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DefaultTableCellRendererTest
implements FactoryBasedJ8UnitTest<DefaultTableCellRenderer>, DefaultTableCellRendererTests<DefaultTableCellRenderer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.table.DefaultTableCellRenderer]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(DefaultTableCellRenderer::new);
    }

    @Parameter(0)
    public Callable<DefaultTableCellRenderer> sutFactory;

    @Override
    public Callable<DefaultTableCellRenderer> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.table.DefaultTableCellRenderer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.table.DefaultTableCellRenderer]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class UIResourceTest
    implements FactoryBasedJ8UnitTest<UIResource>, org.j8unit.repository.javax.swing.table.DefaultTableCellRendererTests.UIResourceTests<UIResource> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.table.DefaultTableCellRenderer$UIResource]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(UIResource::new);
        }

        @Parameter(0)
        public Callable<UIResource> sutFactory;

        @Override
        public Callable<UIResource> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.table.DefaultTableCellRenderer$UIResource]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.table.DefaultTableCellRenderer$UIResource]

    }

}
