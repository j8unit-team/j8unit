package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlSchemaTypeClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlSchemaTypeClassTests<javax.xml.bind.annotation.XmlSchemaType> {

    @RunWith(J8Unit4.class)
    public static class DEFAULTClassTest
    implements org.j8unit.repository.javax.xml.bind.annotation.XmlSchemaTypeClassTests.DEFAULTClassTests<javax.xml.bind.annotation.XmlSchemaType.DEFAULT> {

        @Override
        public Class<javax.xml.bind.annotation.XmlSchemaType.DEFAULT> createNewSUT() {
            return javax.xml.bind.annotation.XmlSchemaType.DEFAULT.class;
        }

    }

    @Override
    public Class<javax.xml.bind.annotation.XmlSchemaType> createNewSUT() {
        return javax.xml.bind.annotation.XmlSchemaType.class;
    }

}
