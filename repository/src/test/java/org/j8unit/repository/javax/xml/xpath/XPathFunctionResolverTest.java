package org.j8unit.repository.javax.xml.xpath;

import javax.xml.xpath.XPathFunctionResolver;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XPathFunctionResolver} (by simply
 * reusing the J8Unit test interface {@link XPathFunctionResolverTests}).
 */

@RunWith(J8Unit4.class)
public class XPathFunctionResolverTest
implements XPathFunctionResolverTests<XPathFunctionResolver> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.xpath.XPathFunctionResolver]

    @Override
    public XPathFunctionResolver createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.xpath.XPathFunctionResolver], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.xpath.XPathFunctionResolver]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.xpath.XPathFunctionResolver]

}
