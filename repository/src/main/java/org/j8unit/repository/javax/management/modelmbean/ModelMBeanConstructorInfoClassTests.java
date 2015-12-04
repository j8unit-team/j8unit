package org.j8unit.repository.javax.management.modelmbean;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.management.modelmbean.ModelMBeanConstructorInfo class
 * javax.management.modelmbean.ModelMBeanConstructorInfo}, containing all class relevant test methods (at least the test
 * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class containing
 * the instance relevant test methods is
 * {@link org.j8unit.repository.javax.management.modelmbean.ModelMBeanConstructorInfoTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a> Thus,
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable test
 * method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.modelmbean.ModelMBeanConstructorInfoTests
 */
@Category(J8UnitRepository.class)
public abstract interface ModelMBeanConstructorInfoClassTests<SUT extends Class<? extends javax.management.modelmbean.ModelMBeanConstructorInfo>>
extends org.j8unit.repository.javax.management.DescriptorAccessClassTests<SUT>, org.j8unit.repository.javax.management.MBeanConstructorInfoClassTests<SUT> {

    /**
     * Test method for
     * {@link javax.management.modelmbean.ModelMBeanConstructorInfo#ModelMBeanConstructorInfo(java.lang.String,java.lang.String,javax.management.MBeanParameterInfo[],javax.management.Descriptor)
     * public
     * javax.management.modelmbean.ModelMBeanConstructorInfo(java.lang.String,java.lang.String,javax.management.MBeanParameterInfo[],javax.management.Descriptor)}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ModelMBeanConstructorInfo_String_String_MBeanParameterInfoArray_Descriptor()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.modelmbean.ModelMBeanConstructorInfo sut = null; // = new
                                                                                // ModelMBeanConstructorInfo(java.lang.String,java.lang.String,javax.management.MBeanParameterInfo[],javax.management.Descriptor);
    }

    /**
     * Test method for
     * {@link javax.management.modelmbean.ModelMBeanConstructorInfo#ModelMBeanConstructorInfo(java.lang.String,java.lang.String,javax.management.MBeanParameterInfo[])
     * public
     * javax.management.modelmbean.ModelMBeanConstructorInfo(java.lang.String,java.lang.String,javax.management.MBeanParameterInfo[])}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ModelMBeanConstructorInfo_String_String_MBeanParameterInfoArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.modelmbean.ModelMBeanConstructorInfo sut = null; // = new
                                                                                // ModelMBeanConstructorInfo(java.lang.String,java.lang.String,javax.management.MBeanParameterInfo[]);
    }

    /**
     * Test method for
     * {@link javax.management.modelmbean.ModelMBeanConstructorInfo#ModelMBeanConstructorInfo(java.lang.String,java.lang.reflect.Constructor,javax.management.Descriptor)
     * public
     * javax.management.modelmbean.ModelMBeanConstructorInfo(java.lang.String,java.lang.reflect.Constructor,javax.management.Descriptor)}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ModelMBeanConstructorInfo_String_Constructor_Descriptor()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.modelmbean.ModelMBeanConstructorInfo sut = null; // = new
                                                                                // ModelMBeanConstructorInfo(java.lang.String,java.lang.reflect.Constructor,javax.management.Descriptor);
    }

    /**
     * Test method for
     * {@link javax.management.modelmbean.ModelMBeanConstructorInfo#ModelMBeanConstructorInfo(java.lang.String,java.lang.reflect.Constructor)
     * public javax.management.modelmbean.ModelMBeanConstructorInfo(java.lang.String,java.lang.reflect.Constructor)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ModelMBeanConstructorInfo_String_Constructor()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.modelmbean.ModelMBeanConstructorInfo sut = null; // = new
                                                                                // ModelMBeanConstructorInfo(java.lang.String,java.lang.reflect.Constructor);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.management.modelmbean.ModelMBeanConstructorInfo> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.management.modelmbean.ModelMBeanConstructorInfo.class.isAssignableFrom(sut));
    }

}
