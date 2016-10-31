package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.HasControls;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HasControlsTest
implements org.j8unit.repository.javax.naming.ldap.HasControlsTests<HasControls> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.ldap.HasControls]

    @Override
    public HasControls createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.naming.ldap.HasControls], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.ldap.HasControls]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.ldap.HasControls]

}
