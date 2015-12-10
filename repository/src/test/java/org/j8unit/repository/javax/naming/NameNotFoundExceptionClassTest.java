package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NameNotFoundExceptionClassTest
implements org.j8unit.repository.javax.naming.NameNotFoundExceptionClassTests<javax.naming.NameNotFoundException> {

    @Override
    public Class<javax.naming.NameNotFoundException> createNewSUT() {
        return javax.naming.NameNotFoundException.class;
    }

}
