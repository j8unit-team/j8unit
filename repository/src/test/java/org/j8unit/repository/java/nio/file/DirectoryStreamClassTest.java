package org.j8unit.repository.java.nio.file;

import java.nio.file.DirectoryStream;
import java.nio.file.DirectoryStream.Filter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class DirectoryStreamClassTest
implements org.j8unit.repository.java.nio.file.DirectoryStreamClassTests<DirectoryStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.DirectoryStream]

    @Override
    public Class<DirectoryStream> createNewSUT() {
        return DirectoryStream.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.DirectoryStream]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.DirectoryStream]

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
