package org.j8unit.repository.java.nio.file;

import java.nio.file.DirectoryStream;
import java.nio.file.DirectoryStream.Filter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DirectoryStream} (by simply reusing the
 * J8Unit test interface {@link DirectoryStreamClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class DirectoryStreamClassTest
implements DirectoryStreamClassTests<DirectoryStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.DirectoryStream]

    @Override
    public Class<DirectoryStream> createNewSUT() {
        return DirectoryStream.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.DirectoryStream]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.DirectoryStream]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Filter} (by simply reusing the J8Unit
     * test interface {@link org.j8unit.repository.java.nio.file.DirectoryStreamClassTests.FilterClassTests}).
     */
    @SuppressWarnings("rawtypes")
    @RunWith(J8Unit4.class)
    public static class FilterClassTest
    implements org.j8unit.repository.java.nio.file.DirectoryStreamClassTests.FilterClassTests<Filter> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.DirectoryStream$Filter]

        @Override
        public Class<Filter> createNewSUT() {
            return Filter.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.DirectoryStream$Filter]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.DirectoryStream$Filter]

    }

}
