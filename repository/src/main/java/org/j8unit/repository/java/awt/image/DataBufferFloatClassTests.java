package org.j8unit.repository.java.awt.image;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.image.DataBufferFloat class java.awt.image.DataBufferFloat}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.awt.image.DataBufferFloatTests}.
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
 * @see org.j8unit.repository.java.awt.image.DataBufferFloatTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DataBufferFloatClassTests<SUT extends java.awt.image.DataBufferFloat>
extends org.j8unit.repository.java.awt.image.DataBufferClassTests<SUT> {

    /**
     * Test method for {@link java.awt.image.DataBufferFloat#DataBufferFloat(float[],int) public
     * java.awt.image.DataBufferFloat(float[],int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DataBufferFloat_floatArray_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.image.DataBufferFloat sut = null; // = new DataBufferFloat(float[],int);
    }

    /**
     * Test method for {@link java.awt.image.DataBufferFloat#DataBufferFloat(float[],int,int) public
     * java.awt.image.DataBufferFloat(float[],int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DataBufferFloat_floatArray_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.image.DataBufferFloat sut = null; // = new DataBufferFloat(float[],int,int);
    }

    /**
     * Test method for {@link java.awt.image.DataBufferFloat#DataBufferFloat(float[][],int) public
     * java.awt.image.DataBufferFloat(float[][],int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DataBufferFloat_floatArrayArray_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.image.DataBufferFloat sut = null; // = new DataBufferFloat(float[][],int);
    }

    /**
     * Test method for {@link java.awt.image.DataBufferFloat#DataBufferFloat(float[][],int,int[]) public
     * java.awt.image.DataBufferFloat(float[][],int,int[])}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DataBufferFloat_floatArrayArray_int_intArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.image.DataBufferFloat sut = null; // = new DataBufferFloat(float[][],int,int[]);
    }

    /**
     * Test method for {@link java.awt.image.DataBufferFloat#DataBufferFloat(int) public
     * java.awt.image.DataBufferFloat(int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DataBufferFloat_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.image.DataBufferFloat sut = null; // = new DataBufferFloat(int);
    }

    /**
     * Test method for {@link java.awt.image.DataBufferFloat#DataBufferFloat(int,int) public
     * java.awt.image.DataBufferFloat(int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DataBufferFloat_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.image.DataBufferFloat sut = null; // = new DataBufferFloat(int,int);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.awt.image.DataBufferFloat.class.isAssignableFrom(sut));
    }

}
