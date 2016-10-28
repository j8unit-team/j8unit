package org.j8unit.repository.javax.management;

import javax.management.InvalidAttributeValueException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidAttributeValueExceptionClassTest
implements org.j8unit.repository.javax.management.InvalidAttributeValueExceptionClassTests<InvalidAttributeValueException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.InvalidAttributeValueException]

    @Override
    public Class<InvalidAttributeValueException> createNewSUT() {
        return InvalidAttributeValueException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link InvalidAttributeValueException#InvalidAttributeValueException() public
     * javax.management.InvalidAttributeValueException()}.
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
    public void create_InvalidAttributeValueException()
    throws Exception {
        // create new instance
        final InvalidAttributeValueException sut = new InvalidAttributeValueException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link InvalidAttributeValueException#InvalidAttributeValueException(String) public
     * javax.management.InvalidAttributeValueException(java.lang.String)}.
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
    public void create_InvalidAttributeValueException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidAttributeValueException sut = null; // = new InvalidAttributeValueException(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.InvalidAttributeValueException]

}
