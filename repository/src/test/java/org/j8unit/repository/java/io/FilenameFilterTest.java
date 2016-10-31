package org.j8unit.repository.java.io;

import java.io.FilenameFilter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FilenameFilterTest
implements org.j8unit.repository.java.io.FilenameFilterTests<FilenameFilter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.FilenameFilter]

    @Override
    public FilenameFilter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.io.FilenameFilter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.FilenameFilter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.FilenameFilter]

}
