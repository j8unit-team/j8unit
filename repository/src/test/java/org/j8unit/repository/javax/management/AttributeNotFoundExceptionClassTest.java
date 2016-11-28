package org.j8unit.repository.javax.management;

import javax.management.AttributeNotFoundException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AttributeNotFoundException} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.AttributeNotFoundExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class AttributeNotFoundExceptionClassTest
implements AttributeNotFoundExceptionClassTests<AttributeNotFoundException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.AttributeNotFoundException]

    @Override
    public Class<AttributeNotFoundException> createNewSUT() {
        return AttributeNotFoundException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.AttributeNotFoundException#AttributeNotFoundException() public
     * javax.management.AttributeNotFoundException()}.
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
    public void create_AttributeNotFoundException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AttributeNotFoundException sut = new AttributeNotFoundException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.AttributeNotFoundException#AttributeNotFoundException(String) public
     * javax.management.AttributeNotFoundException(java.lang.String)}.
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
    public void create_AttributeNotFoundException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AttributeNotFoundException sut = null; // = new AttributeNotFoundException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.AttributeNotFoundException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.AttributeNotFoundException]

}
