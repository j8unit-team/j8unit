package org.j8unit.repository.java.util.stream;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IntStreamClassTest
implements org.j8unit.repository.java.util.stream.IntStreamClassTests<java.util.stream.IntStream> {

    @Override
    public Class<java.util.stream.IntStream> createNewSUT() {
        return java.util.stream.IntStream.class;
    }

    @RunWith(J8Unit4.class)
    public static class BuilderClassTest
    implements org.j8unit.repository.java.util.stream.IntStreamClassTests.BuilderClassTests<java.util.stream.IntStream.Builder> {

        @Override
        public Class<java.util.stream.IntStream.Builder> createNewSUT() {
            return java.util.stream.IntStream.Builder.class;
        }

    }

}
