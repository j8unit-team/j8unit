package org.j8unit.repository.javax.naming.directory;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.naming.directory.AttributeModificationException class
 * javax.naming.directory.AttributeModificationException}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.naming.directory.AttributeModificationExceptionClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AttributeModificationExceptionTests<SUT extends javax.naming.directory.AttributeModificationException>
extends org.j8unit.repository.javax.naming.NamingExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.naming.directory.AttributeModificationException#getUnexecutedModifications() public
     * javax.naming.directory.ModificationItem[]
     * javax.naming.directory.AttributeModificationException.getUnexecutedModifications()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUnexecutedModifications()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.naming.directory.AttributeModificationException#setUnexecutedModifications(javax.naming.directory.ModificationItem[])
     * public void
     * javax.naming.directory.AttributeModificationException.setUnexecutedModifications(javax.naming.directory.ModificationItem[])}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setUnexecutedModifications_ModificationItemArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.directory.AttributeModificationException#toString() public java.lang.String
     * javax.naming.directory.AttributeModificationException.toString()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
