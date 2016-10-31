package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.ls.LSParser;

@RunWith(J8Unit4.class)
public class LSParserClassTest
implements org.j8unit.repository.org.w3c.dom.ls.LSParserClassTests<LSParser> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.ls.LSParser]

    @Override
    public Class<LSParser> createNewSUT() {
        return LSParser.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.ls.LSParser]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.ls.LSParser]

}
