package org.j8unit.repository.java.sql;

import java.sql.Array;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Array} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.java.sql.ArrayClassTests}).
 */

@RunWith(J8Unit4.class)
public class ArrayClassTest
implements ArrayClassTests<Array> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.Array]

    @Override
    public Class<Array> createNewSUT() {
        return Array.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.sql.Array]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.Array]

}
