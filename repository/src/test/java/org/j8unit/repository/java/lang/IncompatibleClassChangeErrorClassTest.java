package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IncompatibleClassChangeErrorClassTest
implements org.j8unit.repository.java.lang.IncompatibleClassChangeErrorClassTests<java.lang.IncompatibleClassChangeError> {

    @Override
    public Class<java.lang.IncompatibleClassChangeError> createNewSUT() {
        return java.lang.IncompatibleClassChangeError.class;
    }

}
