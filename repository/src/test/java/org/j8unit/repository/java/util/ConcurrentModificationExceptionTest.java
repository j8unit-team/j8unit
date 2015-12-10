package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConcurrentModificationExceptionTest
implements org.j8unit.repository.java.util.ConcurrentModificationExceptionTests<java.util.ConcurrentModificationException> {

    @Override
    public java.util.ConcurrentModificationException createNewSUT() {
        return new java.util.ConcurrentModificationException();
    }

}
