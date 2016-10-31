package org.j8unit.repository.java.util.stream;

import java.util.stream.IntStream;
import java.util.stream.IntStream.Builder;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IntStreamTest
implements org.j8unit.repository.java.util.stream.IntStreamTests<IntStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.stream.IntStream]

    @Override
    public IntStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.stream.IntStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.stream.IntStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.stream.IntStream]

    @RunWith(J8Unit4.class)
    public static class BuilderTest
    implements org.j8unit.repository.java.util.stream.IntStreamTests.BuilderTests<Builder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.stream.IntStream$Builder]

        @Override
        public Builder createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.stream.IntStream.Builder], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.stream.IntStream$Builder]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.stream.IntStream$Builder]

    }

}
