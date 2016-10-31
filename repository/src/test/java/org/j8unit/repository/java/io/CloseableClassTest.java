package org.j8unit.repository.java.io;

import java.io.Closeable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CloseableClassTest
implements org.j8unit.repository.java.io.CloseableClassTests<Closeable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.Closeable]

    @Override
    public Class<Closeable> createNewSUT() {
        return Closeable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.Closeable]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.Closeable]

}
