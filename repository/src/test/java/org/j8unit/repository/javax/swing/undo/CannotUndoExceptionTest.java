package org.j8unit.repository.javax.swing.undo;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.undo.CannotUndoException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class CannotUndoExceptionTest
implements FactoryBasedJ8UnitTest<CannotUndoException>, org.j8unit.repository.javax.swing.undo.CannotUndoExceptionTests<CannotUndoException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.undo.CannotUndoException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(CannotUndoException::new);
    }

    @Parameter(0)
    public Callable<CannotUndoException> sutFactory;

    @Override
    public Callable<CannotUndoException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.undo.CannotUndoException]

}
