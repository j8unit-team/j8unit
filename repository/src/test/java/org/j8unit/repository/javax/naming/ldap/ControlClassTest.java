package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ControlClassTest
implements org.j8unit.repository.javax.naming.ldap.ControlClassTests<javax.naming.ldap.Control> {

    @Override
    public Class<javax.naming.ldap.Control> createNewSUT() {
        return javax.naming.ldap.Control.class;
    }

}
