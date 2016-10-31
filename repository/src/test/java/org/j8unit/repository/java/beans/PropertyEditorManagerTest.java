package org.j8unit.repository.java.beans;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.beans.PropertyEditorManager;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class PropertyEditorManagerTest
implements FactoryBasedJ8UnitTest<PropertyEditorManager>, org.j8unit.repository.java.beans.PropertyEditorManagerTests<PropertyEditorManager> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.PropertyEditorManager]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(PropertyEditorManager::new);
    }

    @Parameter(0)
    public Callable<PropertyEditorManager> sutFactory;

    @Override
    public Callable<PropertyEditorManager> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.PropertyEditorManager]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.PropertyEditorManager]

}
