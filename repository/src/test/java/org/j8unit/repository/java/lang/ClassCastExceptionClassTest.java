package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClassCastExceptionClassTest
implements org.j8unit.repository.java.lang.ClassCastExceptionClassTests<java.lang.ClassCastException> {

    @Override
    public Class<java.lang.ClassCastException> createNewSUT() {
        return java.lang.ClassCastException.class;
    }

}
