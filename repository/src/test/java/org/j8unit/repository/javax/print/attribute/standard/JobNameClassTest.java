package org.j8unit.repository.javax.print.attribute.standard;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JobNameClassTest
implements org.j8unit.repository.javax.print.attribute.standard.JobNameClassTests<javax.print.attribute.standard.JobName> {

    @Override
    public Class<javax.print.attribute.standard.JobName> createNewSUT() {
        return javax.print.attribute.standard.JobName.class;
    }

}
