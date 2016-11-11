package org.j8unit.repository.java.util.stream;

import java.util.stream.LongStream;
import java.util.stream.LongStream.Builder;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LongStream} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.stream.LongStreamTests}).
 */

@RunWith(J8Unit4.class)
public class LongStreamTest
implements LongStreamTests<LongStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.stream.LongStream]

    @Override
    public LongStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.stream.LongStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.stream.LongStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.stream.LongStream]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Builder} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.util.stream.LongStreamTests.BuilderTests}).
     */

    @RunWith(J8Unit4.class)
    public static class BuilderTest
    implements BuilderTests<Builder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.stream.LongStream$Builder]

        @Override
        public Builder createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.stream.LongStream.Builder], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.stream.LongStream$Builder]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.stream.LongStream$Builder]

    }

}
