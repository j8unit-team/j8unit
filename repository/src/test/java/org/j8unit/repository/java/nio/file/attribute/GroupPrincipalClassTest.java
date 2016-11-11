package org.j8unit.repository.java.nio.file.attribute;

import java.nio.file.attribute.GroupPrincipal;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link GroupPrincipal} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.file.attribute.GroupPrincipalClassTests}).
 */

@RunWith(J8Unit4.class)
public class GroupPrincipalClassTest
implements GroupPrincipalClassTests<GroupPrincipal> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.attribute.GroupPrincipal]

    @Override
    public Class<GroupPrincipal> createNewSUT() {
        return GroupPrincipal.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.attribute.GroupPrincipal]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.attribute.GroupPrincipal]

}
