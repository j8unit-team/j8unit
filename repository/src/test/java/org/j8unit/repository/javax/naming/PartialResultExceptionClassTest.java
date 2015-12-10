package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PartialResultExceptionClassTest
implements org.j8unit.repository.javax.naming.PartialResultExceptionClassTests<javax.naming.PartialResultException> {

    @Override
    public Class<javax.naming.PartialResultException> createNewSUT() {
        return javax.naming.PartialResultException.class;
    }

}
