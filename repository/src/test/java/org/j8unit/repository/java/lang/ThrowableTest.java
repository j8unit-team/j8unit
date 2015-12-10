package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ThrowableTest
implements org.j8unit.repository.java.lang.ThrowableTests<java.lang.Throwable> {

    @Override
    public java.lang.Throwable createNewSUT() {
        return new java.lang.Throwable();
    }

}
