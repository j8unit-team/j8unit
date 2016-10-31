package org.j8unit.repository.javax.naming;

import javax.naming.NamingEnumeration;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class NamingEnumerationClassTest
implements org.j8unit.repository.javax.naming.NamingEnumerationClassTests<NamingEnumeration> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.NamingEnumeration]

    @Override
    public Class<NamingEnumeration> createNewSUT() {
        return NamingEnumeration.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.NamingEnumeration]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.NamingEnumeration]

}
