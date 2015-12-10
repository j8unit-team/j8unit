package org.j8unit.repository.java.awt.geom;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.geom.GeneralPath class java.awt.geom.GeneralPath}, containing all class relevant test
 * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.awt.geom.GeneralPathTests}.
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
 * @see org.j8unit.repository.java.awt.geom.GeneralPathTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface GeneralPathClassTests<SUT extends java.awt.geom.GeneralPath>
extends org.j8unit.repository.java.awt.geom.Path2DClassTests.FloatClassTests<SUT> {

    /**
     * Test method for {@link java.awt.geom.GeneralPath#GeneralPath() public java.awt.geom.GeneralPath()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_GeneralPath()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.geom.GeneralPath sut = null; // = new GeneralPath();
    }

    /**
     * Test method for {@link java.awt.geom.GeneralPath#GeneralPath(int) public java.awt.geom.GeneralPath(int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_GeneralPath_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.geom.GeneralPath sut = null; // = new GeneralPath(int);
    }

    /**
     * Test method for {@link java.awt.geom.GeneralPath#GeneralPath(int,int) public java.awt.geom.GeneralPath(int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_GeneralPath_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.geom.GeneralPath sut = null; // = new GeneralPath(int,int);
    }

    /**
     * Test method for {@link java.awt.geom.GeneralPath#GeneralPath(java.awt.Shape) public
     * java.awt.geom.GeneralPath(java.awt.Shape)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_GeneralPath_Shape()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.geom.GeneralPath sut = null; // = new GeneralPath(java.awt.Shape);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.awt.geom.GeneralPath.class.isAssignableFrom(sut));
    }

}
