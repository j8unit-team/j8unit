package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HasControlsClassTest
implements org.j8unit.repository.javax.naming.ldap.HasControlsClassTests<javax.naming.ldap.HasControls> {

    @Override
    public Class<javax.naming.ldap.HasControls> createNewSUT() {
        return javax.naming.ldap.HasControls.class;
    }

}
