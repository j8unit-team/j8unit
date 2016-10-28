package org.j8unit.repository.java.nio.file;

import java.nio.file.FileSystems;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileSystemsTest
implements org.j8unit.repository.java.nio.file.FileSystemsTests<FileSystems> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.FileSystems]

    @Override
    public FileSystems createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.nio.file.FileSystems], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.FileSystems]

}
