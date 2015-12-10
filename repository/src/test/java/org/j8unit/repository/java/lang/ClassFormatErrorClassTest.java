package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClassFormatErrorClassTest
implements org.j8unit.repository.java.lang.ClassFormatErrorClassTests<java.lang.ClassFormatError> {

    @Override
    public Class<java.lang.ClassFormatError> createNewSUT() {
        return java.lang.ClassFormatError.class;
    }

}
