package org.j8unit.repository.java.io;

import java.io.FileInputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link FileInputStream} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.io.FileInputStreamTests}).
 */
@RunWith(J8Unit4.class)
public class FileInputStreamTest
implements FileInputStreamTests<FileInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.FileInputStream]

    @Override
    public FileInputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.io.FileInputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.FileInputStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.FileInputStream]

}
