package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.JobSheets;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JobSheets} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.print.attribute.standard.JobSheetsClassTests}).
 */
@RunWith(J8Unit4.class)
public class JobSheetsClassTest
implements JobSheetsClassTests<JobSheets> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.JobSheets]

    @Override
    public Class<JobSheets> createNewSUT() {
        return JobSheets.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.standard.JobSheets]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.JobSheets]

}
