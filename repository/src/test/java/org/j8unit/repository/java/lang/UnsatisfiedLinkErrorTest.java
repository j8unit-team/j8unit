package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnsatisfiedLinkErrorTest
implements org.j8unit.repository.java.lang.UnsatisfiedLinkErrorTests<java.lang.UnsatisfiedLinkError> {

    @Override
    public java.lang.UnsatisfiedLinkError createNewSUT() {
        return new java.lang.UnsatisfiedLinkError();
    }

}
