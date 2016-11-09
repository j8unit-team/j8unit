package org.j8unit.repository.javax.xml.xpath;

import javax.xml.xpath.XPathVariableResolver;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XPathVariableResolver} (by simply reusing
 * the J8Unit test interface {@link XPathVariableResolverClassTests}).
 */

@RunWith(J8Unit4.class)
public class XPathVariableResolverClassTest
implements XPathVariableResolverClassTests<XPathVariableResolver> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.xpath.XPathVariableResolver]

    @Override
    public Class<XPathVariableResolver> createNewSUT() {
        return XPathVariableResolver.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.xpath.XPathVariableResolver]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.xpath.XPathVariableResolver]

}
