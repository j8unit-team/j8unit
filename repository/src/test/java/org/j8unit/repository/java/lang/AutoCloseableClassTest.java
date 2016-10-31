package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AutoCloseableClassTest
implements org.j8unit.repository.java.lang.AutoCloseableClassTests<AutoCloseable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.AutoCloseable]

    @Override
    public Class<AutoCloseable> createNewSUT() {
        return AutoCloseable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.AutoCloseable]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.AutoCloseable]

}
