package org.j8unit.repository.javax.print.attribute.standard;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class JobStateTest
implements org.j8unit.repository.javax.print.attribute.standard.JobStateTests<javax.print.attribute.standard.JobState> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(javax.print.attribute.standard.JobState.PROCESSING_STOPPED, //
                                javax.print.attribute.standard.JobState.UNKNOWN, //
                                javax.print.attribute.standard.JobState.PENDING, //
                                javax.print.attribute.standard.JobState.PENDING_HELD, //
                                javax.print.attribute.standard.JobState.ABORTED, //
                                javax.print.attribute.standard.JobState.COMPLETED, //
                                javax.print.attribute.standard.JobState.PROCESSING, //
                                javax.print.attribute.standard.JobState.CANCELED);
    }

    @Parameter(0)
    public javax.print.attribute.standard.JobState sut;

    @Override
    public javax.print.attribute.standard.JobState createNewSUT() {
        return this.sut;
    }

}
