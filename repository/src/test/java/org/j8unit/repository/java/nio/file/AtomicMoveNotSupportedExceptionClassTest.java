package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AtomicMoveNotSupportedExceptionClassTest
implements org.j8unit.repository.java.nio.file.AtomicMoveNotSupportedExceptionClassTests<java.nio.file.AtomicMoveNotSupportedException> {

    @Override
    public Class<java.nio.file.AtomicMoveNotSupportedException> createNewSUT() {
        return java.nio.file.AtomicMoveNotSupportedException.class;
    }

}
