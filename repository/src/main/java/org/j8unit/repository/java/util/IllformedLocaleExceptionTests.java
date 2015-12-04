package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.IllformedLocaleException class java.util.IllformedLocaleException}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.IllformedLocaleExceptionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface IllformedLocaleExceptionTests<SUT extends java.util.IllformedLocaleException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.IllformedLocaleException#getErrorIndex() public int
     * java.util.IllformedLocaleException.getErrorIndex()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getErrorIndex()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
