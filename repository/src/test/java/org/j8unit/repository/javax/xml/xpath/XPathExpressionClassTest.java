package org.j8unit.repository.javax.xml.xpath;

import javax.xml.xpath.XPathExpression;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XPathExpression} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.xpath.XPathExpressionClassTests}).
 */

@RunWith(J8Unit4.class)
public class XPathExpressionClassTest
implements XPathExpressionClassTests<XPathExpression> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.xpath.XPathExpression]

    @Override
    public Class<XPathExpression> createNewSUT() {
        return XPathExpression.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.xpath.XPathExpression]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.xpath.XPathExpression]

}
