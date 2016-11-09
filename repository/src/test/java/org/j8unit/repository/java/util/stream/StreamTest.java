package org.j8unit.repository.java.util.stream;

import java.util.stream.Stream;
import java.util.stream.Stream.Builder;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Stream} (by simply reusing the J8Unit
 * test interface {@link StreamTests}).
 */

@RunWith(J8Unit4.class)
public class StreamTest<T>
implements StreamTests<Stream<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.stream.Stream]

    @Override
    public Stream<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.stream.Stream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.stream.Stream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.stream.Stream]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Builder} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.util.stream.StreamTests.BuilderTests}).
     */

    @RunWith(J8Unit4.class)
    public static class BuilderTest<T>
    implements org.j8unit.repository.java.util.stream.StreamTests.BuilderTests<Builder<T>, T> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.stream.Stream$Builder]

        @Override
        public Builder<T> createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.stream.Stream.Builder], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.stream.Stream$Builder]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.stream.Stream$Builder]

    }

}
