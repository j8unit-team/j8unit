package org.j8unit.repository.java.util.stream;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LongStreamClassTest
implements org.j8unit.repository.java.util.stream.LongStreamClassTests<java.util.stream.LongStream> {

    @Override
    public Class<java.util.stream.LongStream> createNewSUT() {
        return java.util.stream.LongStream.class;
    }

    @RunWith(J8Unit4.class)
    public static class BuilderClassTest
    implements org.j8unit.repository.java.util.stream.LongStreamClassTests.BuilderClassTests<java.util.stream.LongStream.Builder> {

        @Override
        public Class<java.util.stream.LongStream.Builder> createNewSUT() {
            return java.util.stream.LongStream.Builder.class;
        }

    }

}
