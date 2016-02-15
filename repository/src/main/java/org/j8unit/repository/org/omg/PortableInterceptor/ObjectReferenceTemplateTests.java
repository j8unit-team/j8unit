package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableInterceptor.ObjectReferenceTemplate interface
 * org.omg.PortableInterceptor.ObjectReferenceTemplate}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link ObjectReferenceTemplateClassTests}.
 * </p>
 *
 * @see org.omg.PortableInterceptor.ObjectReferenceTemplate interface
 *      org.omg.PortableInterceptor.ObjectReferenceTemplate (the hereby targeted class-under-test class)
 * @see ObjectReferenceTemplateClassTests ObjectReferenceTemplateClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ObjectReferenceTemplateTests<SUT extends org.omg.PortableInterceptor.ObjectReferenceTemplate>
extends ObjectReferenceFactoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.PortableInterceptor.ObjectReferenceTemplate#orb_id() public abstract
     * java.lang.String org.omg.PortableInterceptor.ObjectReferenceTemplate.orb_id()}.
     *
     * <p>
     * Test method for {@link org.omg.PortableInterceptor.ObjectReferenceTemplate#orb_id() public abstract
     * java.lang.String org.omg.PortableInterceptor.ObjectReferenceTemplate.orb_id()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableInterceptor.ObjectReferenceTemplate#orb_id() public abstract java.lang.String
     *      org.omg.PortableInterceptor.ObjectReferenceTemplate.orb_id() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_orb_id()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableInterceptor.ObjectReferenceTemplate#adapter_name() public abstract
     * java.lang.String[] org.omg.PortableInterceptor.ObjectReferenceTemplate.adapter_name()}.
     *
     * <p>
     * Test method for {@link org.omg.PortableInterceptor.ObjectReferenceTemplate#adapter_name() public abstract
     * java.lang.String[] org.omg.PortableInterceptor.ObjectReferenceTemplate.adapter_name()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableInterceptor.ObjectReferenceTemplate#adapter_name() public abstract java.lang.String[]
     *      org.omg.PortableInterceptor.ObjectReferenceTemplate.adapter_name() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_adapter_name()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableInterceptor.ObjectReferenceTemplate#server_id() public abstract
     * java.lang.String org.omg.PortableInterceptor.ObjectReferenceTemplate.server_id()}.
     *
     * <p>
     * Test method for {@link org.omg.PortableInterceptor.ObjectReferenceTemplate#server_id() public abstract
     * java.lang.String org.omg.PortableInterceptor.ObjectReferenceTemplate.server_id()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableInterceptor.ObjectReferenceTemplate#server_id() public abstract java.lang.String
     *      org.omg.PortableInterceptor.ObjectReferenceTemplate.server_id() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_server_id()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
