package org.j8unit.repository.javax.management.relation;

import javax.management.relation.RelationTypeSupport;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RelationTypeSupport} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.management.relation.RelationTypeSupportClassTests}).
 */
@RunWith(J8Unit4.class)
public class RelationTypeSupportClassTest
implements RelationTypeSupportClassTests<RelationTypeSupport> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.relation.RelationTypeSupport]

    @Override
    public Class<RelationTypeSupport> createNewSUT() {
        return RelationTypeSupport.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.relation.RelationTypeSupport#RelationTypeSupport(String, javax.management.relation.RoleInfo[])
     * public javax.management.relation.RelationTypeSupport(java.lang.String,javax.management.relation.RoleInfo[])
     * throws java.lang.IllegalArgumentException,javax.management.relation.InvalidRelationTypeException}.
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
    public void create_RelationTypeSupport_String_RoleInfoArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RelationTypeSupport sut = null; // = new RelationTypeSupport(String,
                                              // javax.management.relation.RoleInfo[]);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.relation.RelationTypeSupport]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.relation.RelationTypeSupport]

}
