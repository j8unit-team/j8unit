package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.xml.sax.Parser;

@RunWith(J8Unit4.class)
public class ParserClassTest
implements org.j8unit.repository.org.xml.sax.ParserClassTests<Parser> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.Parser]

    @Override
    public Class<Parser> createNewSUT() {
        return Parser.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.Parser]

}
