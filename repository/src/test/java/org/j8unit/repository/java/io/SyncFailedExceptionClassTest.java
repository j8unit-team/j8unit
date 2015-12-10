package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SyncFailedExceptionClassTest
implements org.j8unit.repository.java.io.SyncFailedExceptionClassTests<java.io.SyncFailedException> {

    @Override
    public Class<java.io.SyncFailedException> createNewSUT() {
        return java.io.SyncFailedException.class;
    }

}
