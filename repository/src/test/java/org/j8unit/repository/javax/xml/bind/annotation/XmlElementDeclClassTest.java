package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlElementDecl.GLOBAL;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XmlElementDecl} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.annotation.XmlElementDeclClassTests}).
 */

@RunWith(J8Unit4.class)
public class XmlElementDeclClassTest
implements XmlElementDeclClassTests<XmlElementDecl> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlElementDecl]

    @Override
    public Class<XmlElementDecl> createNewSUT() {
        return XmlElementDecl.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.XmlElementDecl]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlElementDecl]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link GLOBAL} (by simply reusing the J8Unit
     * test interface
     * {@link org.j8unit.repository.javax.xml.bind.annotation.XmlElementDeclClassTests.GLOBALClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class GLOBALClassTest
    implements GLOBALClassTests<GLOBAL> {

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

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.XmlElementDecl$GLOBAL]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlElementDecl$GLOBAL]

    }

}
