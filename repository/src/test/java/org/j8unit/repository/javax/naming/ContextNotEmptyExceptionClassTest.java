package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ContextNotEmptyExceptionClassTest
implements org.j8unit.repository.javax.naming.ContextNotEmptyExceptionClassTests<javax.naming.ContextNotEmptyException> {

    @Override
    public Class<javax.naming.ContextNotEmptyException> createNewSUT() {
        return javax.naming.ContextNotEmptyException.class;
    }

}
