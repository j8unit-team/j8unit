package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoSuchElementExceptionClassTest
implements org.j8unit.repository.java.util.NoSuchElementExceptionClassTests<java.util.NoSuchElementException> {

    @Override
    public Class<java.util.NoSuchElementException> createNewSUT() {
        return java.util.NoSuchElementException.class;
    }

}
