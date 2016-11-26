package org.j8unit.repository.java.util;

import java.util.RandomAccess;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RandomAccess} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.RandomAccessClassTests}).
 */
@RunWith(J8Unit4.class)
public class RandomAccessClassTest
implements RandomAccessClassTests<RandomAccess> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.RandomAccess]

    @Override
    public Class<RandomAccess> createNewSUT() {
        return RandomAccess.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.RandomAccess]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.RandomAccess]

}
