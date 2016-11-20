package org.j8unit.repository.javax.swing.plaf.basic;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.plaf.basic.BasicComboBoxRenderer;
import javax.swing.plaf.basic.BasicComboBoxRenderer.UIResource;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.j8unit.util.TestParametersUtil;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@SuppressWarnings("rawtypes")
@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class BasicComboBoxRendererTest
implements FactoryBasedJ8UnitTest, BasicComboBoxRendererTests<BasicComboBoxRenderer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboBoxRenderer]

    // The definition of the SUT factory method must be repeated
    // because of the "rawtypes" nature of the implemented j8unit
    // test interface (caused by the "rawtypes" nature of the type-under-test).
    @Override
    public BasicComboBoxRenderer createNewSUT() {
        final Object sut = FactoryBasedJ8UnitTest.super.createNewSUT();
        assert sut != null;
        assert sut instanceof BasicComboBoxRenderer;
        return (BasicComboBoxRenderer) sut;
    }

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(BasicComboBoxRenderer::new);
    }

    @Parameter(0)
    public Callable<BasicComboBoxRenderer> sutFactory;

    @Override
    public Callable<BasicComboBoxRenderer> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboBoxRenderer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboBoxRenderer]

    @SuppressWarnings("rawtypes")
    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class UIResourceTest
    implements FactoryBasedJ8UnitTest, org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxRendererTests.UIResourceTests<UIResource> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboBoxRenderer$UIResource]

        // The definition of the SUT factory method must be repeated
        // because of the "rawtypes" nature of the implemented j8unit
        // test interface (caused by the "rawtypes" nature of the type-under-test).
        @Override
        public UIResource createNewSUT() {
            final Object sut = FactoryBasedJ8UnitTest.super.createNewSUT();
            assert sut != null;
            assert sut instanceof UIResource;
            return (UIResource) sut;
        }

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return TestParametersUtil.testParametersOf(UIResource::new);
        }

        @Parameter(0)
        public Callable<UIResource> sutFactory;

        @Override
        public Callable<UIResource> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboBoxRenderer$UIResource]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicComboBoxRenderer$UIResource]

    }

}
