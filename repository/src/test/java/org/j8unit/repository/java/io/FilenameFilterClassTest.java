package org.j8unit.repository.java.io;

import java.io.FilenameFilter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FilenameFilter} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.io.FilenameFilterClassTests}).
 */
@RunWith(J8Unit4.class)
public class FilenameFilterClassTest
implements FilenameFilterClassTests<FilenameFilter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.FilenameFilter]

    @Override
    public Class<FilenameFilter> createNewSUT() {
        return FilenameFilter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.FilenameFilter]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.FilenameFilter]

}
