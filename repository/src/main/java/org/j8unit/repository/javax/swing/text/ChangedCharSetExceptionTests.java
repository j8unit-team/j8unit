package org.j8unit.repository.javax.swing.text;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.text.ChangedCharSetException class
 * javax.swing.text.ChangedCharSetException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ChangedCharSetExceptionClassTests}.
 * </p>
 *
 * @see javax.swing.text.ChangedCharSetException class javax.swing.text.ChangedCharSetException (the hereby targeted
 *      class-under-test class)
 * @see ChangedCharSetExceptionClassTests ChangedCharSetExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ChangedCharSetExceptionTests<SUT extends javax.swing.text.ChangedCharSetException>
extends org.j8unit.repository.java.io.IOExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.text.ChangedCharSetException#getCharSetSpec() public java.lang.String
     * javax.swing.text.ChangedCharSetException.getCharSetSpec()}.
     *
     * <p>
     * Test method for {@link javax.swing.text.ChangedCharSetException#getCharSetSpec() public java.lang.String
     * javax.swing.text.ChangedCharSetException.getCharSetSpec()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.text.ChangedCharSetException#getCharSetSpec() public java.lang.String
     *      javax.swing.text.ChangedCharSetException.getCharSetSpec() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCharSetSpec()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.ChangedCharSetException#keyEqualsCharSet() public boolean
     * javax.swing.text.ChangedCharSetException.keyEqualsCharSet()}.
     *
     * <p>
     * Test method for {@link javax.swing.text.ChangedCharSetException#keyEqualsCharSet() public boolean
     * javax.swing.text.ChangedCharSetException.keyEqualsCharSet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.text.ChangedCharSetException#keyEqualsCharSet() public boolean
     *      javax.swing.text.ChangedCharSetException.keyEqualsCharSet() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_keyEqualsCharSet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
