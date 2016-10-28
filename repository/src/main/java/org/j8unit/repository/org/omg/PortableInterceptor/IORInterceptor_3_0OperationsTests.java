package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.omg.PortableInterceptor.IORInfo;
import org.omg.PortableInterceptor.IORInterceptor_3_0Operations;
import org.omg.PortableInterceptor.ObjectReferenceTemplate;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link IORInterceptor_3_0Operations public abstract interface
 * org.omg.PortableInterceptor.IORInterceptor_3_0Operations}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.org.omg.PortableInterceptor.IORInterceptor_3_0OperationsClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IORInterceptor_3_0OperationsTests<SUT extends IORInterceptor_3_0Operations>
extends org.j8unit.repository.org.omg.PortableInterceptor.IORInterceptorOperationsTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableInterceptor.IORInterceptor_3_0Operations]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link IORInterceptor_3_0Operations#adapter_state_changed(ObjectReferenceTemplate[], short) public abstract void
     * org.omg.PortableInterceptor.IORInterceptor_3_0Operations.adapter_state_changed(org.omg.PortableInterceptor.ObjectReferenceTemplate[],short)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
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
     * Test method for the hereby targeted method-under-test
     * {@link IORInterceptor_3_0Operations#adapter_manager_state_changed(int, short) public abstract void
     * org.omg.PortableInterceptor.IORInterceptor_3_0Operations.adapter_manager_state_changed(int,short)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
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
     * Test method for the hereby targeted method-under-test
     * {@link IORInterceptor_3_0Operations#components_established(IORInfo) public abstract void
     * org.omg.PortableInterceptor.IORInterceptor_3_0Operations.components_established(org.omg.PortableInterceptor.IORInfo)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
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

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableInterceptor.IORInterceptor_3_0Operations]

}
