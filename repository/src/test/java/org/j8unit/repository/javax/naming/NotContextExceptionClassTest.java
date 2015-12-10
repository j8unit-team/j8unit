package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotContextExceptionClassTest
implements org.j8unit.repository.javax.naming.NotContextExceptionClassTests<javax.naming.NotContextException> {

    @Override
    public Class<javax.naming.NotContextException> createNewSUT() {
        return javax.naming.NotContextException.class;
    }

}
