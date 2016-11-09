package org.j8unit.repository.javax.xml.crypto.dsig.spec;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XSLTTransformParameterSpec} (by simply
 * reusing the J8Unit test interface {@link XSLTTransformParameterSpecClassTests}).
 */

@RunWith(J8Unit4.class)
public class XSLTTransformParameterSpecClassTest
implements XSLTTransformParameterSpecClassTests<XSLTTransformParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec]

    @Override
    public Class<XSLTTransformParameterSpec> createNewSUT() {
        return XSLTTransformParameterSpec.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec#XSLTTransformParameterSpec(javax.xml.crypto.XMLStructure)
     * public javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec(javax.xml.crypto.XMLStructure)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_XSLTTransformParameterSpec_XMLStructure()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final XSLTTransformParameterSpec sut = null; // = new XSLTTransformParameterSpec(javax.xml.crypto.XMLStructure);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec]

}
