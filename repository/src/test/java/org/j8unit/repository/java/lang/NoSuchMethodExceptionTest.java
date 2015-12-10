package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoSuchMethodExceptionTest
implements org.j8unit.repository.java.lang.NoSuchMethodExceptionTests<java.lang.NoSuchMethodException> {

    @Override
    public java.lang.NoSuchMethodException createNewSUT() {
        return new java.lang.NoSuchMethodException();
    }

}
