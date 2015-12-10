package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SimpleFileVisitorTest<T>
implements org.j8unit.repository.java.nio.file.SimpleFileVisitorTests<java.nio.file.SimpleFileVisitor<T>, T> {

    @Override
    public java.nio.file.SimpleFileVisitor<T> createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.nio.file.SimpleFileVisitor] available.");
    }

}
