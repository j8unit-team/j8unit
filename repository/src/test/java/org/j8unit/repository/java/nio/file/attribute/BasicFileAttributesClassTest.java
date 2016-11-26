package org.j8unit.repository.java.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributes;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BasicFileAttributes} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.nio.file.attribute.BasicFileAttributesClassTests}).
 */
@RunWith(J8Unit4.class)
public class BasicFileAttributesClassTest
implements BasicFileAttributesClassTests<BasicFileAttributes> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.attribute.BasicFileAttributes]

    @Override
    public Class<BasicFileAttributes> createNewSUT() {
        return BasicFileAttributes.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.attribute.BasicFileAttributes]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.attribute.BasicFileAttributes]

}
