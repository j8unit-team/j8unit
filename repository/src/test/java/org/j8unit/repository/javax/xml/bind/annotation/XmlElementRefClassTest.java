package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlElementRefClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlElementRefClassTests<javax.xml.bind.annotation.XmlElementRef> {

    @RunWith(J8Unit4.class)
    public static class DEFAULTClassTest
    implements org.j8unit.repository.javax.xml.bind.annotation.XmlElementRefClassTests.DEFAULTClassTests<javax.xml.bind.annotation.XmlElementRef.DEFAULT> {

        @Override
        public Class<javax.xml.bind.annotation.XmlElementRef.DEFAULT> createNewSUT() {
            return javax.xml.bind.annotation.XmlElementRef.DEFAULT.class;
        }

    }

    @Override
    public Class<javax.xml.bind.annotation.XmlElementRef> createNewSUT() {
        return javax.xml.bind.annotation.XmlElementRef.class;
    }

}
