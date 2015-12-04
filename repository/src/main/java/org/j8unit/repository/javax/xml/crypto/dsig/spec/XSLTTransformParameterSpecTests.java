package org.j8unit.repository.javax.xml.crypto.dsig.spec;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec class
 * javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.crypto.dsig.spec.XSLTTransformParameterSpecClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface XSLTTransformParameterSpecTests<SUT extends javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec>
extends org.j8unit.repository.javax.xml.crypto.dsig.spec.TransformParameterSpecTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec#getStylesheet() public
     * javax.xml.crypto.XMLStructure javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec.getStylesheet()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStylesheet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
