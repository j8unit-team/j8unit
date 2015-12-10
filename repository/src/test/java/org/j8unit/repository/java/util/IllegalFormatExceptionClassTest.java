package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IllegalFormatExceptionClassTest
implements org.j8unit.repository.java.util.IllegalFormatExceptionClassTests<java.util.IllegalFormatException> {

    @Override
    public Class<java.util.IllegalFormatException> createNewSUT() {
        return java.util.IllegalFormatException.class;
    }

}
