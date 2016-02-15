package org.j8unit.repository.java.rmi.dgc;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.dgc.Lease class java.rmi.dgc.Lease}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link LeaseClassTests}.
 * </p>
 *
 * @see java.rmi.dgc.Lease class java.rmi.dgc.Lease (the hereby targeted class-under-test class)
 * @see LeaseClassTests LeaseClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LeaseTests<SUT extends java.rmi.dgc.Lease>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.rmi.dgc.Lease#getValue() public long java.rmi.dgc.Lease.getValue()}.
     *
     * <p>
     * Test method for {@link java.rmi.dgc.Lease#getValue() public long java.rmi.dgc.Lease.getValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.dgc.Lease#getValue() public long java.rmi.dgc.Lease.getValue() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.dgc.Lease#getVMID() public java.rmi.dgc.VMID java.rmi.dgc.Lease.getVMID()}.
     *
     * <p>
     * Test method for {@link java.rmi.dgc.Lease#getVMID() public java.rmi.dgc.VMID java.rmi.dgc.Lease.getVMID()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.dgc.Lease#getVMID() public java.rmi.dgc.VMID java.rmi.dgc.Lease.getVMID() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getVMID()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
