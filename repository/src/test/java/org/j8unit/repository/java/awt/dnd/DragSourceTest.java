package org.j8unit.repository.java.awt.dnd;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.dnd.DragSource;
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
public class DragSourceTest
implements FactoryBasedJ8UnitTest<DragSource>, DragSourceTests<DragSource> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.dnd.DragSource]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(DragSource::new);
    }

    @Parameter(0)
    public Callable<DragSource> sutFactory;

    @Override
    public Callable<DragSource> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.dnd.DragSource]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.dnd.DragSource]

}
