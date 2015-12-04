package org.j8unit.repository.javax.swing.border;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.border.EmptyBorder class javax.swing.border.EmptyBorder},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.swing.border.EmptyBorderTests}.
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
 * @see org.j8unit.repository.javax.swing.border.EmptyBorderTests
 */
@Category(J8UnitRepository.class)
public abstract interface EmptyBorderClassTests<SUT extends Class<? extends javax.swing.border.EmptyBorder>>
extends org.j8unit.repository.java.io.SerializableClassTests<SUT>,
        org.j8unit.repository.javax.swing.border.AbstractBorderClassTests<SUT>
{

    /**
     * Test method for {@link javax.swing.border.EmptyBorder#EmptyBorder(int,int,int,int) public javax.swing.border.EmptyBorder(int,int,int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_EmptyBorder_int_int_int_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.border.EmptyBorder sut = null; // = new EmptyBorder(int,int,int,int);
    }

    /**
     * Test method for {@link javax.swing.border.EmptyBorder#EmptyBorder(java.awt.Insets) public javax.swing.border.EmptyBorder(java.awt.Insets)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_EmptyBorder_Insets() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.border.EmptyBorder sut = null; // = new EmptyBorder(java.awt.Insets);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.swing.border.EmptyBorder> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.border.EmptyBorder.class.isAssignableFrom(sut));
    }

}
