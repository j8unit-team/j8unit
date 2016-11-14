package org.j8unit.repository.javax.management.relation;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.management.relation.InvalidRoleInfoException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class InvalidRoleInfoExceptionTest
implements FactoryBasedJ8UnitTest<InvalidRoleInfoException>, InvalidRoleInfoExceptionTests<InvalidRoleInfoException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.relation.InvalidRoleInfoException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(InvalidRoleInfoException::new);
    }

    @Parameter(0)
    public Callable<InvalidRoleInfoException> sutFactory;

    @Override
    public Callable<InvalidRoleInfoException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.relation.InvalidRoleInfoException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.relation.InvalidRoleInfoException]

}
