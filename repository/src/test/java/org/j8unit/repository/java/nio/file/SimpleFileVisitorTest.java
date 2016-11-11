package org.j8unit.repository.java.nio.file;

import java.nio.file.SimpleFileVisitor;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SimpleFileVisitor} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.nio.file.SimpleFileVisitorTests}).
 */

@RunWith(J8Unit4.class)
public class SimpleFileVisitorTest<T>
implements SimpleFileVisitorTests<SimpleFileVisitor<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.SimpleFileVisitor]

    @Override
    public SimpleFileVisitor<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.nio.file.SimpleFileVisitor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.file.SimpleFileVisitor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.file.SimpleFileVisitor]

}
