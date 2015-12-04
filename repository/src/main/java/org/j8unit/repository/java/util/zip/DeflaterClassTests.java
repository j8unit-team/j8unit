package org.j8unit.repository.java.util.zip;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.zip.Deflater class java.util.zip.Deflater}, containing all class relevant test
 * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.util.zip.DeflaterTests}.
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
 * @see org.j8unit.repository.java.util.zip.DeflaterTests
 */
@Category(J8UnitRepository.class)
public abstract interface DeflaterClassTests<SUT extends Class<? extends java.util.zip.Deflater>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link java.util.zip.Deflater#Deflater() public java.util.zip.Deflater()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Deflater()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.zip.Deflater sut = null; // = new Deflater();
    }

    /**
     * Test method for {@link java.util.zip.Deflater#Deflater(int) public java.util.zip.Deflater(int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Deflater_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.zip.Deflater sut = null; // = new Deflater(int);
    }

    /**
     * Test method for {@link java.util.zip.Deflater#Deflater(int,boolean) public java.util.zip.Deflater(int,boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Deflater_int_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.zip.Deflater sut = null; // = new Deflater(int,boolean);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.util.zip.Deflater> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.zip.Deflater.class.isAssignableFrom(sut));
    }

}
