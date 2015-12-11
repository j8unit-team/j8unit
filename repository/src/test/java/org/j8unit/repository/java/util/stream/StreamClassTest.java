package org.j8unit.repository.java.util.stream;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class StreamClassTest
implements org.j8unit.repository.java.util.stream.StreamClassTests<java.util.stream.Stream> {

    @RunWith(J8Unit4.class)
    public static class BuilderClassTest
    implements org.j8unit.repository.java.util.stream.StreamClassTests.BuilderClassTests<java.util.stream.Stream.Builder> {

        @Override
        public Class<java.util.stream.Stream.Builder> createNewSUT() {
            return java.util.stream.Stream.Builder.class;
        }

    }

    @Override
    public Class<java.util.stream.Stream> createNewSUT() {
        return java.util.stream.Stream.class;
    }

}
