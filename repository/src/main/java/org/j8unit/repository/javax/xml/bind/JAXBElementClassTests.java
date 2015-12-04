package org.j8unit.repository.javax.xml.bind;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.bind.JAXBElement class javax.xml.bind.JAXBElement},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.xml.bind.JAXBElementTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself.
 * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
 * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
 * provides a corresponding, inheritable test method:
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
 * runtime constraints and further class specific requirements.
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.bind.JAXBElementTests
 */
@Category(J8UnitRepository.class)
public abstract interface JAXBElementClassTests<SUT extends Class<? extends javax.xml.bind.JAXBElement<T>>, T>
extends org.j8unit.repository.java.io.SerializableClassTests<SUT>,
        org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    /**
     * Test method for {@link javax.xml.bind.JAXBElement#JAXBElement(javax.xml.namespace.QName,java.lang.Class,java.lang.Class,java.lang.Object) public javax.xml.bind.JAXBElement(javax.xml.namespace.QName,java.lang.Class,java.lang.Class,java.lang.Object)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JAXBElement_QName_Class_Class_Object() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.xml.bind.JAXBElement<T> sut = null; // = new JAXBElement(javax.xml.namespace.QName,java.lang.Class,java.lang.Class,java.lang.Object);
    }

    /**
     * Test method for {@link javax.xml.bind.JAXBElement#JAXBElement(javax.xml.namespace.QName,java.lang.Class,java.lang.Object) public javax.xml.bind.JAXBElement(javax.xml.namespace.QName,java.lang.Class,java.lang.Object)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JAXBElement_QName_Class_Object() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.xml.bind.JAXBElement<T> sut = null; // = new JAXBElement(javax.xml.namespace.QName,java.lang.Class,java.lang.Object);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.xml.bind.JAXBElement<T>> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.xml.bind.JAXBElement.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test class for {@link javax.xml.bind.JAXBElement$GlobalScope class javax.xml.bind.JAXBElement$GlobalScope},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.xml.bind.JAXBElementTests.GlobalScopeTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself.
     * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
     * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
     * provides a corresponding, inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
     * runtime constraints and further class specific requirements.
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.xml.bind.JAXBElementTests.GlobalScopeTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface GlobalScopeClassTests<SUT extends Class<? extends javax.xml.bind.JAXBElement.GlobalScope>>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT>
    {

        /**
         * Test method for {@link javax.xml.bind.JAXBElement.GlobalScope#GlobalScope() public javax.xml.bind.JAXBElement$GlobalScope()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_GlobalScope() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            javax.xml.bind.JAXBElement.GlobalScope sut = null; // = new GlobalScope();
        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.xml.bind.JAXBElement.GlobalScope> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.xml.bind.JAXBElement.GlobalScope.class.isAssignableFrom(sut));
        }

    }

}
