package org.j8unit.repository.javax.swing.text;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.text.ChangedCharSetException class
 * javax.swing.text.ChangedCharSetException}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.text.ChangedCharSetExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.text.ChangedCharSetExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.text.ChangedCharSetException
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.ChangedCharSetException#getCharSetSpec()
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.ChangedCharSetException#keyEqualsCharSet()
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
