package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.UnknownFormatFlagsException class java.util.UnknownFormatFlagsException}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.UnknownFormatFlagsExceptionClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnknownFormatFlagsExceptionTests<SUT extends java.util.UnknownFormatFlagsException>
extends org.j8unit.repository.java.util.IllegalFormatExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.UnknownFormatFlagsException#getFlags() public java.lang.String
     * java.util.UnknownFormatFlagsException.getFlags()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFlags()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.UnknownFormatFlagsException#getMessage() public java.lang.String
     * java.util.UnknownFormatFlagsException.getMessage()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getMessage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
