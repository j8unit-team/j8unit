package org.j8unit.repository.java.nio.file;

import java.nio.file.PathMatcher;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PathMatcherClassTest
implements org.j8unit.repository.java.nio.file.PathMatcherClassTests<PathMatcher> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.PathMatcher]

    @Override
    public Class<PathMatcher> createNewSUT() {
        return PathMatcher.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.PathMatcher]

}
