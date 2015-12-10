package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InsufficientResourcesExceptionClassTest
implements org.j8unit.repository.javax.naming.InsufficientResourcesExceptionClassTests<javax.naming.InsufficientResourcesException> {

    @Override
    public Class<javax.naming.InsufficientResourcesException> createNewSUT() {
        return javax.naming.InsufficientResourcesException.class;
    }

}
