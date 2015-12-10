package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class NamingEnumerationClassTest
implements org.j8unit.repository.javax.naming.NamingEnumerationClassTests<javax.naming.NamingEnumeration> {

    @Override
    public Class<javax.naming.NamingEnumeration> createNewSUT() {
        return javax.naming.NamingEnumeration.class;
    }

}
