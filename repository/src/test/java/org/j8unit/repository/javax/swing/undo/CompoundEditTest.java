package org.j8unit.repository.javax.swing.undo;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.undo.CompoundEdit;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class CompoundEditTest
implements FactoryBasedJ8UnitTest<CompoundEdit>, org.j8unit.repository.javax.swing.undo.CompoundEditTests<CompoundEdit> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.undo.CompoundEdit]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(CompoundEdit::new);
    }

    @Parameter(0)
    public Callable<CompoundEdit> sutFactory;

    @Override
    public Callable<CompoundEdit> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.undo.CompoundEdit]

}
