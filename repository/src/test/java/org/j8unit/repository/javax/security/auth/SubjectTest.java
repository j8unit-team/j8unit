package org.j8unit.repository.javax.security.auth;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.security.auth.Subject;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class SubjectTest
implements FactoryBasedJ8UnitTest<Subject>, org.j8unit.repository.javax.security.auth.SubjectTests<Subject> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.Subject]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(Subject::new);
    }

    @Parameter(0)
    public Callable<Subject> sutFactory;

    @Override
    public Callable<Subject> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.auth.Subject]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.auth.Subject]

}
