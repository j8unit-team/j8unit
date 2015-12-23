package org.j8unit.repository.javax.xml.bind.annotation.adapters;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlJavaTypeAdapterClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.adapters.XmlJavaTypeAdapterClassTests<javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter> {

    @Override
    public Class<javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter> createNewSUT() {
        return javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.class;
    }

    @RunWith(J8Unit4.class)
    public static class DEFAULTClassTest
    implements
    org.j8unit.repository.javax.xml.bind.annotation.adapters.XmlJavaTypeAdapterClassTests.DEFAULTClassTests<javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT> {

        @Override
        public Class<javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT> createNewSUT() {
            return javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT.class;
        }

    }

}
