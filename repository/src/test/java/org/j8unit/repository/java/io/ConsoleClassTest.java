package org.j8unit.repository.java.io;

import java.io.Console;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Console} (by simply reusing the J8Unit
 * test interface {@link ConsoleClassTests}).
 */

@RunWith(J8Unit4.class)
public class ConsoleClassTest
implements ConsoleClassTests<Console> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.Console]

    @Override
    public Class<Console> createNewSUT() {
        return Console.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.Console]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.Console]

}
