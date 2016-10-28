package org.j8unit.repository.java.util.stream;

import java.util.stream.DoubleStream;
import java.util.stream.DoubleStream.Builder;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DoubleStreamTest
implements org.j8unit.repository.java.util.stream.DoubleStreamTests<DoubleStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.stream.DoubleStream]

    @Override
    public DoubleStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.stream.DoubleStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.stream.DoubleStream]

    @RunWith(J8Unit4.class)
    public static class BuilderTest
    implements org.j8unit.repository.java.util.stream.DoubleStreamTests.BuilderTests<Builder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.stream.DoubleStream$Builder]

        @Override
        public Builder createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.stream.DoubleStream.Builder], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.stream.DoubleStream$Builder]

    }

}
