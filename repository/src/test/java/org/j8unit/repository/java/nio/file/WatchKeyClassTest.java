package org.j8unit.repository.java.nio.file;

import java.nio.file.WatchKey;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WatchKeyClassTest
implements org.j8unit.repository.java.nio.file.WatchKeyClassTests<WatchKey> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.WatchKey]

    @Override
    public Class<WatchKey> createNewSUT() {
        return WatchKey.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.WatchKey]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.WatchKey]

}
