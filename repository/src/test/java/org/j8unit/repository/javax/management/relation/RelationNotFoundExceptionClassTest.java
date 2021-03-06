package org.j8unit.repository.javax.management.relation;

import javax.management.relation.RelationNotFoundException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RelationNotFoundException} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.relation.RelationNotFoundExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class RelationNotFoundExceptionClassTest
implements RelationNotFoundExceptionClassTests<RelationNotFoundException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.relation.RelationNotFoundException]

    @Override
    public Class<RelationNotFoundException> createNewSUT() {
        return RelationNotFoundException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.relation.RelationNotFoundException#RelationNotFoundException() public
     * javax.management.relation.RelationNotFoundException()}.
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
    public void create_RelationNotFoundException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RelationNotFoundException sut = new RelationNotFoundException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.relation.RelationNotFoundException#RelationNotFoundException(String) public
     * javax.management.relation.RelationNotFoundException(java.lang.String)}.
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
    public void create_RelationNotFoundException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RelationNotFoundException sut = null; // = new RelationNotFoundException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.relation.RelationNotFoundException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.relation.RelationNotFoundException]

}
