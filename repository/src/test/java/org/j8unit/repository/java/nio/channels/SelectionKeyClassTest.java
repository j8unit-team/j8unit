package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SelectionKeyClassTest
implements org.j8unit.repository.java.nio.channels.SelectionKeyClassTests<java.nio.channels.SelectionKey> {

    @Override
    public Class<java.nio.channels.SelectionKey> createNewSUT() {
        return java.nio.channels.SelectionKey.class;
    }

}
