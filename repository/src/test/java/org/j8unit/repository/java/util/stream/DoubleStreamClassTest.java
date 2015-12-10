package org.j8unit.repository.java.util.stream;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DoubleStreamClassTest
implements org.j8unit.repository.java.util.stream.DoubleStreamClassTests<java.util.stream.DoubleStream> {

    @RunWith(J8Unit4.class)
    public static class BuilderClassTest
    implements org.j8unit.repository.java.util.stream.DoubleStreamClassTests.BuilderClassTests<java.util.stream.DoubleStream.Builder> {

        @Override
        public Class<java.util.stream.DoubleStream.Builder> createNewSUT() {
            return java.util.stream.DoubleStream.Builder.class;
        }

    }

    @Override
    public Class<java.util.stream.DoubleStream> createNewSUT() {
        return java.util.stream.DoubleStream.class;
    }

}
