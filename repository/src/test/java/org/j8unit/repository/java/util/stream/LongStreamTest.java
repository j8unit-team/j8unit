package org.j8unit.repository.java.util.stream;

import java.util.stream.LongStream;
import java.util.stream.LongStream.Builder;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LongStreamTest
implements org.j8unit.repository.java.util.stream.LongStreamTests<LongStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.stream.LongStream]

    @Override
    public LongStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.stream.LongStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.stream.LongStream]

    @RunWith(J8Unit4.class)
    public static class BuilderTest
    implements org.j8unit.repository.java.util.stream.LongStreamTests.BuilderTests<Builder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.stream.LongStream$Builder]

        @Override
        public Builder createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.stream.LongStream.Builder], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.stream.LongStream$Builder]

    }

}
