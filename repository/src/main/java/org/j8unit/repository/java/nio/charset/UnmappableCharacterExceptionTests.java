package org.j8unit.repository.java.nio.charset;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.nio.charset.UnmappableCharacterException class
 * java.nio.charset.UnmappableCharacterException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.charset.UnmappableCharacterExceptionClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnmappableCharacterExceptionTests<SUT extends java.nio.charset.UnmappableCharacterException>
extends org.j8unit.repository.java.nio.charset.CharacterCodingExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.charset.UnmappableCharacterException#getInputLength() public int
     * java.nio.charset.UnmappableCharacterException.getInputLength()}.
     * </p>
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
     * Test method for {@link java.nio.charset.UnmappableCharacterException#getMessage() public java.lang.String
     * java.nio.charset.UnmappableCharacterException.getMessage()}.
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
