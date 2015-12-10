package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AssertionErrorClassTest
implements org.j8unit.repository.java.lang.AssertionErrorClassTests<java.lang.AssertionError> {

    @Override
    public Class<java.lang.AssertionError> createNewSUT() {
        return java.lang.AssertionError.class;
    }

}
