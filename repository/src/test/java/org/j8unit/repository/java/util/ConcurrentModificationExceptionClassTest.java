package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConcurrentModificationExceptionClassTest
implements org.j8unit.repository.java.util.ConcurrentModificationExceptionClassTests<java.util.ConcurrentModificationException> {

    @Override
    public Class<java.util.ConcurrentModificationException> createNewSUT() {
        return java.util.ConcurrentModificationException.class;
    }

}
