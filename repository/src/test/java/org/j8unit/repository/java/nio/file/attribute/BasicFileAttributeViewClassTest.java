package org.j8unit.repository.java.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributeView;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BasicFileAttributeView} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.nio.file.attribute.BasicFileAttributeViewClassTests}).
 */
@RunWith(J8Unit4.class)
public class BasicFileAttributeViewClassTest
implements BasicFileAttributeViewClassTests<BasicFileAttributeView> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.attribute.BasicFileAttributeView]

    @Override
    public Class<BasicFileAttributeView> createNewSUT() {
        return BasicFileAttributeView.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.attribute.BasicFileAttributeView]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.attribute.BasicFileAttributeView]

}
