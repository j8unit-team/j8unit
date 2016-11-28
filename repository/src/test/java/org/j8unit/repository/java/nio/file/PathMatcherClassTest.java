package org.j8unit.repository.java.nio.file;

import java.nio.file.PathMatcher;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PathMatcher} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.file.PathMatcherClassTests}).
 */
@RunWith(J8Unit4.class)
public class PathMatcherClassTest
implements PathMatcherClassTests<PathMatcher> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.PathMatcher]

    @Override
    public Class<PathMatcher> createNewSUT() {
        return PathMatcher.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.PathMatcher]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.PathMatcher]

}
