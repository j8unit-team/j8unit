package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LinkLoopExceptionClassTest
implements org.j8unit.repository.javax.naming.LinkLoopExceptionClassTests<javax.naming.LinkLoopException> {

    @Override
    public Class<javax.naming.LinkLoopException> createNewSUT() {
        return javax.naming.LinkLoopException.class;
    }

}
