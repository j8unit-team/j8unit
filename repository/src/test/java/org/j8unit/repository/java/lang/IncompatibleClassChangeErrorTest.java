package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IncompatibleClassChangeErrorTest
implements org.j8unit.repository.java.lang.IncompatibleClassChangeErrorTests<java.lang.IncompatibleClassChangeError> {

    @Override
    public java.lang.IncompatibleClassChangeError createNewSUT() {
        return new java.lang.IncompatibleClassChangeError();
    }

}
