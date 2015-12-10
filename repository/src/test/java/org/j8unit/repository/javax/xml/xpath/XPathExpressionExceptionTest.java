package org.j8unit.repository.javax.xml.xpath;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XPathExpressionExceptionTest
implements org.j8unit.repository.javax.xml.xpath.XPathExpressionExceptionTests<javax.xml.xpath.XPathExpressionException> {

    @Override
    public javax.xml.xpath.XPathExpressionException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.xml.xpath.XPathExpressionException] available.");
    }

}
