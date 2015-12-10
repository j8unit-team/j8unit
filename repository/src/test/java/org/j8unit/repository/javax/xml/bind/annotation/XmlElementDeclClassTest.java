package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlElementDeclClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlElementDeclClassTests<javax.xml.bind.annotation.XmlElementDecl> {

    @RunWith(J8Unit4.class)
    public static class GLOBALClassTest
    implements org.j8unit.repository.javax.xml.bind.annotation.XmlElementDeclClassTests.GLOBALClassTests<javax.xml.bind.annotation.XmlElementDecl.GLOBAL> {

        @Override
        public Class<javax.xml.bind.annotation.XmlElementDecl.GLOBAL> createNewSUT() {
            return javax.xml.bind.annotation.XmlElementDecl.GLOBAL.class;
        }

    }

    @Override
    public Class<javax.xml.bind.annotation.XmlElementDecl> createNewSUT() {
        return javax.xml.bind.annotation.XmlElementDecl.class;
    }

}
