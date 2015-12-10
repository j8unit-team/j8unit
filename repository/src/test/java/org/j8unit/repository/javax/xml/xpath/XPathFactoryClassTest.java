package org.j8unit.repository.javax.xml.xpath;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XPathFactoryClassTest
implements org.j8unit.repository.javax.xml.xpath.XPathFactoryClassTests<javax.xml.xpath.XPathFactory> {

    @Override
    public Class<javax.xml.xpath.XPathFactory> createNewSUT() {
        return javax.xml.xpath.XPathFactory.class;
    }

}
