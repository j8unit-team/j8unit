package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.PagedResultsControl;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PagedResultsControl} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.naming.ldap.PagedResultsControlTests}).
 */
@RunWith(J8Unit4.class)
public class PagedResultsControlTest
implements PagedResultsControlTests<PagedResultsControl> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.ldap.PagedResultsControl]

    @Override
    public PagedResultsControl createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.naming.ldap.PagedResultsControl], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.ldap.PagedResultsControl]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.ldap.PagedResultsControl]

}
