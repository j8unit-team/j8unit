package org.j8unit.repository.java.nio.file.attribute;

import java.nio.file.attribute.UserPrincipal;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UserPrincipal} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.file.attribute.UserPrincipalClassTests}).
 */
@RunWith(J8Unit4.class)
public class UserPrincipalClassTest
implements UserPrincipalClassTests<UserPrincipal> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.attribute.UserPrincipal]

    @Override
    public Class<UserPrincipal> createNewSUT() {
        return UserPrincipal.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.attribute.UserPrincipal]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.attribute.UserPrincipal]

}
