package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClassFormatErrorTest
implements org.j8unit.repository.java.lang.ClassFormatErrorTests<java.lang.ClassFormatError> {

    @Override
    public java.lang.ClassFormatError createNewSUT() {
        return new java.lang.ClassFormatError();
    }

}
