package org.j8unit.repository.java.nio.file;

import java.nio.file.DirectoryStream;
import java.nio.file.DirectoryStream.Filter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DirectoryStreamTest<T>
implements org.j8unit.repository.java.nio.file.DirectoryStreamTests<DirectoryStream<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.DirectoryStream]

    @Override
    public DirectoryStream<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.file.DirectoryStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.DirectoryStream]

    @RunWith(J8Unit4.class)
    public static class FilterTest<T>
    implements org.j8unit.repository.java.nio.file.DirectoryStreamTests.FilterTests<Filter<T>, T> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.DirectoryStream$Filter]

        @Override
        public Filter<T> createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.file.DirectoryStream.Filter], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.DirectoryStream$Filter]

    }

}
