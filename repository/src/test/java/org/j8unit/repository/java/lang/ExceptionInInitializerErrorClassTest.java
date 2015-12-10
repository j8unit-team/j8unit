package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExceptionInInitializerErrorClassTest
implements org.j8unit.repository.java.lang.ExceptionInInitializerErrorClassTests<java.lang.ExceptionInInitializerError> {

    @Override
    public Class<java.lang.ExceptionInInitializerError> createNewSUT() {
        return java.lang.ExceptionInInitializerError.class;
    }

}
