package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.ScrollPaneLayout;
import javax.swing.ScrollPaneLayout.UIResource;
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
public class ScrollPaneLayoutTest
implements FactoryBasedJ8UnitTest<ScrollPaneLayout>, org.j8unit.repository.javax.swing.ScrollPaneLayoutTests<ScrollPaneLayout> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.ScrollPaneLayout]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ScrollPaneLayout::new);
    }

    @Parameter(0)
    public Callable<ScrollPaneLayout> sutFactory;

    @Override
    public Callable<ScrollPaneLayout> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.ScrollPaneLayout]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.ScrollPaneLayout]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class UIResourceTest
    implements FactoryBasedJ8UnitTest<UIResource>, org.j8unit.repository.javax.swing.ScrollPaneLayoutTests.UIResourceTests<UIResource> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.ScrollPaneLayout$UIResource]

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

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.ScrollPaneLayout$UIResource]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.ScrollPaneLayout$UIResource]

    }

}
