package org.j8unit.repository.java.nio.charset;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.charset.MalformedInputException class
 * java.nio.charset.MalformedInputException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link MalformedInputExceptionClassTests}.
 * </p>
 *
 * @see java.nio.charset.MalformedInputException class java.nio.charset.MalformedInputException (the hereby targeted
 *      class-under-test class)
 * @see MalformedInputExceptionClassTests MalformedInputExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MalformedInputExceptionTests<SUT extends java.nio.charset.MalformedInputException>
extends CharacterCodingExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.charset.MalformedInputException#getInputLength() public int
     * java.nio.charset.MalformedInputException.getInputLength()}.
     *
     * <p>
     * Test method for {@link java.nio.charset.MalformedInputException#getInputLength() public int
     * java.nio.charset.MalformedInputException.getInputLength()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.charset.MalformedInputException#getInputLength() public int
     *      java.nio.charset.MalformedInputException.getInputLength() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInputLength()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.charset.MalformedInputException#getMessage() public java.lang.String
     * java.nio.charset.MalformedInputException.getMessage()}.
     *
     * <p>
     * Test method for {@link java.nio.charset.MalformedInputException#getMessage() public java.lang.String
     * java.nio.charset.MalformedInputException.getMessage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.charset.MalformedInputException#getMessage() public java.lang.String
     *      java.nio.charset.MalformedInputException.getMessage() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getMessage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
