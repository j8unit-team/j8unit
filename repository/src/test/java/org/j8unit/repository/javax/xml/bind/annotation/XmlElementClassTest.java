package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlElementClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlElementClassTests<javax.xml.bind.annotation.XmlElement> {

    @Override
    public Class<javax.xml.bind.annotation.XmlElement> createNewSUT() {
        return javax.xml.bind.annotation.XmlElement.class;
    }

    @RunWith(J8Unit4.class)
    public static class DEFAULTClassTest
    implements org.j8unit.repository.javax.xml.bind.annotation.XmlElementClassTests.DEFAULTClassTests<javax.xml.bind.annotation.XmlElement.DEFAULT> {

        @Override
        public Class<javax.xml.bind.annotation.XmlElement.DEFAULT> createNewSUT() {
            return javax.xml.bind.annotation.XmlElement.DEFAULT.class;
        }

    }

}
