package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.JEditorPane;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class JEditorPaneTest
implements FactoryBasedJ8UnitTest<JEditorPane>, JEditorPaneTests<JEditorPane> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JEditorPane]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(JEditorPane::new);
    }

    @Parameter(0)
    public Callable<JEditorPane> sutFactory;

    @Override
    public Callable<JEditorPane> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.JEditorPane]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.JEditorPane]

}
