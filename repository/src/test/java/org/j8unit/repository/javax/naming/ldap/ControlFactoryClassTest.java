package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ControlFactoryClassTest
implements org.j8unit.repository.javax.naming.ldap.ControlFactoryClassTests<javax.naming.ldap.ControlFactory> {

    @Override
    public Class<javax.naming.ldap.ControlFactory> createNewSUT() {
        return javax.naming.ldap.ControlFactory.class;
    }

}
