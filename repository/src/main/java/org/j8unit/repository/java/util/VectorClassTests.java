package org.j8unit.repository.java.util;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.Vector class java.util.Vector}, containing all class relevant test methods (at least
 * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
 * containing the instance relevant test methods is {@link org.j8unit.repository.java.util.VectorTests}.
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
 * @see org.j8unit.repository.java.util.VectorTests
 */
@Category(J8UnitRepository.class)
public abstract interface VectorClassTests<SUT extends Class<? extends java.util.Vector<E>>, E>
extends org.j8unit.repository.java.util.ListClassTests<SUT, E>, org.j8unit.repository.java.util.RandomAccessClassTests<SUT>,
org.j8unit.repository.java.lang.CloneableClassTests<SUT>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
org.j8unit.repository.java.util.AbstractListClassTests<SUT, E> {

    /**
     * Test method for {@link java.util.Vector#Vector() public java.util.Vector()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Vector()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Vector<E> sut = null; // = new Vector();
    }

    /**
     * Test method for {@link java.util.Vector#Vector(java.util.Collection) public
     * java.util.Vector(java.util.Collection)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Vector_Collection()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Vector<E> sut = null; // = new Vector(java.util.Collection);
    }

    /**
     * Test method for {@link java.util.Vector#Vector(int) public java.util.Vector(int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Vector_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Vector<E> sut = null; // = new Vector(int);
    }

    /**
     * Test method for {@link java.util.Vector#Vector(int,int) public java.util.Vector(int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Vector_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Vector<E> sut = null; // = new Vector(int,int);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.util.Vector<E>> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.Vector.class.isAssignableFrom(sut));
    }

}
