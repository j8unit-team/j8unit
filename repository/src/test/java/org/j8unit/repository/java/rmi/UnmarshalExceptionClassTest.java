package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnmarshalExceptionClassTest
implements org.j8unit.repository.java.rmi.UnmarshalExceptionClassTests<java.rmi.UnmarshalException> {

    @Override
    public Class<java.rmi.UnmarshalException> createNewSUT() {
        return java.rmi.UnmarshalException.class;
    }

}
