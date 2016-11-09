package org.j8unit.repository.javax.management.relation;

import javax.management.relation.RelationServiceNotRegisteredException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RelationServiceNotRegisteredException}
 * (by simply reusing the J8Unit test interface {@link RelationServiceNotRegisteredExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class RelationServiceNotRegisteredExceptionClassTest
implements RelationServiceNotRegisteredExceptionClassTests<RelationServiceNotRegisteredException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.relation.RelationServiceNotRegisteredException]

    @Override
    public Class<RelationServiceNotRegisteredException> createNewSUT() {
        return RelationServiceNotRegisteredException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.relation.RelationServiceNotRegisteredException#RelationServiceNotRegisteredException()
     * public javax.management.relation.RelationServiceNotRegisteredException()}.
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
    public void create_RelationServiceNotRegisteredException()
    throws Exception {
        // create new instance
        final RelationServiceNotRegisteredException sut = new RelationServiceNotRegisteredException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.relation.RelationServiceNotRegisteredException#RelationServiceNotRegisteredException(String)
     * public javax.management.relation.RelationServiceNotRegisteredException(java.lang.String)}.
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
    public void create_RelationServiceNotRegisteredException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RelationServiceNotRegisteredException sut = null; // = new RelationServiceNotRegisteredException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.relation.RelationServiceNotRegisteredException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.relation.RelationServiceNotRegisteredException]

}
