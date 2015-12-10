package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AtomicMoveNotSupportedExceptionTest
implements org.j8unit.repository.java.nio.file.AtomicMoveNotSupportedExceptionTests<java.nio.file.AtomicMoveNotSupportedException> {

    @Override
    public java.nio.file.AtomicMoveNotSupportedException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.nio.file.AtomicMoveNotSupportedException] available.");
    }

}
