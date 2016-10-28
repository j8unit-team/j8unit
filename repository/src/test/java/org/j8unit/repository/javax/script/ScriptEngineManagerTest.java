package org.j8unit.repository.javax.script;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.script.ScriptEngineManager;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ScriptEngineManagerTest
implements FactoryBasedJ8UnitTest<ScriptEngineManager>, org.j8unit.repository.javax.script.ScriptEngineManagerTests<ScriptEngineManager> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.script.ScriptEngineManager]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ScriptEngineManager::new);
    }

    @Parameter(0)
    public Callable<ScriptEngineManager> sutFactory;

    @Override
    public Callable<ScriptEngineManager> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.script.ScriptEngineManager]

}
