package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoSuchMethodErrorClassTest
implements org.j8unit.repository.java.lang.NoSuchMethodErrorClassTests<java.lang.NoSuchMethodError> {

    @Override
    public Class<java.lang.NoSuchMethodError> createNewSUT() {
        return java.lang.NoSuchMethodError.class;
    }

}
