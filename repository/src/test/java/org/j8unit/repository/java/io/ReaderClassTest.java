package org.j8unit.repository.java.io;

import java.io.Reader;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Reader} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.io.ReaderClassTests}).
 */
@RunWith(J8Unit4.class)
public class ReaderClassTest
implements ReaderClassTests<Reader> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.Reader]

    @Override
    public Class<Reader> createNewSUT() {
        return Reader.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.Reader]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.Reader]

}
