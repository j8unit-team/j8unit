package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SyncFailedExceptionTest
implements org.j8unit.repository.java.io.SyncFailedExceptionTests<java.io.SyncFailedException> {

    @Override
    public java.io.SyncFailedException createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.io.SyncFailedException] available.");
    }

}
