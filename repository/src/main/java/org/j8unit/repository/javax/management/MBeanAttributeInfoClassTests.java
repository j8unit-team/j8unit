package org.j8unit.repository.javax.management;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.management.MBeanAttributeInfo class javax.management.MBeanAttributeInfo},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.management.MBeanAttributeInfoTests}.
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
 * @see org.j8unit.repository.javax.management.MBeanAttributeInfoTests
 */
@Category(J8UnitRepository.class)
public abstract interface MBeanAttributeInfoClassTests<SUT extends Class<? extends javax.management.MBeanAttributeInfo>>
extends org.j8unit.repository.java.lang.CloneableClassTests<SUT>,
        org.j8unit.repository.javax.management.MBeanFeatureInfoClassTests<SUT>
{

    /**
     * Test method for {@link javax.management.MBeanAttributeInfo#MBeanAttributeInfo(java.lang.String,java.lang.String,java.lang.reflect.Method,java.lang.reflect.Method) public javax.management.MBeanAttributeInfo(java.lang.String,java.lang.String,java.lang.reflect.Method,java.lang.reflect.Method) throws javax.management.IntrospectionException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MBeanAttributeInfo_String_String_Method_Method() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.management.MBeanAttributeInfo sut = null; // = new MBeanAttributeInfo(java.lang.String,java.lang.String,java.lang.reflect.Method,java.lang.reflect.Method);
    }

    /**
     * Test method for {@link javax.management.MBeanAttributeInfo#MBeanAttributeInfo(java.lang.String,java.lang.String,java.lang.String,boolean,boolean,boolean,javax.management.Descriptor) public javax.management.MBeanAttributeInfo(java.lang.String,java.lang.String,java.lang.String,boolean,boolean,boolean,javax.management.Descriptor)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MBeanAttributeInfo_String_String_String_boolean_boolean_boolean_Descriptor() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.management.MBeanAttributeInfo sut = null; // = new MBeanAttributeInfo(java.lang.String,java.lang.String,java.lang.String,boolean,boolean,boolean,javax.management.Descriptor);
    }

    /**
     * Test method for {@link javax.management.MBeanAttributeInfo#MBeanAttributeInfo(java.lang.String,java.lang.String,java.lang.String,boolean,boolean,boolean) public javax.management.MBeanAttributeInfo(java.lang.String,java.lang.String,java.lang.String,boolean,boolean,boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MBeanAttributeInfo_String_String_String_boolean_boolean_boolean() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.management.MBeanAttributeInfo sut = null; // = new MBeanAttributeInfo(java.lang.String,java.lang.String,java.lang.String,boolean,boolean,boolean);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.management.MBeanAttributeInfo> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.management.MBeanAttributeInfo.class.isAssignableFrom(sut));
    }

}
