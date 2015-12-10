package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoSuchFieldExceptionClassTest
implements org.j8unit.repository.java.lang.NoSuchFieldExceptionClassTests<java.lang.NoSuchFieldException> {

    @Override
    public Class<java.lang.NoSuchFieldException> createNewSUT() {
        return java.lang.NoSuchFieldException.class;
    }

}
