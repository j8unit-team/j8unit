package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StubNotFoundExceptionClassTest
implements org.j8unit.repository.java.rmi.StubNotFoundExceptionClassTests<java.rmi.StubNotFoundException> {

    @Override
    public Class<java.rmi.StubNotFoundException> createNewSUT() {
        return java.rmi.StubNotFoundException.class;
    }

}
