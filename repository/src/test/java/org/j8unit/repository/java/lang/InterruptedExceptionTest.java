package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InterruptedExceptionTest
implements org.j8unit.repository.java.lang.InterruptedExceptionTests<java.lang.InterruptedException> {

    @Override
    public java.lang.InterruptedException createNewSUT() {
        return new java.lang.InterruptedException();
    }

}
