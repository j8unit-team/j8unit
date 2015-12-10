package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OutOfMemoryErrorTest
implements org.j8unit.repository.java.lang.OutOfMemoryErrorTests<java.lang.OutOfMemoryError> {

    @Override
    public java.lang.OutOfMemoryError createNewSUT() {
        return new java.lang.OutOfMemoryError();
    }

}
