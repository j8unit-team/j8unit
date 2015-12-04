package org.j8unit.repository.javax.management.openmbean;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.management.openmbean.OpenMBeanOperationInfoSupport class
 * javax.management.openmbean.OpenMBeanOperationInfoSupport}, containing all class relevant test methods (at least the
 * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
 * containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.management.openmbean.OpenMBeanOperationInfoSupportTests}.
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
 * @see org.j8unit.repository.javax.management.openmbean.OpenMBeanOperationInfoSupportTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface OpenMBeanOperationInfoSupportClassTests<SUT extends Class<? extends javax.management.openmbean.OpenMBeanOperationInfoSupport>>
extends org.j8unit.repository.javax.management.openmbean.OpenMBeanOperationInfoClassTests<SUT>,
org.j8unit.repository.javax.management.MBeanOperationInfoClassTests<SUT> {

    /**
     * Test method for
     * {@link javax.management.openmbean.OpenMBeanOperationInfoSupport#OpenMBeanOperationInfoSupport(java.lang.String,java.lang.String,javax.management.openmbean.OpenMBeanParameterInfo[],javax.management.openmbean.OpenType,int)
     * public
     * javax.management.openmbean.OpenMBeanOperationInfoSupport(java.lang.String,java.lang.String,javax.management.openmbean.OpenMBeanParameterInfo[],javax.management.openmbean.OpenType,int)}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_OpenMBeanOperationInfoSupport_String_String_OpenMBeanParameterInfoArray_OpenType_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.openmbean.OpenMBeanOperationInfoSupport sut = null; // = new
                                                                                   // OpenMBeanOperationInfoSupport(java.lang.String,java.lang.String,javax.management.openmbean.OpenMBeanParameterInfo[],javax.management.openmbean.OpenType,int);
    }

    /**
     * Test method for
     * {@link javax.management.openmbean.OpenMBeanOperationInfoSupport#OpenMBeanOperationInfoSupport(java.lang.String,java.lang.String,javax.management.openmbean.OpenMBeanParameterInfo[],javax.management.openmbean.OpenType,int,javax.management.Descriptor)
     * public
     * javax.management.openmbean.OpenMBeanOperationInfoSupport(java.lang.String,java.lang.String,javax.management.openmbean.OpenMBeanParameterInfo[],javax.management.openmbean.OpenType,int,javax.management.Descriptor)}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_OpenMBeanOperationInfoSupport_String_String_OpenMBeanParameterInfoArray_OpenType_int_Descriptor()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.openmbean.OpenMBeanOperationInfoSupport sut = null; // = new
                                                                                   // OpenMBeanOperationInfoSupport(java.lang.String,java.lang.String,javax.management.openmbean.OpenMBeanParameterInfo[],javax.management.openmbean.OpenType,int,javax.management.Descriptor);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.management.openmbean.OpenMBeanOperationInfoSupport> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.management.openmbean.OpenMBeanOperationInfoSupport.class.isAssignableFrom(sut));
    }

}
