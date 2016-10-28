package org.j8unit.repository.javax.swing.undo;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.undo.AbstractUndoableEdit;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class AbstractUndoableEditTest
implements FactoryBasedJ8UnitTest<AbstractUndoableEdit>, org.j8unit.repository.javax.swing.undo.AbstractUndoableEditTests<AbstractUndoableEdit> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.undo.AbstractUndoableEdit]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(AbstractUndoableEdit::new);
    }

    @Parameter(0)
    public Callable<AbstractUndoableEdit> sutFactory;

    @Override
    public Callable<AbstractUndoableEdit> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.undo.AbstractUndoableEdit]

}
