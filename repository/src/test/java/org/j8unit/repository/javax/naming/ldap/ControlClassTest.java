package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.Control;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ControlClassTest
implements org.j8unit.repository.javax.naming.ldap.ControlClassTests<Control> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.ldap.Control]

    @Override
    public Class<Control> createNewSUT() {
        return Control.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.ldap.Control]

}
