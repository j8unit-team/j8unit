package org.j8unit.repository.javax.xml.crypto.dom;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.crypto.dom.DOMStructure class javax.xml.crypto.dom.DOMStructure}
 * . The complementary j8unit test interface containing the class relevant aspects is {@link DOMStructureClassTests}.
 * </p>
 *
 * @see javax.xml.crypto.dom.DOMStructure class javax.xml.crypto.dom.DOMStructure (the hereby targeted class-under-test
 *      class)
 * @see DOMStructureClassTests DOMStructureClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DOMStructureTests<SUT extends javax.xml.crypto.dom.DOMStructure>
extends org.j8unit.repository.javax.xml.crypto.XMLStructureTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dom.DOMStructure#isFeatureSupported(String) public boolean
     * javax.xml.crypto.dom.DOMStructure.isFeatureSupported(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dom.DOMStructure#isFeatureSupported(String) public boolean
     * javax.xml.crypto.dom.DOMStructure.isFeatureSupported(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dom.DOMStructure#isFeatureSupported(String) public boolean
     *      javax.xml.crypto.dom.DOMStructure.isFeatureSupported(java.lang.String) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isFeatureSupported_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dom.DOMStructure#getNode() public org.w3c.dom.Node
     * javax.xml.crypto.dom.DOMStructure.getNode()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dom.DOMStructure#getNode() public org.w3c.dom.Node
     * javax.xml.crypto.dom.DOMStructure.getNode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dom.DOMStructure#getNode() public org.w3c.dom.Node
     *      javax.xml.crypto.dom.DOMStructure.getNode() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
