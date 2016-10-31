package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.HasControls;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HasControlsClassTest
implements org.j8unit.repository.javax.naming.ldap.HasControlsClassTests<HasControls> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.ldap.HasControls]

    @Override
    public Class<HasControls> createNewSUT() {
        return HasControls.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.ldap.HasControls]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.ldap.HasControls]

}
