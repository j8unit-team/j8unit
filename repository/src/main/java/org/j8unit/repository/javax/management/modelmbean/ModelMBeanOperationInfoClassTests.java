package org.j8unit.repository.javax.management.modelmbean;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.management.modelmbean.ModelMBeanOperationInfo class javax.management.modelmbean.ModelMBeanOperationInfo},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.management.modelmbean.ModelMBeanOperationInfoTests}.
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
 * @see org.j8unit.repository.javax.management.modelmbean.ModelMBeanOperationInfoTests
 */
@Category(J8UnitRepository.class)
public abstract interface ModelMBeanOperationInfoClassTests<SUT extends Class<? extends javax.management.modelmbean.ModelMBeanOperationInfo>>
extends org.j8unit.repository.javax.management.DescriptorAccessClassTests<SUT>,
        org.j8unit.repository.javax.management.MBeanOperationInfoClassTests<SUT>
{

    /**
     * Test method for {@link javax.management.modelmbean.ModelMBeanOperationInfo#ModelMBeanOperationInfo(javax.management.modelmbean.ModelMBeanOperationInfo) public javax.management.modelmbean.ModelMBeanOperationInfo(javax.management.modelmbean.ModelMBeanOperationInfo)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ModelMBeanOperationInfo_ModelMBeanOperationInfo() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.management.modelmbean.ModelMBeanOperationInfo sut = null; // = new ModelMBeanOperationInfo(javax.management.modelmbean.ModelMBeanOperationInfo);
    }

    /**
     * Test method for {@link javax.management.modelmbean.ModelMBeanOperationInfo#ModelMBeanOperationInfo(java.lang.String,java.lang.String,javax.management.MBeanParameterInfo[],java.lang.String,int,javax.management.Descriptor) public javax.management.modelmbean.ModelMBeanOperationInfo(java.lang.String,java.lang.String,javax.management.MBeanParameterInfo[],java.lang.String,int,javax.management.Descriptor)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ModelMBeanOperationInfo_String_String_MBeanParameterInfoArray_String_int_Descriptor() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.management.modelmbean.ModelMBeanOperationInfo sut = null; // = new ModelMBeanOperationInfo(java.lang.String,java.lang.String,javax.management.MBeanParameterInfo[],java.lang.String,int,javax.management.Descriptor);
    }

    /**
     * Test method for {@link javax.management.modelmbean.ModelMBeanOperationInfo#ModelMBeanOperationInfo(java.lang.String,java.lang.String,javax.management.MBeanParameterInfo[],java.lang.String,int) public javax.management.modelmbean.ModelMBeanOperationInfo(java.lang.String,java.lang.String,javax.management.MBeanParameterInfo[],java.lang.String,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ModelMBeanOperationInfo_String_String_MBeanParameterInfoArray_String_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.management.modelmbean.ModelMBeanOperationInfo sut = null; // = new ModelMBeanOperationInfo(java.lang.String,java.lang.String,javax.management.MBeanParameterInfo[],java.lang.String,int);
    }

    /**
     * Test method for {@link javax.management.modelmbean.ModelMBeanOperationInfo#ModelMBeanOperationInfo(java.lang.String,java.lang.reflect.Method,javax.management.Descriptor) public javax.management.modelmbean.ModelMBeanOperationInfo(java.lang.String,java.lang.reflect.Method,javax.management.Descriptor)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ModelMBeanOperationInfo_String_Method_Descriptor() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.management.modelmbean.ModelMBeanOperationInfo sut = null; // = new ModelMBeanOperationInfo(java.lang.String,java.lang.reflect.Method,javax.management.Descriptor);
    }

    /**
     * Test method for {@link javax.management.modelmbean.ModelMBeanOperationInfo#ModelMBeanOperationInfo(java.lang.String,java.lang.reflect.Method) public javax.management.modelmbean.ModelMBeanOperationInfo(java.lang.String,java.lang.reflect.Method)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ModelMBeanOperationInfo_String_Method() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.management.modelmbean.ModelMBeanOperationInfo sut = null; // = new ModelMBeanOperationInfo(java.lang.String,java.lang.reflect.Method);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.management.modelmbean.ModelMBeanOperationInfo> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.management.modelmbean.ModelMBeanOperationInfo.class.isAssignableFrom(sut));
    }

}
