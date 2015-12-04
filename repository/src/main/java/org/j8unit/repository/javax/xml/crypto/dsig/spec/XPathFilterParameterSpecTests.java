package org.j8unit.repository.javax.xml.crypto.dsig.spec;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.crypto.dsig.spec.XPathFilterParameterSpec class javax.xml.crypto.dsig.spec.XPathFilterParameterSpec},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.crypto.dsig.spec.XPathFilterParameterSpecClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface XPathFilterParameterSpecTests<SUT extends javax.xml.crypto.dsig.spec.XPathFilterParameterSpec>
extends org.j8unit.repository.javax.xml.crypto.dsig.spec.TransformParameterSpecTests<SUT>,
        org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.spec.XPathFilterParameterSpec#getNamespaceMap() public java.util.Map javax.xml.crypto.dsig.spec.XPathFilterParameterSpec.getNamespaceMap()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNamespaceMap() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.spec.XPathFilterParameterSpec#getXPath() public java.lang.String javax.xml.crypto.dsig.spec.XPathFilterParameterSpec.getXPath()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getXPath() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
