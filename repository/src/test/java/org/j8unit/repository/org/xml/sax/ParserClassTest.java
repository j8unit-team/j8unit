package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ParserClassTest
implements org.j8unit.repository.org.xml.sax.ParserClassTests<org.xml.sax.Parser> {

    @Override
    public Class<org.xml.sax.Parser> createNewSUT() {
        return org.xml.sax.Parser.class;
    }

}
