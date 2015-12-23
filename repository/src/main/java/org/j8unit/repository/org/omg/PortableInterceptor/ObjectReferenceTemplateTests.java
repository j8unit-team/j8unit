package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.PortableInterceptor.ObjectReferenceTemplate interface
 * org.omg.PortableInterceptor.ObjectReferenceTemplate}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.org.omg.PortableInterceptor.ObjectReferenceTemplateTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.PortableInterceptor.ObjectReferenceTemplateClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.PortableInterceptor.ObjectReferenceTemplate
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ObjectReferenceTemplateTests<SUT extends org.omg.PortableInterceptor.ObjectReferenceTemplate>
extends org.j8unit.repository.org.omg.PortableInterceptor.ObjectReferenceFactoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.PortableInterceptor.ObjectReferenceTemplate#adapter_name() public abstract
     * java.lang.String[] org.omg.PortableInterceptor.ObjectReferenceTemplate.adapter_name()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.PortableInterceptor.ObjectReferenceTemplate#adapter_name()
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
     * Test method for {@link org.omg.PortableInterceptor.ObjectReferenceTemplate#orb_id() public abstract
     * java.lang.String org.omg.PortableInterceptor.ObjectReferenceTemplate.orb_id()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.PortableInterceptor.ObjectReferenceTemplate#orb_id()
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
     * Test method for {@link org.omg.PortableInterceptor.ObjectReferenceTemplate#server_id() public abstract
     * java.lang.String org.omg.PortableInterceptor.ObjectReferenceTemplate.server_id()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.PortableInterceptor.ObjectReferenceTemplate#server_id()
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
