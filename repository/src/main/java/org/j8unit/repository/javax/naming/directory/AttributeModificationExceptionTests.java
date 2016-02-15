package org.j8unit.repository.javax.naming.directory;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.naming.directory.AttributeModificationException class
 * javax.naming.directory.AttributeModificationException}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link AttributeModificationExceptionClassTests}.
 * </p>
 *
 * @see javax.naming.directory.AttributeModificationException class
 *      javax.naming.directory.AttributeModificationException (the hereby targeted class-under-test class)
 * @see AttributeModificationExceptionClassTests AttributeModificationExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AttributeModificationExceptionTests<SUT extends javax.naming.directory.AttributeModificationException>
extends org.j8unit.repository.javax.naming.NamingExceptionTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.naming.directory.AttributeModificationException#setUnexecutedModifications(javax.naming.directory.ModificationItem[])
     * public void
     * javax.naming.directory.AttributeModificationException.setUnexecutedModifications(javax.naming.directory.ModificationItem[])}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.naming.directory.AttributeModificationException#setUnexecutedModifications(javax.naming.directory.ModificationItem[])
     * public void
     * javax.naming.directory.AttributeModificationException.setUnexecutedModifications(javax.naming.directory.ModificationItem[])}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.directory.AttributeModificationException#setUnexecutedModifications(javax.naming.directory.ModificationItem[])
     *      public void
     *      javax.naming.directory.AttributeModificationException.setUnexecutedModifications(javax.naming.directory.
     *      ModificationItem[]) (the hereby targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link javax.naming.directory.AttributeModificationException#toString() public java.lang.String
     * javax.naming.directory.AttributeModificationException.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.directory.AttributeModificationException#toString() public java.lang.String
     *      javax.naming.directory.AttributeModificationException.toString() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.directory.AttributeModificationException#getUnexecutedModifications() public
     * javax.naming.directory.ModificationItem[]
     * javax.naming.directory.AttributeModificationException.getUnexecutedModifications()}.
     *
     * <p>
     * Test method for {@link javax.naming.directory.AttributeModificationException#getUnexecutedModifications() public
     * javax.naming.directory.ModificationItem[]
     * javax.naming.directory.AttributeModificationException.getUnexecutedModifications()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.directory.AttributeModificationException#getUnexecutedModifications() public
     *      javax.naming.directory.ModificationItem[]
     *      javax.naming.directory.AttributeModificationException.getUnexecutedModifications() (the hereby targeted
     *      method-under-test)
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

}
