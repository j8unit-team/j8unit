package org.j8unit.repository.javax.xml.parsers;

import javax.xml.parsers.SAXParser;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SAXParserClassTest
implements org.j8unit.repository.javax.xml.parsers.SAXParserClassTests<SAXParser> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.parsers.SAXParser]

    @Override
    public Class<SAXParser> createNewSUT() {
        return SAXParser.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.parsers.SAXParser]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.parsers.SAXParser]

}
