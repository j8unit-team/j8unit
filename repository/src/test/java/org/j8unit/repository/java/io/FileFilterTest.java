package org.j8unit.repository.java.io;

import java.io.FileFilter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileFilterTest
implements org.j8unit.repository.java.io.FileFilterTests<FileFilter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.FileFilter]

    @Override
    public FileFilter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.io.FileFilter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.FileFilter]

}
