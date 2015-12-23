package org.j8unit.repository.java.nio.charset;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.nio.charset.IllegalCharsetNameException class
 * java.nio.charset.IllegalCharsetNameException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.nio.charset.IllegalCharsetNameExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.nio.charset.IllegalCharsetNameExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.nio.charset.IllegalCharsetNameException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IllegalCharsetNameExceptionTests<SUT extends java.nio.charset.IllegalCharsetNameException>
extends org.j8unit.repository.java.lang.IllegalArgumentExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.charset.IllegalCharsetNameException#getCharsetName() public java.lang.String
     * java.nio.charset.IllegalCharsetNameException.getCharsetName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.nio.charset.IllegalCharsetNameException#getCharsetName()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCharsetName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
