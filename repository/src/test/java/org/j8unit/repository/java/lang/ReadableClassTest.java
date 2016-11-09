package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Readable} (by simply reusing the J8Unit
 * test interface {@link ReadableClassTests}).
 */

@RunWith(J8Unit4.class)
public class ReadableClassTest
implements ReadableClassTests<Readable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.Readable]

    @Override
    public Class<Readable> createNewSUT() {
        return Readable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.Readable]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.Readable]

}
