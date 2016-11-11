package org.j8unit.repository.java.security;

import java.security.Principal;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Principal} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.security.PrincipalClassTests}).
 */

@RunWith(J8Unit4.class)
public class PrincipalClassTest
implements PrincipalClassTests<Principal> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.Principal]

    @Override
    public Class<Principal> createNewSUT() {
        return Principal.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.Principal]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.Principal]

}
