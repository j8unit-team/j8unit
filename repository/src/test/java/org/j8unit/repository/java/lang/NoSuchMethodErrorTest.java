package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoSuchMethodErrorTest
implements org.j8unit.repository.java.lang.NoSuchMethodErrorTests<java.lang.NoSuchMethodError> {

    @Override
    public java.lang.NoSuchMethodError createNewSUT() {
        return new java.lang.NoSuchMethodError();
    }

}
