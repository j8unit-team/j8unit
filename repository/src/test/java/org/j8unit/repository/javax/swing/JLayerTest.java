package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.Component;
import java.util.concurrent.Callable;
import javax.swing.JLayer;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class JLayerTest<V extends Component>
implements FactoryBasedJ8UnitTest<JLayer<V>>, JLayerTests<JLayer<V>, V> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JLayer]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(JLayer::new);
    }

    @Parameter(0)
    public Callable<JLayer<V>> sutFactory;

    @Override
    public Callable<JLayer<V>> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.JLayer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.JLayer]

}
