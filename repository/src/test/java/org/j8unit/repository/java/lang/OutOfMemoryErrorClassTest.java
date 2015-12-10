package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OutOfMemoryErrorClassTest
implements org.j8unit.repository.java.lang.OutOfMemoryErrorClassTests<java.lang.OutOfMemoryError> {

    @Override
    public Class<java.lang.OutOfMemoryError> createNewSUT() {
        return java.lang.OutOfMemoryError.class;
    }

}
