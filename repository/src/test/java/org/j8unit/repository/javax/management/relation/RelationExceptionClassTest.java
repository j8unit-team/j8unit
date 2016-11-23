package org.j8unit.repository.javax.management.relation;

import javax.management.relation.RelationException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RelationException} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.management.relation.RelationExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class RelationExceptionClassTest
implements RelationExceptionClassTests<RelationException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.relation.RelationException]

    @Override
    public Class<RelationException> createNewSUT() {
        return RelationException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.relation.RelationException#RelationException() public
     * javax.management.relation.RelationException()}.
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
    public void create_RelationException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RelationException sut = new RelationException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.relation.RelationException#RelationException(String) public
     * javax.management.relation.RelationException(java.lang.String)}.
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
    public void create_RelationException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RelationException sut = null; // = new RelationException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.relation.RelationException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.relation.RelationException]

}
