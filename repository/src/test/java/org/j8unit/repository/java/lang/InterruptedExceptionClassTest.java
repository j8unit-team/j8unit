package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InterruptedExceptionClassTest
implements org.j8unit.repository.java.lang.InterruptedExceptionClassTests<java.lang.InterruptedException> {

    @Override
    public Class<java.lang.InterruptedException> createNewSUT() {
        return java.lang.InterruptedException.class;
    }

}
