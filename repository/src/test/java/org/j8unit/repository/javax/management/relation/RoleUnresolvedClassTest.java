package org.j8unit.repository.javax.management.relation;

import java.util.List;
import javax.management.relation.RoleUnresolved;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RoleUnresolvedClassTest
implements org.j8unit.repository.javax.management.relation.RoleUnresolvedClassTests<RoleUnresolved> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.relation.RoleUnresolved]

    @Override
    public Class<RoleUnresolved> createNewSUT() {
        return RoleUnresolved.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link RoleUnresolved#RoleUnresolved(String, List, int) public
     * javax.management.relation.RoleUnresolved(java.lang.String,java.util.List<javax.management.ObjectName>,int) throws
     * java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_RoleUnresolved_String_List_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RoleUnresolved sut = null; // = new RoleUnresolved(String, List, int);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.relation.RoleUnresolved]

}
