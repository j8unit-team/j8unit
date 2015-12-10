package org.j8unit.repository.org.xml.sax.helpers;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ParserAdapterClassTest
implements org.j8unit.repository.org.xml.sax.helpers.ParserAdapterClassTests<org.xml.sax.helpers.ParserAdapter> {

    @Override
    public Class<org.xml.sax.helpers.ParserAdapter> createNewSUT() {
        return org.xml.sax.helpers.ParserAdapter.class;
    }

}
