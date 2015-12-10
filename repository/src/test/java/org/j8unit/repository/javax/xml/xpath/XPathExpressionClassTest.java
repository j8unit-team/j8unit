package org.j8unit.repository.javax.xml.xpath;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XPathExpressionClassTest
implements org.j8unit.repository.javax.xml.xpath.XPathExpressionClassTests<javax.xml.xpath.XPathExpression> {

    @Override
    public Class<javax.xml.xpath.XPathExpression> createNewSUT() {
        return javax.xml.xpath.XPathExpression.class;
    }

}
