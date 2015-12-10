package org.j8unit.repository.javax.xml.xpath;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XPathExceptionClassTest
implements org.j8unit.repository.javax.xml.xpath.XPathExceptionClassTests<javax.xml.xpath.XPathException> {

    @Override
    public Class<javax.xml.xpath.XPathException> createNewSUT() {
        return javax.xml.xpath.XPathException.class;
    }

}
