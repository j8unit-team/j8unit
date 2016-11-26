package org.j8unit.repository.java.security;

import java.security.Key;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Key} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.java.security.KeyClassTests}).
 */
@RunWith(J8Unit4.class)
public class KeyClassTest
implements KeyClassTests<Key> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.Key]

    @Override
    public Class<Key> createNewSUT() {
        return Key.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.Key]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.Key]

}
