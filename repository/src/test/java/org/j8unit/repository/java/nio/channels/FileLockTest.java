package org.j8unit.repository.java.nio.channels;

import java.nio.channels.FileLock;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileLockTest
implements org.j8unit.repository.java.nio.channels.FileLockTests<FileLock> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.FileLock]

    @Override
    public FileLock createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.channels.FileLock], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.FileLock]

}
