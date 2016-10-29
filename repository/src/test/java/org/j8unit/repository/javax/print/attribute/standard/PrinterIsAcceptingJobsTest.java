package org.j8unit.repository.javax.print.attribute.standard;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.print.attribute.standard.PrinterIsAcceptingJobs;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class PrinterIsAcceptingJobsTest
implements org.j8unit.repository.javax.print.attribute.standard.PrinterIsAcceptingJobsTests<PrinterIsAcceptingJobs> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.PrinterIsAcceptingJobs]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(PrinterIsAcceptingJobs.ACCEPTING_JOBS, //
                                PrinterIsAcceptingJobs.NOT_ACCEPTING_JOBS);
    }

    @Parameter(0)
    public PrinterIsAcceptingJobs sut;

    @Override
    public PrinterIsAcceptingJobs createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.PrinterIsAcceptingJobs]

}
