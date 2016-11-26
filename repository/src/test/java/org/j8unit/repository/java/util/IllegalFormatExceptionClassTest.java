package org.j8unit.repository.java.util;

import java.util.IllegalFormatException;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IllegalFormatException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.util.IllegalFormatExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class IllegalFormatExceptionClassTest
implements IllegalFormatExceptionClassTests<IllegalFormatException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.IllegalFormatException]

    @Override
    public Class<IllegalFormatException> createNewSUT() {
        return IllegalFormatException.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.IllegalFormatException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.IllegalFormatException]

}
