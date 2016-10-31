package org.j8unit.repository.java.nio.file;

import java.nio.file.AtomicMoveNotSupportedException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AtomicMoveNotSupportedExceptionTest
implements org.j8unit.repository.java.nio.file.AtomicMoveNotSupportedExceptionTests<AtomicMoveNotSupportedException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.AtomicMoveNotSupportedException]

    @Override
    public AtomicMoveNotSupportedException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.nio.file.AtomicMoveNotSupportedException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.file.AtomicMoveNotSupportedException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.file.AtomicMoveNotSupportedException]

}
