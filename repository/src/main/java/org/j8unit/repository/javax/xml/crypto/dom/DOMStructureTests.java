package org.j8unit.repository.javax.xml.crypto.dom;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.crypto.dom.DOMStructure class javax.xml.crypto.dom.DOMStructure}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.crypto.dom.DOMStructureClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DOMStructureTests<SUT extends javax.xml.crypto.dom.DOMStructure>
extends org.j8unit.repository.javax.xml.crypto.XMLStructureTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dom.DOMStructure#isFeatureSupported(java.lang.String) public boolean
     * javax.xml.crypto.dom.DOMStructure.isFeatureSupported(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
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
     * </p>
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
