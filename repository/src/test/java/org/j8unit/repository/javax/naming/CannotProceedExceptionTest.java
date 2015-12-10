package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CannotProceedExceptionTest
implements org.j8unit.repository.javax.naming.CannotProceedExceptionTests<javax.naming.CannotProceedException> {

    @Override
    public javax.naming.CannotProceedException createNewSUT() {
        return new javax.naming.CannotProceedException();
    }

}
