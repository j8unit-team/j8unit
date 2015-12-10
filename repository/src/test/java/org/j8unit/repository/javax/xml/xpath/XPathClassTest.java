package org.j8unit.repository.javax.xml.xpath;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XPathClassTest
implements org.j8unit.repository.javax.xml.xpath.XPathClassTests<javax.xml.xpath.XPath> {

    @Override
    public Class<javax.xml.xpath.XPath> createNewSUT() {
        return javax.xml.xpath.XPath.class;
    }

}
