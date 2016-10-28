package org.j8unit.repository.javax.swing.plaf;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.Component;
import java.util.concurrent.Callable;
import javax.swing.plaf.LayerUI;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class LayerUITest<V extends Component>
implements FactoryBasedJ8UnitTest<LayerUI<V>>, org.j8unit.repository.javax.swing.plaf.LayerUITests<LayerUI<V>, V> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.LayerUI]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(LayerUI::new);
    }

    @Parameter(0)
    public Callable<LayerUI<V>> sutFactory;

    @Override
    public Callable<LayerUI<V>> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.LayerUI]

}
