package org.j8unit.repository.javax.print.attribute.standard;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.print.attribute.standard.JobStateReason;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link JobStateReason} (by simply reusing
 * the J8Unit test interface {@link JobStateReasonTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class JobStateReasonTest
implements JobStateReasonTests<JobStateReason> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.JobStateReason]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(JobStateReason.JOB_DATA_INSUFFICIENT, //
                                JobStateReason.PRINTER_STOPPED_PARTLY, //
                                JobStateReason.DOCUMENT_FORMAT_ERROR, //
                                JobStateReason.PRINTER_STOPPED, //
                                JobStateReason.JOB_QUEUED, //
                                JobStateReason.JOB_HOLD_UNTIL_SPECIFIED, //
                                JobStateReason.SUBMISSION_INTERRUPTED, //
                                JobStateReason.JOB_CANCELED_BY_USER, //
                                JobStateReason.RESOURCES_ARE_NOT_READY, //
                                JobStateReason.QUEUED_IN_DEVICE, //
                                JobStateReason.JOB_OUTGOING, //
                                JobStateReason.JOB_INTERPRETING, //
                                JobStateReason.JOB_QUEUED_FOR_MARKER, //
                                JobStateReason.JOB_PRINTING, //
                                JobStateReason.ABORTED_BY_SYSTEM, //
                                JobStateReason.UNSUPPORTED_COMPRESSION, //
                                JobStateReason.DOCUMENT_ACCESS_ERROR, //
                                JobStateReason.JOB_CANCELED_BY_OPERATOR, //
                                JobStateReason.JOB_INCOMING, //
                                JobStateReason.COMPRESSION_ERROR, //
                                JobStateReason.UNSUPPORTED_DOCUMENT_FORMAT, //
                                JobStateReason.JOB_CANCELED_AT_DEVICE, //
                                JobStateReason.PROCESSING_TO_STOP_POINT, //
                                JobStateReason.JOB_TRANSFORMING, //
                                JobStateReason.SERVICE_OFF_LINE, //
                                JobStateReason.JOB_COMPLETED_WITH_ERRORS, //
                                JobStateReason.JOB_COMPLETED_WITH_WARNINGS, //
                                JobStateReason.JOB_RESTARTABLE, //
                                JobStateReason.JOB_COMPLETED_SUCCESSFULLY);
    }

    @Parameter(0)
    public JobStateReason sut;

    @Override
    public JobStateReason createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.standard.JobStateReason]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.standard.JobStateReason]

}
