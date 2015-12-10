package org.j8unit.repository.javax.print.attribute.standard;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JobStateReasonClassTest
implements org.j8unit.repository.javax.print.attribute.standard.JobStateReasonClassTests<javax.print.attribute.standard.JobStateReason> {

    @Override
    public Class<javax.print.attribute.standard.JobStateReason> createNewSUT() {
        return javax.print.attribute.standard.JobStateReason.class;
    }

}
