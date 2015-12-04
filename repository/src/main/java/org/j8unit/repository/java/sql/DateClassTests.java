package org.j8unit.repository.java.sql;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.sql.Date class java.sql.Date}, containing all class relevant test methods (at least the
 * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
 * containing the instance relevant test methods is {@link org.j8unit.repository.java.sql.DateTests}.
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
 * @see org.j8unit.repository.java.sql.DateTests
 */
@Category(J8UnitRepository.class)
public abstract interface DateClassTests<SUT extends Class<? extends java.sql.Date>>
extends org.j8unit.repository.java.util.DateClassTests<SUT> {

    /**
     * Test method for {@link java.sql.Date#Date(int,int,int) public java.sql.Date(int,int,int)}.
     */
    @Override
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Date_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.sql.Date sut = null; // = new Date(int,int,int);
    }

    /**
     * Test method for {@link java.sql.Date#Date(long) public java.sql.Date(long)}.
     */
    @Override
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Date_long()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.sql.Date sut = null; // = new Date(long);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.sql.Date> sut = createNewSUT();
        // assert assignability
        assertTrue(java.sql.Date.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link java.sql.Date#valueOf(java.time.LocalDate) public static java.sql.Date
     * java.sql.Date.valueOf(java.time.LocalDate)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_valueOf_LocalDate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.sql.Date#valueOf(java.lang.String) public static java.sql.Date
     * java.sql.Date.valueOf(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_valueOf_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
