package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MarshalExceptionClassTest
implements org.j8unit.repository.java.rmi.MarshalExceptionClassTests<java.rmi.MarshalException> {

    @Override
    public Class<java.rmi.MarshalException> createNewSUT() {
        return java.rmi.MarshalException.class;
    }

}
