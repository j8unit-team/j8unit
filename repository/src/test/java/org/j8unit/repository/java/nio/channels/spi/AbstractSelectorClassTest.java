package org.j8unit.repository.java.nio.channels.spi;

import java.nio.channels.spi.AbstractSelector;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractSelectorClassTest
implements org.j8unit.repository.java.nio.channels.spi.AbstractSelectorClassTests<AbstractSelector> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.spi.AbstractSelector]

    @Override
    public Class<AbstractSelector> createNewSUT() {
        return AbstractSelector.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.spi.AbstractSelector]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.spi.AbstractSelector]

}
