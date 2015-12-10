package org.j8unit.repository.javax.xml.parsers;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SAXParserFactoryClassTest
implements org.j8unit.repository.javax.xml.parsers.SAXParserFactoryClassTests<javax.xml.parsers.SAXParserFactory> {

    @Override
    public Class<javax.xml.parsers.SAXParserFactory> createNewSUT() {
        return javax.xml.parsers.SAXParserFactory.class;
    }

}
