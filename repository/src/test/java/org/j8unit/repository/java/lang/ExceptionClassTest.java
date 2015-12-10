package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExceptionClassTest
implements org.j8unit.repository.java.lang.ExceptionClassTests<java.lang.Exception> {

    @Override
    public Class<java.lang.Exception> createNewSUT() {
        return java.lang.Exception.class;
    }

}
