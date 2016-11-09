package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.JobState;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JobState} (by simply reusing the J8Unit
 * test interface {@link JobStateClassTests}).
 */

@RunWith(J8Unit4.class)
public class JobStateClassTest
implements JobStateClassTests<JobState> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.JobState]

    @Override
    public Class<JobState> createNewSUT() {
        return JobState.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.standard.JobState]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.JobState]

}
