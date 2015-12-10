package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotActiveExceptionClassTest
implements org.j8unit.repository.java.io.NotActiveExceptionClassTests<java.io.NotActiveException> {

    @Override
    public Class<java.io.NotActiveException> createNewSUT() {
        return java.io.NotActiveException.class;
    }

}
