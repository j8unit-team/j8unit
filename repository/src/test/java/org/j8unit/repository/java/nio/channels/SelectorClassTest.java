package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SelectorClassTest
implements org.j8unit.repository.java.nio.channels.SelectorClassTests<java.nio.channels.Selector> {

    @Override
    public Class<java.nio.channels.Selector> createNewSUT() {
        return java.nio.channels.Selector.class;
    }

}
