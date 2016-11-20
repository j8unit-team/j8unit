package org.j8unit.repository.org.omg.CORBA;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.CORBA.CompletionStatus;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CompletionStatus} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.CompletionStatusTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class CompletionStatusTest
implements CompletionStatusTests<CompletionStatus> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.CompletionStatus]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(CompletionStatus.COMPLETED_YES, //
                                CompletionStatus.COMPLETED_NO, //
                                CompletionStatus.COMPLETED_MAYBE);
    }

    @Parameter(0)
    public CompletionStatus sut;

    @Override
    public CompletionStatus createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.CompletionStatus]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.CompletionStatus]

}
