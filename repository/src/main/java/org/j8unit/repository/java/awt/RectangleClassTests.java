package org.j8unit.repository.java.awt;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.Rectangle class java.awt.Rectangle}, containing all class relevant test methods (at
 * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
 * class containing the instance relevant test methods is {@link org.j8unit.repository.java.awt.RectangleTests}.
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
 * @see org.j8unit.repository.java.awt.RectangleTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RectangleClassTests<SUT extends Class<? extends java.awt.Rectangle>>
extends org.j8unit.repository.java.awt.ShapeClassTests<SUT>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
org.j8unit.repository.java.awt.geom.Rectangle2DClassTests<SUT> {

    /**
     * Test method for {@link java.awt.Rectangle#Rectangle() public java.awt.Rectangle()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Rectangle()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.Rectangle sut = null; // = new Rectangle();
    }

    /**
     * Test method for {@link java.awt.Rectangle#Rectangle(java.awt.Dimension) public
     * java.awt.Rectangle(java.awt.Dimension)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Rectangle_Dimension()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.Rectangle sut = null; // = new Rectangle(java.awt.Dimension);
    }

    /**
     * Test method for {@link java.awt.Rectangle#Rectangle(int,int) public java.awt.Rectangle(int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Rectangle_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.Rectangle sut = null; // = new Rectangle(int,int);
    }

    /**
     * Test method for {@link java.awt.Rectangle#Rectangle(int,int,int,int) public java.awt.Rectangle(int,int,int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Rectangle_int_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.Rectangle sut = null; // = new Rectangle(int,int,int,int);
    }

    /**
     * Test method for {@link java.awt.Rectangle#Rectangle(java.awt.Point) public java.awt.Rectangle(java.awt.Point)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Rectangle_Point()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.Rectangle sut = null; // = new Rectangle(java.awt.Point);
    }

    /**
     * Test method for {@link java.awt.Rectangle#Rectangle(java.awt.Point,java.awt.Dimension) public
     * java.awt.Rectangle(java.awt.Point,java.awt.Dimension)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Rectangle_Point_Dimension()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.Rectangle sut = null; // = new Rectangle(java.awt.Point,java.awt.Dimension);
    }

    /**
     * Test method for {@link java.awt.Rectangle#Rectangle(java.awt.Rectangle) public
     * java.awt.Rectangle(java.awt.Rectangle)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Rectangle_Rectangle()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.Rectangle sut = null; // = new Rectangle(java.awt.Rectangle);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.awt.Rectangle> sut = createNewSUT();
        // assert assignability
        assertTrue(java.awt.Rectangle.class.isAssignableFrom(sut));
    }

}