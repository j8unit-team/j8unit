package org.j8unit.repository.java.util;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.ArrayDeque class java.util.ArrayDeque}, containing all class relevant test methods
 * (at least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
 * class containing the instance relevant test methods is {@link org.j8unit.repository.java.util.ArrayDequeTests}.
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
 * @see org.j8unit.repository.java.util.ArrayDequeTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ArrayDequeClassTests<SUT extends Class<? extends java.util.ArrayDeque<E>>, E>
extends org.j8unit.repository.java.util.DequeClassTests<SUT, E>, org.j8unit.repository.java.lang.CloneableClassTests<SUT>,
org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.java.util.AbstractCollectionClassTests<SUT, E> {

    /**
     * Test method for {@link java.util.ArrayDeque#ArrayDeque() public java.util.ArrayDeque()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ArrayDeque()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.ArrayDeque<E> sut = null; // = new ArrayDeque();
    }

    /**
     * Test method for {@link java.util.ArrayDeque#ArrayDeque(java.util.Collection) public
     * java.util.ArrayDeque(java.util.Collection)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ArrayDeque_Collection()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.ArrayDeque<E> sut = null; // = new ArrayDeque(java.util.Collection);
    }

    /**
     * Test method for {@link java.util.ArrayDeque#ArrayDeque(int) public java.util.ArrayDeque(int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ArrayDeque_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.ArrayDeque<E> sut = null; // = new ArrayDeque(int);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.util.ArrayDeque<E>> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.ArrayDeque.class.isAssignableFrom(sut));
    }

}
