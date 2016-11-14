package org.j8unit.repository.java.net;

import java.net.StandardSocketOptions;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StandardSocketOptions} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.net.StandardSocketOptionsClassTests}).
 */

@RunWith(J8Unit4.class)
public class StandardSocketOptionsClassTest
implements StandardSocketOptionsClassTests<StandardSocketOptions> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.StandardSocketOptions]

    @Override
    public Class<StandardSocketOptions> createNewSUT() {
        return StandardSocketOptions.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.StandardSocketOptions]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.StandardSocketOptions]

}
