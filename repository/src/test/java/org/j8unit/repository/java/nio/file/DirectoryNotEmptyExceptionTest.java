package org.j8unit.repository.java.nio.file;

import java.nio.file.DirectoryNotEmptyException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DirectoryNotEmptyExceptionTest
implements org.j8unit.repository.java.nio.file.DirectoryNotEmptyExceptionTests<DirectoryNotEmptyException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.DirectoryNotEmptyException]

    @Override
    public DirectoryNotEmptyException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.nio.file.DirectoryNotEmptyException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.DirectoryNotEmptyException]

}
