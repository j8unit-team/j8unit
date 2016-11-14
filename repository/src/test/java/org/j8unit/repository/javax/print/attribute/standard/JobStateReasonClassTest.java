package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.JobStateReason;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JobStateReason} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.print.attribute.standard.JobStateReasonClassTests}).
 */

@RunWith(J8Unit4.class)
public class JobStateReasonClassTest
implements JobStateReasonClassTests<JobStateReason> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.JobStateReason]

    @Override
    public Class<JobStateReason> createNewSUT() {
        return JobStateReason.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.standard.JobStateReason]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.JobStateReason]

}
