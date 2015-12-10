package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ThrowableClassTest
implements org.j8unit.repository.java.lang.ThrowableClassTests<java.lang.Throwable> {

    @Override
    public Class<java.lang.Throwable> createNewSUT() {
        return java.lang.Throwable.class;
    }

}
