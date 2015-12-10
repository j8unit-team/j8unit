package org.j8unit.repository.javax.xml.xpath;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XPathFunctionClassTest
implements org.j8unit.repository.javax.xml.xpath.XPathFunctionClassTests<javax.xml.xpath.XPathFunction> {

    @Override
    public Class<javax.xml.xpath.XPathFunction> createNewSUT() {
        return javax.xml.xpath.XPathFunction.class;
    }

}
