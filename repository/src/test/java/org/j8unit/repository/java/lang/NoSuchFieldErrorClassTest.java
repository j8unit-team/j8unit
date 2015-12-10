package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoSuchFieldErrorClassTest
implements org.j8unit.repository.java.lang.NoSuchFieldErrorClassTests<java.lang.NoSuchFieldError> {

    @Override
    public Class<java.lang.NoSuchFieldError> createNewSUT() {
        return java.lang.NoSuchFieldError.class;
    }

}
