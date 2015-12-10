package org.j8unit.repository.javax.xml.parsers;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DocumentBuilderClassTest
implements org.j8unit.repository.javax.xml.parsers.DocumentBuilderClassTests<javax.xml.parsers.DocumentBuilder> {

    @Override
    public Class<javax.xml.parsers.DocumentBuilder> createNewSUT() {
        return javax.xml.parsers.DocumentBuilder.class;
    }

}
