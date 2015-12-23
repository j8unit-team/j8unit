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
public class JobStateReasonTest
implements org.j8unit.repository.javax.print.attribute.standard.JobStateReasonTests<javax.print.attribute.standard.JobStateReason> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(javax.print.attribute.standard.JobStateReason.JOB_DATA_INSUFFICIENT, //
                                javax.print.attribute.standard.JobStateReason.PRINTER_STOPPED_PARTLY, //
                                javax.print.attribute.standard.JobStateReason.DOCUMENT_FORMAT_ERROR, //
                                javax.print.attribute.standard.JobStateReason.PRINTER_STOPPED, //
                                javax.print.attribute.standard.JobStateReason.JOB_QUEUED, //
                                javax.print.attribute.standard.JobStateReason.JOB_HOLD_UNTIL_SPECIFIED, //
                                javax.print.attribute.standard.JobStateReason.SUBMISSION_INTERRUPTED, //
                                javax.print.attribute.standard.JobStateReason.JOB_CANCELED_BY_USER, //
                                javax.print.attribute.standard.JobStateReason.RESOURCES_ARE_NOT_READY, //
                                javax.print.attribute.standard.JobStateReason.QUEUED_IN_DEVICE, //
                                javax.print.attribute.standard.JobStateReason.JOB_OUTGOING, //
                                javax.print.attribute.standard.JobStateReason.JOB_INTERPRETING, //
                                javax.print.attribute.standard.JobStateReason.JOB_QUEUED_FOR_MARKER, //
                                javax.print.attribute.standard.JobStateReason.JOB_PRINTING, //
                                javax.print.attribute.standard.JobStateReason.ABORTED_BY_SYSTEM, //
                                javax.print.attribute.standard.JobStateReason.UNSUPPORTED_COMPRESSION, //
                                javax.print.attribute.standard.JobStateReason.DOCUMENT_ACCESS_ERROR, //
                                javax.print.attribute.standard.JobStateReason.JOB_CANCELED_BY_OPERATOR, //
                                javax.print.attribute.standard.JobStateReason.JOB_INCOMING, //
                                javax.print.attribute.standard.JobStateReason.COMPRESSION_ERROR, //
                                javax.print.attribute.standard.JobStateReason.UNSUPPORTED_DOCUMENT_FORMAT, //
                                javax.print.attribute.standard.JobStateReason.JOB_CANCELED_AT_DEVICE, //
                                javax.print.attribute.standard.JobStateReason.PROCESSING_TO_STOP_POINT, //
                                javax.print.attribute.standard.JobStateReason.JOB_TRANSFORMING, //
                                javax.print.attribute.standard.JobStateReason.SERVICE_OFF_LINE, //
                                javax.print.attribute.standard.JobStateReason.JOB_COMPLETED_WITH_ERRORS, //
                                javax.print.attribute.standard.JobStateReason.JOB_COMPLETED_WITH_WARNINGS, //
                                javax.print.attribute.standard.JobStateReason.JOB_RESTARTABLE, //
                                javax.print.attribute.standard.JobStateReason.JOB_COMPLETED_SUCCESSFULLY);
    }

    @Parameter(0)
    public javax.print.attribute.standard.JobStateReason sut;

    @Override
    public javax.print.attribute.standard.JobStateReason createNewSUT() {
        return this.sut;
    }

}
