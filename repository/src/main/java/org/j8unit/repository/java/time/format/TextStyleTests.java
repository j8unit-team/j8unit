package org.j8unit.repository.java.time.format;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.time.format.TextStyle class java.time.format.TextStyle}, containing all instance relevant
 * test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.time.format.TextStyleClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface TextStyleTests<SUT extends java.time.format.TextStyle>
extends org.j8unit.repository.java.lang.EnumTests<SUT, java.time.format.TextStyle> {

    /**
     * <p>
     * Test method for {@link java.time.format.TextStyle#isStandalone() public boolean
     * java.time.format.TextStyle.isStandalone()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isStandalone()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.format.TextStyle#asNormal() public java.time.format.TextStyle
     * java.time.format.TextStyle.asNormal()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_asNormal()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.format.TextStyle#asStandalone() public java.time.format.TextStyle
     * java.time.format.TextStyle.asStandalone()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_asStandalone()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
