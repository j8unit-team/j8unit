package org.j8unit.repository.java.nio.file.attribute;

import java.nio.file.attribute.UserPrincipalLookupService;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UserPrincipalLookupService} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.nio.file.attribute.UserPrincipalLookupServiceClassTests}).
 */

@RunWith(J8Unit4.class)
public class UserPrincipalLookupServiceClassTest
implements UserPrincipalLookupServiceClassTests<UserPrincipalLookupService> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.attribute.UserPrincipalLookupService]

    @Override
    public Class<UserPrincipalLookupService> createNewSUT() {
        return UserPrincipalLookupService.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.attribute.UserPrincipalLookupService]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.attribute.UserPrincipalLookupService]

}
