package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IllegalAccessErrorClassTest
implements org.j8unit.repository.java.lang.IllegalAccessErrorClassTests<java.lang.IllegalAccessError> {

    @Override
    public Class<java.lang.IllegalAccessError> createNewSUT() {
        return java.lang.IllegalAccessError.class;
    }

}
