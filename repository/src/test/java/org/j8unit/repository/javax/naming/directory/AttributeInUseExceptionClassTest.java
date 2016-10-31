package org.j8unit.repository.javax.naming.directory;

import javax.naming.directory.AttributeInUseException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributeInUseExceptionClassTest
implements org.j8unit.repository.javax.naming.directory.AttributeInUseExceptionClassTests<AttributeInUseException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.directory.AttributeInUseException]

    @Override
    public Class<AttributeInUseException> createNewSUT() {
        return AttributeInUseException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.directory.AttributeInUseException#AttributeInUseException(String) public
     * javax.naming.directory.AttributeInUseException(java.lang.String)}.
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
    public void create_AttributeInUseException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AttributeInUseException sut = null; // = new AttributeInUseException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.directory.AttributeInUseException#AttributeInUseException() public
     * javax.naming.directory.AttributeInUseException()}.
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
    public void create_AttributeInUseException()
    throws Exception {
        // create new instance
        final AttributeInUseException sut = new AttributeInUseException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.directory.AttributeInUseException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.directory.AttributeInUseException]

}
