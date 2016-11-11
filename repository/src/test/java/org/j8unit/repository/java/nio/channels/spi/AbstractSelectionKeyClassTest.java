package org.j8unit.repository.java.nio.channels.spi;

import java.nio.channels.spi.AbstractSelectionKey;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AbstractSelectionKey} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.nio.channels.spi.AbstractSelectionKeyClassTests}).
 */

@RunWith(J8Unit4.class)
public class AbstractSelectionKeyClassTest
implements AbstractSelectionKeyClassTests<AbstractSelectionKey> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.spi.AbstractSelectionKey]

    @Override
    public Class<AbstractSelectionKey> createNewSUT() {
        return AbstractSelectionKey.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.spi.AbstractSelectionKey]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.spi.AbstractSelectionKey]

}
