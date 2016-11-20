package org.j8unit.repository.javax.tools;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.tools.DiagnosticCollector;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DiagnosticCollectorTest<S>
implements FactoryBasedJ8UnitTest<DiagnosticCollector<S>>, DiagnosticCollectorTests<DiagnosticCollector<S>, S> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.DiagnosticCollector]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(DiagnosticCollector::new);
    }

    @Parameter(0)
    public Callable<DiagnosticCollector<S>> sutFactory;

    @Override
    public Callable<DiagnosticCollector<S>> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.tools.DiagnosticCollector]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.tools.DiagnosticCollector]

}
