package org.j8unit.repository.java.nio.file.attribute;

import java.nio.file.attribute.FileTime;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link FileTime} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.file.attribute.FileTimeTests}).
 */

@RunWith(J8Unit4.class)
public class FileTimeTest
implements FileTimeTests<FileTime> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.attribute.FileTime]

    @Override
    public FileTime createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.nio.file.attribute.FileTime], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.file.attribute.FileTime]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.file.attribute.FileTime]

}
