package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InstantiationExceptionTest
implements org.j8unit.repository.java.lang.InstantiationExceptionTests<java.lang.InstantiationException> {

    @Override
    public java.lang.InstantiationException createNewSUT() {
        return new java.lang.InstantiationException();
    }

}
