package org.j8unit.repository.javax.xml.xpath;

import javax.xml.xpath.XPathExpression;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XPathExpressionClassTest
implements org.j8unit.repository.javax.xml.xpath.XPathExpressionClassTests<XPathExpression> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.xpath.XPathExpression]

    @Override
    public Class<XPathExpression> createNewSUT() {
        return XPathExpression.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.xpath.XPathExpression]

}
