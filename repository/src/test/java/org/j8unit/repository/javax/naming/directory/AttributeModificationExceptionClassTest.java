package org.j8unit.repository.javax.naming.directory;

import javax.naming.directory.AttributeModificationException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AttributeModificationException} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.naming.directory.AttributeModificationExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class AttributeModificationExceptionClassTest
implements AttributeModificationExceptionClassTests<AttributeModificationException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.directory.AttributeModificationException]

    @Override
    public Class<AttributeModificationException> createNewSUT() {
        return AttributeModificationException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.directory.AttributeModificationException#AttributeModificationException(String) public
     * javax.naming.directory.AttributeModificationException(java.lang.String)}.
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
    public void create_AttributeModificationException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AttributeModificationException sut = null; // = new AttributeModificationException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.directory.AttributeModificationException#AttributeModificationException() public
     * javax.naming.directory.AttributeModificationException()}.
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
    public void create_AttributeModificationException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AttributeModificationException sut = new AttributeModificationException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.directory.AttributeModificationException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.directory.AttributeModificationException]

}
