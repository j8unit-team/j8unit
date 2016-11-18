package org.j8unit.repository.javax.management.remote.rmi;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.management.remote.rmi._RMIServer_Stub;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.repository.categories.JavaBug;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class _RMIServer_StubTest
implements FactoryBasedJ8UnitTest<_RMIServer_Stub>, _RMIServer_StubTests<_RMIServer_Stub> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.remote.rmi._RMIServer_Stub]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(_RMIServer_Stub::new);
    }

    @Parameter(0)
    public Callable<_RMIServer_Stub> sutFactory;

    @Override
    public Callable<_RMIServer_Stub> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.remote.rmi._RMIServer_Stub]

    /**
     * @see _RMIServer_StubBugs#hashCodeThrowsAnException() {@code new _RMIServer_Stub().hashCode()} throws
     *      {@code BAD_OPERATION} illegally!
     *
     * @since 0.9.7
     */
    @Test
    @Category(JavaBug.class)
    @Override
    public void hashCodeMustBeConsistent() {
        _RMIServer_StubTests.super.hashCodeMustBeConsistent();
    }

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.remote.rmi._RMIServer_Stub]

}
