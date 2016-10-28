package org.j8unit.repository.javax.xml.parsers;

import javax.xml.parsers.DocumentBuilder;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DocumentBuilderClassTest
implements org.j8unit.repository.javax.xml.parsers.DocumentBuilderClassTests<DocumentBuilder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.parsers.DocumentBuilder]

    @Override
    public Class<DocumentBuilder> createNewSUT() {
        return DocumentBuilder.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.parsers.DocumentBuilder]

}
