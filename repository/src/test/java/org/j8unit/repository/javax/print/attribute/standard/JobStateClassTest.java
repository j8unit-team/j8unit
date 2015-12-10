package org.j8unit.repository.javax.print.attribute.standard;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JobStateClassTest
implements org.j8unit.repository.javax.print.attribute.standard.JobStateClassTests<javax.print.attribute.standard.JobState> {

    @Override
    public Class<javax.print.attribute.standard.JobState> createNewSUT() {
        return javax.print.attribute.standard.JobState.class;
    }

}
