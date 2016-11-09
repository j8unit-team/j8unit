package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.HasControls;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HasControls} (by simply reusing the
 * J8Unit test interface {@link HasControlsClassTests}).
 */

@RunWith(J8Unit4.class)
public class HasControlsClassTest
implements HasControlsClassTests<HasControls> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.ldap.HasControls]

    @Override
    public Class<HasControls> createNewSUT() {
        return HasControls.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.ldap.HasControls]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.ldap.HasControls]

}
