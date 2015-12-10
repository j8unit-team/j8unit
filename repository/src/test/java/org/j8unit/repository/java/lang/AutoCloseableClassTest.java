package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AutoCloseableClassTest
implements org.j8unit.repository.java.lang.AutoCloseableClassTests<java.lang.AutoCloseable> {

    @Override
    public Class<java.lang.AutoCloseable> createNewSUT() {
        return java.lang.AutoCloseable.class;
    }

}
