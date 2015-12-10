package org.j8unit.repository.javax.xml.xpath;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XPathFunctionExceptionTest
implements org.j8unit.repository.javax.xml.xpath.XPathFunctionExceptionTests<javax.xml.xpath.XPathFunctionException> {

    @Override
    public javax.xml.xpath.XPathFunctionException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.xml.xpath.XPathFunctionException] available.");
    }

}
