package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoInitialContextExceptionClassTest
implements org.j8unit.repository.javax.naming.NoInitialContextExceptionClassTests<javax.naming.NoInitialContextException> {

    @Override
    public Class<javax.naming.NoInitialContextException> createNewSUT() {
        return javax.naming.NoInitialContextException.class;
    }

}
