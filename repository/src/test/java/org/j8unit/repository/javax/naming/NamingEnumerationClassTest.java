package org.j8unit.repository.javax.naming;

import javax.naming.NamingEnumeration;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NamingEnumeration} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.naming.NamingEnumerationClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class NamingEnumerationClassTest
implements NamingEnumerationClassTests<NamingEnumeration> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.NamingEnumeration]

    @Override
    public Class<NamingEnumeration> createNewSUT() {
        return NamingEnumeration.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.NamingEnumeration]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.NamingEnumeration]

}
