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
 * Test class for {@link javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpec class javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpec},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpecClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface XPathFilter2ParameterSpecTests<SUT extends javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpec>
extends org.j8unit.repository.javax.xml.crypto.dsig.spec.TransformParameterSpecTests<SUT>,
        org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpec#getXPathList() public java.util.List javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpec.getXPathList()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getXPathList() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
