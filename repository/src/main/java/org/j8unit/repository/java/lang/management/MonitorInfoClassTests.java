package org.j8unit.repository.java.lang.management;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.lang.management.MonitorInfo class java.lang.management.MonitorInfo}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.lang.management.MonitorInfoTests}.
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
 *            the class' type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.lang.management.MonitorInfoTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MonitorInfoClassTests<SUT extends java.lang.management.MonitorInfo>
extends org.j8unit.repository.java.lang.management.LockInfoClassTests<SUT> {

    /**
     * Test method for
     * {@link java.lang.management.MonitorInfo#MonitorInfo(java.lang.String,int,int,java.lang.StackTraceElement) public
     * java.lang.management.MonitorInfo(java.lang.String,int,int,java.lang.StackTraceElement)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MonitorInfo_String_int_int_StackTraceElement()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.lang.management.MonitorInfo sut = null; // = new
                                                           // MonitorInfo(java.lang.String,int,int,java.lang.StackTraceElement);
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.MonitorInfo#from(javax.management.openmbean.CompositeData) public
     * static java.lang.management.MonitorInfo
     * java.lang.management.MonitorInfo.from(javax.management.openmbean.CompositeData)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_from_CompositeData()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.lang.management.MonitorInfo.class.isAssignableFrom(sut));
    }

}
