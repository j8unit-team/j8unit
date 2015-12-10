package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidNameExceptionClassTest
implements org.j8unit.repository.javax.naming.InvalidNameExceptionClassTests<javax.naming.InvalidNameException> {

    @Override
    public Class<javax.naming.InvalidNameException> createNewSUT() {
        return javax.naming.InvalidNameException.class;
    }

}
