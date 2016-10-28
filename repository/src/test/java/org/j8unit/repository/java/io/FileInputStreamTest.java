package org.j8unit.repository.java.io;

import java.io.FileInputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileInputStreamTest
implements org.j8unit.repository.java.io.FileInputStreamTests<FileInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.FileInputStream]

    @Override
    public FileInputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.io.FileInputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.FileInputStream]

}
