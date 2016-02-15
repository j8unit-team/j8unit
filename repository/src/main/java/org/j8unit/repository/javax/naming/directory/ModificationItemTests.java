package org.j8unit.repository.javax.naming.directory;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.naming.directory.ModificationItem class
 * javax.naming.directory.ModificationItem}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ModificationItemClassTests}.
 * </p>
 *
 * @see javax.naming.directory.ModificationItem class javax.naming.directory.ModificationItem (the hereby targeted
 *      class-under-test class)
 * @see ModificationItemClassTests ModificationItemClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ModificationItemTests<SUT extends javax.naming.directory.ModificationItem>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.naming.directory.ModificationItem#getAttribute() public
     * javax.naming.directory.Attribute javax.naming.directory.ModificationItem.getAttribute()}.
     *
     * <p>
     * Test method for {@link javax.naming.directory.ModificationItem#getAttribute() public
     * javax.naming.directory.Attribute javax.naming.directory.ModificationItem.getAttribute()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.directory.ModificationItem#getAttribute() public javax.naming.directory.Attribute
     *      javax.naming.directory.ModificationItem.getAttribute() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttribute()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.directory.ModificationItem#getModificationOp() public int
     * javax.naming.directory.ModificationItem.getModificationOp()}.
     *
     * <p>
     * Test method for {@link javax.naming.directory.ModificationItem#getModificationOp() public int
     * javax.naming.directory.ModificationItem.getModificationOp()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.directory.ModificationItem#getModificationOp() public int
     *      javax.naming.directory.ModificationItem.getModificationOp() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getModificationOp()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.directory.ModificationItem#toString() public java.lang.String
     * javax.naming.directory.ModificationItem.toString()}.
     *
     * <p>
     * Test method for {@link javax.naming.directory.ModificationItem#toString() public java.lang.String
     * javax.naming.directory.ModificationItem.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.directory.ModificationItem#toString() public java.lang.String
     *      javax.naming.directory.ModificationItem.toString() (the hereby targeted method-under-test)
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

}
