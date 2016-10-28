package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlElementDecl.GLOBAL;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlElementDeclClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlElementDeclClassTests<XmlElementDecl> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlElementDecl]

    @Override
    public Class<XmlElementDecl> createNewSUT() {
        return XmlElementDecl.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlElementDecl]

    @RunWith(J8Unit4.class)
    public static class GLOBALClassTest
    implements org.j8unit.repository.javax.xml.bind.annotation.XmlElementDeclClassTests.GLOBALClassTests<GLOBAL> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlElementDecl$GLOBAL]

        @Override
        public Class<GLOBAL> createNewSUT() {
            return GLOBAL.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.xml.bind.annotation.XmlElementDecl.GLOBAL#GLOBAL() public
         * javax.xml.bind.annotation.XmlElementDecl$GLOBAL()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_GLOBAL()
        throws Exception {
            // create new instance
            final GLOBAL sut = new GLOBAL();
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlElementDecl$GLOBAL]

    }

}
