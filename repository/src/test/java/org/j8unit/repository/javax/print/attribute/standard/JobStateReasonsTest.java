package org.j8unit.repository.javax.print.attribute.standard;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JobStateReasonsTest
implements org.j8unit.repository.javax.print.attribute.standard.JobStateReasonsTests<javax.print.attribute.standard.JobStateReasons> {

    @Override
    public javax.print.attribute.standard.JobStateReasons createNewSUT() {
        return new javax.print.attribute.standard.JobStateReasons();
    }

}
