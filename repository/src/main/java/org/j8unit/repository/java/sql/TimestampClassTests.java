package org.j8unit.repository.java.sql;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.sql.Timestamp class java.sql.Timestamp}, containing all class relevant test methods (at
 * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
 * class containing the instance relevant test methods is {@link org.j8unit.repository.java.sql.TimestampTests}.
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
 * @see org.j8unit.repository.java.sql.TimestampTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TimestampClassTests<SUT extends java.sql.Timestamp>
extends org.j8unit.repository.java.util.DateClassTests<SUT> {

    /**
     * Test method for {@link java.sql.Timestamp#Timestamp(int,int,int,int,int,int,int) public
     * java.sql.Timestamp(int,int,int,int,int,int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Timestamp_int_int_int_int_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.sql.Timestamp sut = null; // = new Timestamp(int,int,int,int,int,int,int);
    }

    /**
     * Test method for {@link java.sql.Timestamp#Timestamp(long) public java.sql.Timestamp(long)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Timestamp_long()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.sql.Timestamp sut = null; // = new Timestamp(long);
    }

    /**
     * <p>
     * Test method for {@link java.sql.Timestamp#from(java.time.Instant) public static java.sql.Timestamp
     * java.sql.Timestamp.from(java.time.Instant)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_from_Instant()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.sql.Timestamp#valueOf(java.time.LocalDateTime) public static java.sql.Timestamp
     * java.sql.Timestamp.valueOf(java.time.LocalDateTime)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_valueOf_LocalDateTime()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.sql.Timestamp#valueOf(java.lang.String) public static java.sql.Timestamp
     * java.sql.Timestamp.valueOf(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_valueOf_String()
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
        assertTrue(java.sql.Timestamp.class.isAssignableFrom(sut));
    }

}
