package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClosedWatchServiceExceptionTest
implements org.j8unit.repository.java.nio.file.ClosedWatchServiceExceptionTests<java.nio.file.ClosedWatchServiceException> {

    @Override
    public java.nio.file.ClosedWatchServiceException createNewSUT() {
        return new java.nio.file.ClosedWatchServiceException();
    }

}
