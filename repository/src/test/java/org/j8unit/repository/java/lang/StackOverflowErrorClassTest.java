package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StackOverflowErrorClassTest
implements org.j8unit.repository.java.lang.StackOverflowErrorClassTests<java.lang.StackOverflowError> {

    @Override
    public Class<java.lang.StackOverflowError> createNewSUT() {
        return java.lang.StackOverflowError.class;
    }

}
