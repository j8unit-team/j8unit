package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractMethodErrorTest
implements org.j8unit.repository.java.lang.AbstractMethodErrorTests<java.lang.AbstractMethodError> {

    @Override
    public java.lang.AbstractMethodError createNewSUT() {
        return new java.lang.AbstractMethodError();
    }

}
