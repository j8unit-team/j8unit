package org.j8unit.repository.java.nio.file.attribute;

import java.nio.file.attribute.FileTime;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileTimeTest
implements org.j8unit.repository.java.nio.file.attribute.FileTimeTests<FileTime> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.attribute.FileTime]

    @Override
    public FileTime createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.nio.file.attribute.FileTime], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.attribute.FileTime]

}
