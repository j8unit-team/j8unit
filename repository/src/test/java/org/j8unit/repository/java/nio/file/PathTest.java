package org.j8unit.repository.java.nio.file;

import java.nio.file.Path;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PathTest
implements org.j8unit.repository.java.nio.file.PathTests<Path> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.Path]

    @Override
    public Path createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.file.Path], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.Path]

}
