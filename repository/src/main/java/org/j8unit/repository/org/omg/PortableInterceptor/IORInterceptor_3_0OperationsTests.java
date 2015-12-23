package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.PortableInterceptor.IORInterceptor_3_0Operations interface
 * org.omg.PortableInterceptor.IORInterceptor_3_0Operations}, containing all instance relevant test methods
 * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
 * class relevant test methods is
 * {@link org.j8unit.repository.org.omg.PortableInterceptor.IORInterceptor_3_0OperationsTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.PortableInterceptor.IORInterceptor_3_0OperationsClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.PortableInterceptor.IORInterceptor_3_0Operations
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IORInterceptor_3_0OperationsTests<SUT extends org.omg.PortableInterceptor.IORInterceptor_3_0Operations>
extends org.j8unit.repository.org.omg.PortableInterceptor.IORInterceptorOperationsTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableInterceptor.IORInterceptor_3_0Operations#adapter_manager_state_changed(int, short) public
     * abstract void org.omg.PortableInterceptor.IORInterceptor_3_0Operations.adapter_manager_state_changed(int,short)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.PortableInterceptor.IORInterceptor_3_0Operations#adapter_manager_state_changed(int, short)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_adapter_manager_state_changed_int_short()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableInterceptor.IORInterceptor_3_0Operations#adapter_state_changed(org.omg.PortableInterceptor.ObjectReferenceTemplate[], short)
     * public abstract void
     * org.omg.PortableInterceptor.IORInterceptor_3_0Operations.adapter_state_changed(org.omg.PortableInterceptor.ObjectReferenceTemplate[],short)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.PortableInterceptor.IORInterceptor_3_0Operations#adapter_state_changed(org.omg.
     *             PortableInterceptor.ObjectReferenceTemplate[], short)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_adapter_state_changed_ObjectReferenceTemplateArray_short()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableInterceptor.IORInterceptor_3_0Operations#components_established(org.omg.PortableInterceptor.IORInfo)
     * public abstract void
     * org.omg.PortableInterceptor.IORInterceptor_3_0Operations.components_established(org.omg.PortableInterceptor.IORInfo)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.PortableInterceptor.IORInterceptor_3_0Operations#components_established(org.omg.
     *             PortableInterceptor.IORInfo)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_components_established_IORInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
