package org.j8unit.repository.org.omg.CORBA;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class CompletionStatusTest
implements org.j8unit.repository.org.omg.CORBA.CompletionStatusTests<org.omg.CORBA.CompletionStatus> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(org.omg.CORBA.CompletionStatus.COMPLETED_YES, //
                                org.omg.CORBA.CompletionStatus.COMPLETED_NO, //
                                org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    @Parameter(0)
    public org.omg.CORBA.CompletionStatus sut;

    @Override
    public org.omg.CORBA.CompletionStatus createNewSUT() {
        return this.sut;
    }

}
