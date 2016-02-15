package org.j8unit.repository.java.time.format;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.time.format.DateTimeParseException class
 * java.time.format.DateTimeParseException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link DateTimeParseExceptionClassTests}.
 * </p>
 *
 * @see java.time.format.DateTimeParseException class java.time.format.DateTimeParseException (the hereby targeted
 *      class-under-test class)
 * @see DateTimeParseExceptionClassTests DateTimeParseExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DateTimeParseExceptionTests<SUT extends java.time.format.DateTimeParseException>
extends org.j8unit.repository.java.time.DateTimeExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.time.format.DateTimeParseException#getErrorIndex() public int
     * java.time.format.DateTimeParseException.getErrorIndex()}.
     *
     * <p>
     * Test method for {@link java.time.format.DateTimeParseException#getErrorIndex() public int
     * java.time.format.DateTimeParseException.getErrorIndex()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.format.DateTimeParseException#getErrorIndex() public int
     *      java.time.format.DateTimeParseException.getErrorIndex() (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link java.time.format.DateTimeParseException#getParsedString() public java.lang.String
     * java.time.format.DateTimeParseException.getParsedString()}.
     *
     * <p>
     * Test method for {@link java.time.format.DateTimeParseException#getParsedString() public java.lang.String
     * java.time.format.DateTimeParseException.getParsedString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.time.format.DateTimeParseException#getParsedString() public java.lang.String
     *      java.time.format.DateTimeParseException.getParsedString() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getParsedString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
