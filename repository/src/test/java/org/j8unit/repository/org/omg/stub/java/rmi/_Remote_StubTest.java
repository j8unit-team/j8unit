package org.j8unit.repository.org.omg.stub.java.rmi;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.repository.JavaBug;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.stub.java.rmi._Remote_Stub;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class _Remote_StubTest
implements FactoryBasedJ8UnitTest<_Remote_Stub>, _Remote_StubTests<_Remote_Stub> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.stub.java.rmi._Remote_Stub]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(_Remote_Stub::new);
    }

    @Parameter(0)
    public Callable<_Remote_Stub> sutFactory;

    @Override
    public Callable<_Remote_Stub> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.stub.java.rmi._Remote_Stub]

    /**
     * @see _Remote_StubBugs#hashCodeThrowsAnException() {@code new _Remote_Stub().hashCode()} throws
     *      {@code BAD_OPERATION} illegally!
     *
     * @since 0.9.7
     */
    @Test
    @Category(JavaBug.class)
    @Override
    public void hashCodeMustBeConsistent() {
        _Remote_StubTests.super.hashCodeMustBeConsistent();
    }

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.stub.java.rmi._Remote_Stub]

}
