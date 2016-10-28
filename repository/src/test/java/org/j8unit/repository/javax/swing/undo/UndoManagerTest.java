package org.j8unit.repository.javax.swing.undo;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.undo.UndoManager;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class UndoManagerTest
implements FactoryBasedJ8UnitTest<UndoManager>, org.j8unit.repository.javax.swing.undo.UndoManagerTests<UndoManager> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.undo.UndoManager]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(UndoManager::new);
    }

    @Parameter(0)
    public Callable<UndoManager> sutFactory;

    @Override
    public Callable<UndoManager> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.undo.UndoManager]

}
