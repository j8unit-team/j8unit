package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicControlClassTest
implements org.j8unit.repository.javax.naming.ldap.BasicControlClassTests<javax.naming.ldap.BasicControl> {

    @Override
    public Class<javax.naming.ldap.BasicControl> createNewSUT() {
        return javax.naming.ldap.BasicControl.class;
    }

}
