package org.j8unit.repository.javax.management;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.management.MBeanOperationInfo class
 * javax.management.MBeanOperationInfo}, containing all class relevant test methods (at least the test methods of
 * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing
 * the instance relevant test methods is {@link org.j8unit.repository.javax.management.MBeanOperationInfoTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable
 * test method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @see org.j8unit.repository.javax.management.MBeanOperationInfoTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.management.MBeanOperationInfo
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MBeanOperationInfoClassTests<SUT extends javax.management.MBeanOperationInfo>
extends org.j8unit.repository.java.lang.CloneableClassTests<SUT>, org.j8unit.repository.javax.management.MBeanFeatureInfoClassTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanOperationInfo#MBeanOperationInfo(java.lang.String, java.lang.reflect.Method) public
     * javax.management.MBeanOperationInfo(java.lang.String,java.lang.reflect.Method)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.MBeanOperationInfo#MBeanOperationInfo(java.lang.String, java.lang.reflect.Method)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MBeanOperationInfo_String_Method()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.MBeanOperationInfo sut = null; // = new MBeanOperationInfo(java.lang.String,
                                                              // java.lang.reflect.Method);
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanOperationInfo#MBeanOperationInfo(java.lang.String, java.lang.String, javax.management.MBeanParameterInfo[], java.lang.String, int)
     * public
     * javax.management.MBeanOperationInfo(java.lang.String,java.lang.String,javax.management.MBeanParameterInfo[],java.lang.String,int)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.MBeanOperationInfo#MBeanOperationInfo(java.lang.String, java.lang.String,
     *             javax.management.MBeanParameterInfo[], java.lang.String, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MBeanOperationInfo_String_String_MBeanParameterInfoArray_String_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.MBeanOperationInfo sut = null; // = new MBeanOperationInfo(java.lang.String,
                                                              // java.lang.String,
                                                              // javax.management.MBeanParameterInfo[],
                                                              // java.lang.String, int);
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanOperationInfo#MBeanOperationInfo(java.lang.String, java.lang.String, javax.management.MBeanParameterInfo[], java.lang.String, int, javax.management.Descriptor)
     * public
     * javax.management.MBeanOperationInfo(java.lang.String,java.lang.String,javax.management.MBeanParameterInfo[],java.lang.String,int,javax.management.Descriptor)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.MBeanOperationInfo#MBeanOperationInfo(java.lang.String, java.lang.String,
     *             javax.management.MBeanParameterInfo[], java.lang.String, int, javax.management.Descriptor)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MBeanOperationInfo_String_String_MBeanParameterInfoArray_String_int_Descriptor()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.MBeanOperationInfo sut = null; // = new MBeanOperationInfo(java.lang.String,
                                                              // java.lang.String,
                                                              // javax.management.MBeanParameterInfo[],
                                                              // java.lang.String, int, javax.management.Descriptor);
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.management.MBeanOperationInfo#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.management.MBeanOperationInfo.class.isAssignableFrom(sut));
    }

}
