package org.j8unit.repository.javax.xml.crypto.dsig.spec;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpec class
 * javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpec}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpecTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpecClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpec
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XPathFilter2ParameterSpecTests<SUT extends javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpec>
extends org.j8unit.repository.javax.xml.crypto.dsig.spec.TransformParameterSpecTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpec#getXPathList() public java.util.List
     * javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpec.getXPathList()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpec#getXPathList()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getXPathList()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
