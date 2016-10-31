package org.j8unit.repository.java.nio.channels;

import java.nio.channels.FileLock;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileLockClassTest
implements org.j8unit.repository.java.nio.channels.FileLockClassTests<FileLock> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.FileLock]

    @Override
    public Class<FileLock> createNewSUT() {
        return FileLock.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.channels.FileLock]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.FileLock]

}
