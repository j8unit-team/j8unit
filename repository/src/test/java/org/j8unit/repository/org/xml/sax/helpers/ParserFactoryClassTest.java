package org.j8unit.repository.org.xml.sax.helpers;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ParserFactoryClassTest
implements org.j8unit.repository.org.xml.sax.helpers.ParserFactoryClassTests<org.xml.sax.helpers.ParserFactory> {

    @Override
    public Class<org.xml.sax.helpers.ParserFactory> createNewSUT() {
        return org.xml.sax.helpers.ParserFactory.class;
    }

}
