package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoSuchObjectExceptionClassTest
implements org.j8unit.repository.java.rmi.NoSuchObjectExceptionClassTests<java.rmi.NoSuchObjectException> {

    @Override
    public Class<java.rmi.NoSuchObjectException> createNewSUT() {
        return java.rmi.NoSuchObjectException.class;
    }

}
