package org.j8unit.repository.javax.xml.crypto.dsig.spec;

import javax.xml.crypto.dsig.spec.XPathFilterParameterSpec;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XPathFilterParameterSpec} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.xml.crypto.dsig.spec.XPathFilterParameterSpecClassTests}).
 */

@RunWith(J8Unit4.class)
public class XPathFilterParameterSpecClassTest
implements XPathFilterParameterSpecClassTests<XPathFilterParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.spec.XPathFilterParameterSpec]

    @Override
    public Class<XPathFilterParameterSpec> createNewSUT() {
        return XPathFilterParameterSpec.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.crypto.dsig.spec.XPathFilterParameterSpec#XPathFilterParameterSpec(String, java.util.Map) public
     * javax.xml.crypto.dsig.spec.XPathFilterParameterSpec(java.lang.String,java.util.Map)}.
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
    public void create_XPathFilterParameterSpec_String_Map()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final XPathFilterParameterSpec sut = null; // = new XPathFilterParameterSpec(String, java.util.Map);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.crypto.dsig.spec.XPathFilterParameterSpec#XPathFilterParameterSpec(String) public
     * javax.xml.crypto.dsig.spec.XPathFilterParameterSpec(java.lang.String)}.
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
    public void create_XPathFilterParameterSpec_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final XPathFilterParameterSpec sut = null; // = new XPathFilterParameterSpec(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.spec.XPathFilterParameterSpec]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.spec.XPathFilterParameterSpec]

}
