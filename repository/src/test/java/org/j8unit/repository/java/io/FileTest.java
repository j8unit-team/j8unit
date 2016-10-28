package org.j8unit.repository.java.io;

import java.io.File;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileTest
implements org.j8unit.repository.java.io.FileTests<File> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.File]

    @Override
    public File createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.io.File], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.File]

}
