package org.j8unit.repository.javax.xml.crypto.dsig.spec;

import javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpec;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XPathFilter2ParameterSpec} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpecClassTests}).
 */
@RunWith(J8Unit4.class)
public class XPathFilter2ParameterSpecClassTest
implements XPathFilter2ParameterSpecClassTests<XPathFilter2ParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpec]

    @Override
    public Class<XPathFilter2ParameterSpec> createNewSUT() {
        return XPathFilter2ParameterSpec.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpec#XPathFilter2ParameterSpec(java.util.List) public
     * javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpec(java.util.List)}.
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
    public void create_XPathFilter2ParameterSpec_List()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final XPathFilter2ParameterSpec sut = null; // = new XPathFilter2ParameterSpec(java.util.List);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpec]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpec]

}
