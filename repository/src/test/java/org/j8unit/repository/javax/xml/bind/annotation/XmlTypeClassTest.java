package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlTypeClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlTypeClassTests<javax.xml.bind.annotation.XmlType> {

    @RunWith(J8Unit4.class)
    public static class DEFAULTClassTest
    implements org.j8unit.repository.javax.xml.bind.annotation.XmlTypeClassTests.DEFAULTClassTests<javax.xml.bind.annotation.XmlType.DEFAULT> {

        @Override
        public Class<javax.xml.bind.annotation.XmlType.DEFAULT> createNewSUT() {
            return javax.xml.bind.annotation.XmlType.DEFAULT.class;
        }

    }

    @Override
    public Class<javax.xml.bind.annotation.XmlType> createNewSUT() {
        return javax.xml.bind.annotation.XmlType.class;
    }

}
