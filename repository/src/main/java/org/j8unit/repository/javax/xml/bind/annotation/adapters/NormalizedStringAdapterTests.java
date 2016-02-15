package org.j8unit.repository.javax.xml.bind.annotation.adapters;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.bind.annotation.adapters.NormalizedStringAdapter class
 * javax.xml.bind.annotation.adapters.NormalizedStringAdapter}. The complementary j8unit test interface containing the
 * class relevant aspects is {@link NormalizedStringAdapterClassTests}.
 * </p>
 *
 * @see javax.xml.bind.annotation.adapters.NormalizedStringAdapter class
 *      javax.xml.bind.annotation.adapters.NormalizedStringAdapter (the hereby targeted class-under-test class)
 * @see NormalizedStringAdapterClassTests NormalizedStringAdapterClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NormalizedStringAdapterTests<SUT extends javax.xml.bind.annotation.adapters.NormalizedStringAdapter>
extends XmlAdapterTests<SUT, String, String> {

    /**
     * <p>
     * Test method for {@link javax.xml.bind.annotation.adapters.NormalizedStringAdapter#unmarshal(String) public
     * java.lang.String javax.xml.bind.annotation.adapters.NormalizedStringAdapter.unmarshal(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.annotation.adapters.NormalizedStringAdapter#unmarshal(String) public
     * java.lang.String javax.xml.bind.annotation.adapters.NormalizedStringAdapter.unmarshal(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.annotation.adapters.NormalizedStringAdapter#unmarshal(String) public java.lang.String
     *      javax.xml.bind.annotation.adapters.NormalizedStringAdapter.unmarshal(java.lang.String) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unmarshal_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.annotation.adapters.NormalizedStringAdapter#marshal(String) public
     * java.lang.String javax.xml.bind.annotation.adapters.NormalizedStringAdapter.marshal(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.annotation.adapters.NormalizedStringAdapter#marshal(String) public
     * java.lang.String javax.xml.bind.annotation.adapters.NormalizedStringAdapter.marshal(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.annotation.adapters.NormalizedStringAdapter#marshal(String) public java.lang.String
     *      javax.xml.bind.annotation.adapters.NormalizedStringAdapter.marshal(java.lang.String) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_marshal_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
