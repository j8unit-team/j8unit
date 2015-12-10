package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoSuchFieldErrorTest
implements org.j8unit.repository.java.lang.NoSuchFieldErrorTests<java.lang.NoSuchFieldError> {

    @Override
    public java.lang.NoSuchFieldError createNewSUT() {
        return new java.lang.NoSuchFieldError();
    }

}
