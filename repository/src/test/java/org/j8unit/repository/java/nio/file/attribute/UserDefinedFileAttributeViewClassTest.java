package org.j8unit.repository.java.nio.file.attribute;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UserDefinedFileAttributeView} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.nio.file.attribute.UserDefinedFileAttributeViewClassTests}).
 */
@RunWith(J8Unit4.class)
public class UserDefinedFileAttributeViewClassTest
implements UserDefinedFileAttributeViewClassTests<UserDefinedFileAttributeView> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.attribute.UserDefinedFileAttributeView]

    @Override
    public Class<UserDefinedFileAttributeView> createNewSUT() {
        return UserDefinedFileAttributeView.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.attribute.UserDefinedFileAttributeView]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.attribute.UserDefinedFileAttributeView]

}
