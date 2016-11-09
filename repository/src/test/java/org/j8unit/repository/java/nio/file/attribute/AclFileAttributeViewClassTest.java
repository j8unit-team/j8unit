package org.j8unit.repository.java.nio.file.attribute;

import java.nio.file.attribute.AclFileAttributeView;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AclFileAttributeView} (by simply reusing
 * the J8Unit test interface {@link AclFileAttributeViewClassTests}).
 */

@RunWith(J8Unit4.class)
public class AclFileAttributeViewClassTest
implements AclFileAttributeViewClassTests<AclFileAttributeView> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.attribute.AclFileAttributeView]

    @Override
    public Class<AclFileAttributeView> createNewSUT() {
        return AclFileAttributeView.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.attribute.AclFileAttributeView]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.attribute.AclFileAttributeView]

}
