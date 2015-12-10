package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileLockClassTest
implements org.j8unit.repository.java.nio.channels.FileLockClassTests<java.nio.channels.FileLock> {

    @Override
    public Class<java.nio.channels.FileLock> createNewSUT() {
        return java.nio.channels.FileLock.class;
    }

}
