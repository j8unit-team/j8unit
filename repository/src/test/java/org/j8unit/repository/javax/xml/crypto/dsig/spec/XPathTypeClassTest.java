package org.j8unit.repository.javax.xml.crypto.dsig.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XPathTypeClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.spec.XPathTypeClassTests<javax.xml.crypto.dsig.spec.XPathType> {

    @Override
    public Class<javax.xml.crypto.dsig.spec.XPathType> createNewSUT() {
        return javax.xml.crypto.dsig.spec.XPathType.class;
    }

    @RunWith(J8Unit4.class)
    public static class FilterClassTest
    implements org.j8unit.repository.javax.xml.crypto.dsig.spec.XPathTypeClassTests.FilterClassTests<javax.xml.crypto.dsig.spec.XPathType.Filter> {

        @Override
        public Class<javax.xml.crypto.dsig.spec.XPathType.Filter> createNewSUT() {
            return javax.xml.crypto.dsig.spec.XPathType.Filter.class;
        }

    }

}
