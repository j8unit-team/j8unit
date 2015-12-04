package org.j8unit.repository.java.util;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.Date class java.util.Date}, containing all class relevant test methods (at least the
 * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
 * containing the instance relevant test methods is {@link org.j8unit.repository.java.util.DateTests}.
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
 * @see org.j8unit.repository.java.util.DateTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DateClassTests<SUT extends Class<? extends java.util.Date>>
extends org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.java.lang.CloneableClassTests<SUT>,
org.j8unit.repository.java.lang.ComparableClassTests<SUT, java.util.Date>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link java.util.Date#Date() public java.util.Date()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Date()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Date sut = null; // = new Date();
    }

    /**
     * Test method for {@link java.util.Date#Date(int,int,int) public java.util.Date(int,int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Date_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Date sut = null; // = new Date(int,int,int);
    }

    /**
     * Test method for {@link java.util.Date#Date(int,int,int,int,int) public java.util.Date(int,int,int,int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Date_int_int_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Date sut = null; // = new Date(int,int,int,int,int);
    }

    /**
     * Test method for {@link java.util.Date#Date(int,int,int,int,int,int) public
     * java.util.Date(int,int,int,int,int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Date_int_int_int_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Date sut = null; // = new Date(int,int,int,int,int,int);
    }

    /**
     * Test method for {@link java.util.Date#Date(long) public java.util.Date(long)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Date_long()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Date sut = null; // = new Date(long);
    }

    /**
     * Test method for {@link java.util.Date#Date(java.lang.String) public java.util.Date(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Date_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Date sut = null; // = new Date(java.lang.String);
    }

    /**
     * <p>
     * Test method for {@link java.util.Date#from(java.time.Instant) public static java.util.Date
     * java.util.Date.from(java.time.Instant)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_from_Instant()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Date#parse(java.lang.String) public static long
     * java.util.Date.parse(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_parse_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Date#UTC(int,int,int,int,int,int) public static long
     * java.util.Date.UTC(int,int,int,int,int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_UTC_int_int_int_int_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.util.Date> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.Date.class.isAssignableFrom(sut));
    }

}
