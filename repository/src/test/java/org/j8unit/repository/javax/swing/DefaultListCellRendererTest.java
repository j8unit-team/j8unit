package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListCellRenderer.UIResource;
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
public class DefaultListCellRendererTest
implements FactoryBasedJ8UnitTest<DefaultListCellRenderer>, org.j8unit.repository.javax.swing.DefaultListCellRendererTests<DefaultListCellRenderer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.DefaultListCellRenderer]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(DefaultListCellRenderer::new);
    }

    @Parameter(0)
    public Callable<DefaultListCellRenderer> sutFactory;

    @Override
    public Callable<DefaultListCellRenderer> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.DefaultListCellRenderer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.DefaultListCellRenderer]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class UIResourceTest
    implements FactoryBasedJ8UnitTest<UIResource>, org.j8unit.repository.javax.swing.DefaultListCellRendererTests.UIResourceTests<UIResource> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.DefaultListCellRenderer$UIResource]

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

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.DefaultListCellRenderer$UIResource]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.DefaultListCellRenderer$UIResource]

    }

}
