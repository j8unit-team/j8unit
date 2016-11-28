package org.j8unit.repository.java.util.stream;

import java.util.stream.DoubleStream;
import java.util.stream.DoubleStream.Builder;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DoubleStream} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.stream.DoubleStreamTests}).
 */
@RunWith(J8Unit4.class)
public class DoubleStreamTest
implements DoubleStreamTests<DoubleStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.stream.DoubleStream]

    @Override
    public DoubleStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.stream.DoubleStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.stream.DoubleStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.stream.DoubleStream]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Builder} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.util.stream.DoubleStreamTests.BuilderTests}).
     */
    @RunWith(J8Unit4.class)
    public static class BuilderTest
    implements org.j8unit.repository.java.util.stream.DoubleStreamTests.BuilderTests<Builder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.stream.DoubleStream$Builder]

        @Override
        public Builder createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.stream.DoubleStream.Builder], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.stream.DoubleStream$Builder]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.stream.DoubleStream$Builder]

    }

}
