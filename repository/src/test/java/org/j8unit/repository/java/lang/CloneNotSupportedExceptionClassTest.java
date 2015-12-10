package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CloneNotSupportedExceptionClassTest
implements org.j8unit.repository.java.lang.CloneNotSupportedExceptionClassTests<java.lang.CloneNotSupportedException> {

    @Override
    public Class<java.lang.CloneNotSupportedException> createNewSUT() {
        return java.lang.CloneNotSupportedException.class;
    }

}
