package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DirectoryIteratorExceptionTest
implements org.j8unit.repository.java.nio.file.DirectoryIteratorExceptionTests<java.nio.file.DirectoryIteratorException> {

    @Override
    public java.nio.file.DirectoryIteratorException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.nio.file.DirectoryIteratorException] available.");
    }

}