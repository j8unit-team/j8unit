package org.j8unit.repository.javax.print.attribute.standard;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JobPriorityClassTest
implements org.j8unit.repository.javax.print.attribute.standard.JobPriorityClassTests<javax.print.attribute.standard.JobPriority> {

    @Override
    public Class<javax.print.attribute.standard.JobPriority> createNewSUT() {
        return javax.print.attribute.standard.JobPriority.class;
    }

}
