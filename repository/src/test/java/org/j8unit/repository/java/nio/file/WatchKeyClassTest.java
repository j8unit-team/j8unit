package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WatchKeyClassTest
implements org.j8unit.repository.java.nio.file.WatchKeyClassTests<java.nio.file.WatchKey> {

    @Override
    public Class<java.nio.file.WatchKey> createNewSUT() {
        return java.nio.file.WatchKey.class;
    }

}
