package org.j8unit.repository.javax.management.relation;

import javax.management.relation.RelationTypeNotFoundException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RelationTypeNotFoundException} (by simply
 * reusing the J8Unit test interface {@link RelationTypeNotFoundExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class RelationTypeNotFoundExceptionClassTest
implements RelationTypeNotFoundExceptionClassTests<RelationTypeNotFoundException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.relation.RelationTypeNotFoundException]

    @Override
    public Class<RelationTypeNotFoundException> createNewSUT() {
        return RelationTypeNotFoundException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.relation.RelationTypeNotFoundException#RelationTypeNotFoundException() public
     * javax.management.relation.RelationTypeNotFoundException()}.
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
    public void create_RelationTypeNotFoundException()
    throws Exception {
        // create new instance
        final RelationTypeNotFoundException sut = new RelationTypeNotFoundException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.relation.RelationTypeNotFoundException#RelationTypeNotFoundException(String) public
     * javax.management.relation.RelationTypeNotFoundException(java.lang.String)}.
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
    public void create_RelationTypeNotFoundException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RelationTypeNotFoundException sut = null; // = new RelationTypeNotFoundException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.relation.RelationTypeNotFoundException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.relation.RelationTypeNotFoundException]

}
