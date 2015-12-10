package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnsupportedClassVersionErrorClassTest
implements org.j8unit.repository.java.lang.UnsupportedClassVersionErrorClassTests<java.lang.UnsupportedClassVersionError> {

    @Override
    public Class<java.lang.UnsupportedClassVersionError> createNewSUT() {
        return java.lang.UnsupportedClassVersionError.class;
    }

}
