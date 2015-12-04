package org.j8unit.repository.javax.swing.plaf.basic;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.basic.BasicArrowButton class javax.swing.plaf.basic.BasicArrowButton},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicArrowButtonTests}.
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
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicArrowButtonTests
 */
@Category(J8UnitRepository.class)
public abstract interface BasicArrowButtonClassTests<SUT extends Class<? extends javax.swing.plaf.basic.BasicArrowButton>>
extends org.j8unit.repository.javax.swing.SwingConstantsClassTests<SUT>, org.j8unit.repository.javax.swing.JButtonClassTests<SUT> {

    /**
     * Test method for
     * {@link javax.swing.plaf.basic.BasicArrowButton#BasicArrowButton(int,java.awt.Color,java.awt.Color,java.awt.Color,java.awt.Color)
     * public javax.swing.plaf.basic.BasicArrowButton(int,java.awt.Color,java.awt.Color,java.awt.Color,java.awt.Color)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BasicArrowButton_int_Color_Color_Color_Color()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.plaf.basic.BasicArrowButton sut = null; // = new
                                                                  // BasicArrowButton(int,java.awt.Color,java.awt.Color,java.awt.Color,java.awt.Color);
    }

    /**
     * Test method for {@link javax.swing.plaf.basic.BasicArrowButton#BasicArrowButton(int) public
     * javax.swing.plaf.basic.BasicArrowButton(int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BasicArrowButton_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.plaf.basic.BasicArrowButton sut = null; // = new BasicArrowButton(int);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.plaf.basic.BasicArrowButton> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.plaf.basic.BasicArrowButton.class.isAssignableFrom(sut));
    }

}
