package org.j8unit.repository.java.nio.channels;

import java.nio.channels.SelectionKey;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SelectionKeyClassTest
implements org.j8unit.repository.java.nio.channels.SelectionKeyClassTests<SelectionKey> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.SelectionKey]

    @Override
    public Class<SelectionKey> createNewSUT() {
        return SelectionKey.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.SelectionKey]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.SelectionKey]

}
