package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBElement.GlobalScope;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JAXBElement} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.JAXBElementClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class JAXBElementClassTest
implements JAXBElementClassTests<JAXBElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.JAXBElement]

    @Override
    public Class<JAXBElement> createNewSUT() {
        return JAXBElement.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.bind.JAXBElement#JAXBElement(javax.xml.namespace.QName, Class, Class, Object) public
     * javax.xml.bind.JAXBElement(javax.xml.namespace.QName,java.lang.Class<T>,java.lang.Class,T)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_JAXBElement_QName_Class_Class_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JAXBElement sut = null; // = new JAXBElement(javax.xml.namespace.QName, Class, Class, Object);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.bind.JAXBElement#JAXBElement(javax.xml.namespace.QName, Class, Object) public
     * javax.xml.bind.JAXBElement(javax.xml.namespace.QName,java.lang.Class<T>,T)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_JAXBElement_QName_Class_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JAXBElement sut = null; // = new JAXBElement(javax.xml.namespace.QName, Class, Object);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.JAXBElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.JAXBElement]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link GlobalScope} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.JAXBElementClassTests.GlobalScopeClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class GlobalScopeClassTest
    implements GlobalScopeClassTests<GlobalScope> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.JAXBElement$GlobalScope]

        @Override
        public Class<GlobalScope> createNewSUT() {
            return GlobalScope.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.xml.bind.JAXBElement.GlobalScope#GlobalScope() public javax.xml.bind.JAXBElement$GlobalScope()}.
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
        public void create_GlobalScope()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final GlobalScope sut = new GlobalScope();
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.JAXBElement$GlobalScope]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.JAXBElement$GlobalScope]

    }

}
