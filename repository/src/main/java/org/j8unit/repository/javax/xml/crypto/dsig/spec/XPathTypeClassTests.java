package org.j8unit.repository.javax.xml.crypto.dsig.spec;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.crypto.dsig.spec.XPathType class
 * javax.xml.crypto.dsig.spec.XPathType}, containing all class relevant test methods (at least the test methods of
 * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing
 * the instance relevant test methods is {@link org.j8unit.repository.javax.xml.crypto.dsig.spec.XPathTypeTests}.
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
 * @see org.j8unit.repository.javax.xml.crypto.dsig.spec.XPathTypeTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.crypto.dsig.spec.XPathType
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XPathTypeClassTests<SUT extends javax.xml.crypto.dsig.spec.XPathType>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.xml.crypto.dsig.spec.XPathType.Filter class
     * javax.xml.crypto.dsig.spec.XPathType$Filter}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.xml.crypto.dsig.spec.XPathTypeTests.FilterTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.xml.crypto.dsig.spec.XPathTypeTests.FilterTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.xml.crypto.dsig.spec.XPathType.Filter
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FilterClassTests<SUT extends javax.xml.crypto.dsig.spec.XPathType.Filter>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.xml.crypto.dsig.spec.XPathType.Filter#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.xml.crypto.dsig.spec.XPathType.Filter.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.spec.XPathType#XPathType(java.lang.String, javax.xml.crypto.dsig.spec.XPathType.Filter)
     * public javax.xml.crypto.dsig.spec.XPathType(java.lang.String,javax.xml.crypto.dsig.spec.XPathType$Filter)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.crypto.dsig.spec.XPathType#XPathType(java.lang.String,
     *             javax.xml.crypto.dsig.spec.XPathType.Filter)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_XPathType_String_Filter()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.crypto.dsig.spec.XPathType sut = null; // = new XPathType(java.lang.String,
                                                               // javax.xml.crypto.dsig.spec.XPathType.Filter);
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.spec.XPathType#XPathType(java.lang.String, javax.xml.crypto.dsig.spec.XPathType.Filter, java.util.Map)
     * public
     * javax.xml.crypto.dsig.spec.XPathType(java.lang.String,javax.xml.crypto.dsig.spec.XPathType$Filter,java.util.Map)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.crypto.dsig.spec.XPathType#XPathType(java.lang.String,
     *             javax.xml.crypto.dsig.spec.XPathType.Filter, java.util.Map)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_XPathType_String_Filter_Map()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.crypto.dsig.spec.XPathType sut = null; // = new XPathType(java.lang.String,
                                                               // javax.xml.crypto.dsig.spec.XPathType.Filter,
                                                               // java.util.Map);
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.xml.crypto.dsig.spec.XPathType#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.xml.crypto.dsig.spec.XPathType.class.isAssignableFrom(sut));
    }

}
