package org.j8unit.repository.java.nio.file;

import java.nio.file.PathMatcher;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PathMatcherTest
implements org.j8unit.repository.java.nio.file.PathMatcherTests<PathMatcher> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.PathMatcher]

    @Override
    public PathMatcher createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.file.PathMatcher], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.file.PathMatcher]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.file.PathMatcher]

}
