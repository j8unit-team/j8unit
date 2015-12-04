package org.j8unit.repository.java.awt;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.awt.Frame class java.awt.Frame},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.awt.FrameTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself.
 * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
 * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
 * provides a corresponding, inheritable test method:
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
 * runtime constraints and further class specific requirements.
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.FrameTests
 */
@Category(J8UnitRepository.class)
public abstract interface FrameClassTests<SUT extends Class<? extends java.awt.Frame>>
extends org.j8unit.repository.java.awt.MenuContainerClassTests<SUT>,
        org.j8unit.repository.java.awt.WindowClassTests<SUT>
{

    /**
     * Test method for {@link java.awt.Frame#Frame(java.lang.String,java.awt.GraphicsConfiguration) public java.awt.Frame(java.lang.String,java.awt.GraphicsConfiguration)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Frame_String_GraphicsConfiguration() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.awt.Frame sut = null; // = new Frame(java.lang.String,java.awt.GraphicsConfiguration);
    }

    /**
     * Test method for {@link java.awt.Frame#Frame(java.lang.String) public java.awt.Frame(java.lang.String) throws java.awt.HeadlessException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Frame_String() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.awt.Frame sut = null; // = new Frame(java.lang.String);
    }

    /**
     * Test method for {@link java.awt.Frame#Frame(java.awt.GraphicsConfiguration) public java.awt.Frame(java.awt.GraphicsConfiguration)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Frame_GraphicsConfiguration() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.awt.Frame sut = null; // = new Frame(java.awt.GraphicsConfiguration);
    }

    /**
     * Test method for {@link java.awt.Frame#Frame() public java.awt.Frame() throws java.awt.HeadlessException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Frame() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.awt.Frame sut = null; // = new Frame();
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.awt.Frame> sut = createNewSUT();
        // assert assignability
        assertTrue(java.awt.Frame.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link java.awt.Frame#getFrames() public static java.awt.Frame[] java.awt.Frame.getFrames()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFrames() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
