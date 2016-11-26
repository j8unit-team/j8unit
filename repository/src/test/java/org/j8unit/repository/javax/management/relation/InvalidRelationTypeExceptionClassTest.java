package org.j8unit.repository.javax.management.relation;

import javax.management.relation.InvalidRelationTypeException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InvalidRelationTypeException} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.relation.InvalidRelationTypeExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class InvalidRelationTypeExceptionClassTest
implements InvalidRelationTypeExceptionClassTests<InvalidRelationTypeException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.relation.InvalidRelationTypeException]

    @Override
    public Class<InvalidRelationTypeException> createNewSUT() {
        return InvalidRelationTypeException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.relation.InvalidRelationTypeException#InvalidRelationTypeException() public
     * javax.management.relation.InvalidRelationTypeException()}.
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
    public void create_InvalidRelationTypeException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidRelationTypeException sut = new InvalidRelationTypeException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.relation.InvalidRelationTypeException#InvalidRelationTypeException(String) public
     * javax.management.relation.InvalidRelationTypeException(java.lang.String)}.
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
    public void create_InvalidRelationTypeException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidRelationTypeException sut = null; // = new InvalidRelationTypeException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.relation.InvalidRelationTypeException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.relation.InvalidRelationTypeException]

}
