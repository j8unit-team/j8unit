package org.j8unit.repository.java.nio.channels.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractSelectorClassTest
implements org.j8unit.repository.java.nio.channels.spi.AbstractSelectorClassTests<java.nio.channels.spi.AbstractSelector> {

    @Override
    public Class<java.nio.channels.spi.AbstractSelector> createNewSUT() {
        return java.nio.channels.spi.AbstractSelector.class;
    }

}
