package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CloseableClassTest
implements org.j8unit.repository.java.io.CloseableClassTests<java.io.Closeable> {

    @Override
    public Class<java.io.Closeable> createNewSUT() {
        return java.io.Closeable.class;
    }

}
