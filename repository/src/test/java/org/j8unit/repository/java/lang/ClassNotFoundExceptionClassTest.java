package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClassNotFoundExceptionClassTest
implements org.j8unit.repository.java.lang.ClassNotFoundExceptionClassTests<java.lang.ClassNotFoundException> {

    @Override
    public Class<java.lang.ClassNotFoundException> createNewSUT() {
        return java.lang.ClassNotFoundException.class;
    }

}
