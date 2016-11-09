package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.ls.LSParser;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LSParser} (by simply reusing the J8Unit
 * test interface {@link LSParserClassTests}).
 */

@RunWith(J8Unit4.class)
public class LSParserClassTest
implements LSParserClassTests<LSParser> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.ls.LSParser]

    @Override
    public Class<LSParser> createNewSUT() {
        return LSParser.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.ls.LSParser]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.ls.LSParser]

}
