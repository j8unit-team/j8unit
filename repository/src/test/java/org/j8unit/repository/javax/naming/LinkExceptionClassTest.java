package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LinkExceptionClassTest
implements org.j8unit.repository.javax.naming.LinkExceptionClassTests<javax.naming.LinkException> {

    @Override
    public Class<javax.naming.LinkException> createNewSUT() {
        return javax.naming.LinkException.class;
    }

}
