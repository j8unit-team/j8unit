package org.j8unit.repository.javax.swing.undo;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.undo.CannotRedoException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class CannotRedoExceptionTest
implements FactoryBasedJ8UnitTest<CannotRedoException>, CannotRedoExceptionTests<CannotRedoException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.undo.CannotRedoException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(CannotRedoException::new);
    }

    @Parameter(0)
    public Callable<CannotRedoException> sutFactory;

    @Override
    public Callable<CannotRedoException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.undo.CannotRedoException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.undo.CannotRedoException]

}
