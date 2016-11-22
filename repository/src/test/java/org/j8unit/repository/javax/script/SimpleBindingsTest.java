package org.j8unit.repository.javax.script;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.script.SimpleBindings;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class SimpleBindingsTest
implements FactoryBasedJ8UnitTest<SimpleBindings>, SimpleBindingsTests<SimpleBindings> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.script.SimpleBindings]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(SimpleBindings::new);
    }

    @Parameter(0)
    public Callable<SimpleBindings> sutFactory;

    @Override
    public Callable<SimpleBindings> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.script.SimpleBindings]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.script.SimpleBindings]

}
