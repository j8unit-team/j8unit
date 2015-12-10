package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidApplicationExceptionClassTest
implements org.j8unit.repository.javax.management.InvalidApplicationExceptionClassTests<javax.management.InvalidApplicationException> {

    @Override
    public Class<javax.management.InvalidApplicationException> createNewSUT() {
        return javax.management.InvalidApplicationException.class;
    }

}
