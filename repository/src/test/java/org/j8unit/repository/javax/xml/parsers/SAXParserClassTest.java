package org.j8unit.repository.javax.xml.parsers;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SAXParserClassTest
implements org.j8unit.repository.javax.xml.parsers.SAXParserClassTests<javax.xml.parsers.SAXParser> {

    @Override
    public Class<javax.xml.parsers.SAXParser> createNewSUT() {
        return javax.xml.parsers.SAXParser.class;
    }

}
