package org.j8unit.repository.javax.management.modelmbean;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.management.modelmbean.DescriptorSupport class
 * javax.management.modelmbean.DescriptorSupport}, containing all class relevant test methods (at least the test methods
 * of accessible constructors and of accessible {@code static} methods). The counterpart test class containing the
 * instance relevant test methods is {@link org.j8unit.repository.javax.management.modelmbean.DescriptorSupportTests}.
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
 * @see org.j8unit.repository.javax.management.modelmbean.DescriptorSupportTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DescriptorSupportClassTests<SUT extends Class<? extends javax.management.modelmbean.DescriptorSupport>>
extends org.j8unit.repository.javax.management.DescriptorClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link javax.management.modelmbean.DescriptorSupport#DescriptorSupport() public
     * javax.management.modelmbean.DescriptorSupport()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DescriptorSupport()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.modelmbean.DescriptorSupport sut = null; // = new DescriptorSupport();
    }

    /**
     * Test method for
     * {@link javax.management.modelmbean.DescriptorSupport#DescriptorSupport(javax.management.modelmbean.DescriptorSupport)
     * public javax.management.modelmbean.DescriptorSupport(javax.management.modelmbean.DescriptorSupport)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DescriptorSupport_DescriptorSupport()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.modelmbean.DescriptorSupport sut = null; // = new
                                                                        // DescriptorSupport(javax.management.modelmbean.DescriptorSupport);
    }

    /**
     * Test method for {@link javax.management.modelmbean.DescriptorSupport#DescriptorSupport(int) public
     * javax.management.modelmbean.DescriptorSupport(int) throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DescriptorSupport_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.modelmbean.DescriptorSupport sut = null; // = new DescriptorSupport(int);
    }

    /**
     * Test method for {@link javax.management.modelmbean.DescriptorSupport#DescriptorSupport(java.lang.String) public
     * javax.management.modelmbean.DescriptorSupport(java.lang.String) throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException,javax.management.modelmbean.XMLParseException}
     * .
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DescriptorSupport_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.modelmbean.DescriptorSupport sut = null; // = new DescriptorSupport(java.lang.String);
    }

    /**
     * Test method for {@link javax.management.modelmbean.DescriptorSupport#DescriptorSupport(java.lang.String...)
     * public javax.management.modelmbean.DescriptorSupport(java.lang.String...)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DescriptorSupport_StringArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.modelmbean.DescriptorSupport sut = null; // = new DescriptorSupport(java.lang.String...);
    }

    /**
     * Test method for
     * {@link javax.management.modelmbean.DescriptorSupport#DescriptorSupport(java.lang.String[],java.lang.Object[])
     * public javax.management.modelmbean.DescriptorSupport(java.lang.String[],java.lang.Object[]) throws
     * javax.management.RuntimeOperationsException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DescriptorSupport_StringArray_ObjectArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.modelmbean.DescriptorSupport sut = null; // = new
                                                                        // DescriptorSupport(java.lang.String[],java.lang.Object[]);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.management.modelmbean.DescriptorSupport> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.management.modelmbean.DescriptorSupport.class.isAssignableFrom(sut));
    }

}
