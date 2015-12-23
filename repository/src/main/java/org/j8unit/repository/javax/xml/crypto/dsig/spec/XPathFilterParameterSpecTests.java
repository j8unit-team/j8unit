package org.j8unit.repository.javax.xml.crypto.dsig.spec;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.crypto.dsig.spec.XPathFilterParameterSpec class
 * javax.xml.crypto.dsig.spec.XPathFilterParameterSpec}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.xml.crypto.dsig.spec.XPathFilterParameterSpecTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.crypto.dsig.spec.XPathFilterParameterSpecClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.crypto.dsig.spec.XPathFilterParameterSpec
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XPathFilterParameterSpecTests<SUT extends javax.xml.crypto.dsig.spec.XPathFilterParameterSpec>
extends org.j8unit.repository.javax.xml.crypto.dsig.spec.TransformParameterSpecTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.spec.XPathFilterParameterSpec#getNamespaceMap() public java.util.Map
     * javax.xml.crypto.dsig.spec.XPathFilterParameterSpec.getNamespaceMap()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.crypto.dsig.spec.XPathFilterParameterSpec#getNamespaceMap()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNamespaceMap()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.spec.XPathFilterParameterSpec#getXPath() public java.lang.String
     * javax.xml.crypto.dsig.spec.XPathFilterParameterSpec.getXPath()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.crypto.dsig.spec.XPathFilterParameterSpec#getXPath()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getXPath()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
