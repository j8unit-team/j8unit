package org.j8unit.repository.javax.xml.parsers;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DocumentBuilderFactoryClassTest
implements org.j8unit.repository.javax.xml.parsers.DocumentBuilderFactoryClassTests<javax.xml.parsers.DocumentBuilderFactory> {

    @Override
    public Class<javax.xml.parsers.DocumentBuilderFactory> createNewSUT() {
        return javax.xml.parsers.DocumentBuilderFactory.class;
    }

}
