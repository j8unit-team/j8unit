package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.SortControl;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SortControl} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.naming.ldap.SortControlTests}).
 */
@RunWith(J8Unit4.class)
public class SortControlTest
implements SortControlTests<SortControl> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.ldap.SortControl]

    @Override
    public SortControl createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.naming.ldap.SortControl], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.ldap.SortControl]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.ldap.SortControl]

}
