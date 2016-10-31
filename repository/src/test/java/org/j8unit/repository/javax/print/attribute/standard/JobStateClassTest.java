package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.JobState;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JobStateClassTest
implements org.j8unit.repository.javax.print.attribute.standard.JobStateClassTests<JobState> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.JobState]

    @Override
    public Class<JobState> createNewSUT() {
        return JobState.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.standard.JobState]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.JobState]

}
