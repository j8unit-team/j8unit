package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractMethodErrorClassTest
implements org.j8unit.repository.java.lang.AbstractMethodErrorClassTests<java.lang.AbstractMethodError> {

    @Override
    public Class<java.lang.AbstractMethodError> createNewSUT() {
        return java.lang.AbstractMethodError.class;
    }

}
