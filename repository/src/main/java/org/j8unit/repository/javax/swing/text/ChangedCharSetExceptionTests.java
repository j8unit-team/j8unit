package org.j8unit.repository.javax.swing.text;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.text.ChangedCharSetException class javax.swing.text.ChangedCharSetException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.text.ChangedCharSetExceptionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ChangedCharSetExceptionTests<SUT extends javax.swing.text.ChangedCharSetException>
extends org.j8unit.repository.java.io.IOExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.text.ChangedCharSetException#getCharSetSpec() public java.lang.String
     * javax.swing.text.ChangedCharSetException.getCharSetSpec()}.
     * </p>
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
     * </p>
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
