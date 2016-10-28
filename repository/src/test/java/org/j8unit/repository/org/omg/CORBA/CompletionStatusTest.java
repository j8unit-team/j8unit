package org.j8unit.repository.org.omg.CORBA;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.omg.CORBA.CompletionStatus;

@RunWith(J8Unit4.class)
public class CompletionStatusTest
implements org.j8unit.repository.org.omg.CORBA.CompletionStatusTests<CompletionStatus> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.CompletionStatus]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
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

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.CompletionStatus]

}
