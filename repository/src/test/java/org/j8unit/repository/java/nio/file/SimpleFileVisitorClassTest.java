package org.j8unit.repository.java.nio.file;

import java.nio.file.SimpleFileVisitor;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SimpleFileVisitor} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.file.SimpleFileVisitorClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class SimpleFileVisitorClassTest
implements SimpleFileVisitorClassTests<SimpleFileVisitor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.SimpleFileVisitor]

    @Override
    public Class<SimpleFileVisitor> createNewSUT() {
        return SimpleFileVisitor.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.SimpleFileVisitor]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.SimpleFileVisitor]

}
