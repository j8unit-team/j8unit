package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CannotProceedExceptionClassTest
implements org.j8unit.repository.javax.naming.CannotProceedExceptionClassTests<javax.naming.CannotProceedException> {

    @Override
    public Class<javax.naming.CannotProceedException> createNewSUT() {
        return javax.naming.CannotProceedException.class;
    }

}
