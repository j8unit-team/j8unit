package org.j8unit.repository.java.nio.channels.spi;

import java.nio.channels.spi.AbstractSelector;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AbstractSelector} (by simply reusing the
 * J8Unit test interface {@link AbstractSelectorClassTests}).
 */

@RunWith(J8Unit4.class)
public class AbstractSelectorClassTest
implements AbstractSelectorClassTests<AbstractSelector> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.spi.AbstractSelector]

    @Override
    public Class<AbstractSelector> createNewSUT() {
        return AbstractSelector.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.spi.AbstractSelector]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.spi.AbstractSelector]

}
