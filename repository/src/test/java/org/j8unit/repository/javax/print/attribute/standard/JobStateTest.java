package org.j8unit.repository.javax.print.attribute.standard;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.print.attribute.standard.JobState;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class JobStateTest
implements org.j8unit.repository.javax.print.attribute.standard.JobStateTests<JobState> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.JobState]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(JobState.PROCESSING_STOPPED, //
                                JobState.UNKNOWN, //
                                JobState.PENDING, //
                                JobState.PENDING_HELD, //
                                JobState.ABORTED, //
                                JobState.COMPLETED, //
                                JobState.PROCESSING, //
                                JobState.CANCELED);
    }

    @Parameter(0)
    public JobState sut;

    @Override
    public JobState createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.standard.JobState]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.standard.JobState]

}
