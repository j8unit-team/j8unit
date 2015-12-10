package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlMimeTypeClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlMimeTypeClassTests<javax.xml.bind.annotation.XmlMimeType> {

    @Override
    public Class<javax.xml.bind.annotation.XmlMimeType> createNewSUT() {
        return javax.xml.bind.annotation.XmlMimeType.class;
    }

}
