package org.j8unit.repository.javax.swing.plaf;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.FontUIResource class javax.swing.plaf.FontUIResource}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.plaf.FontUIResourceTests}.
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
 * @see org.j8unit.repository.javax.swing.plaf.FontUIResourceTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FontUIResourceClassTests<SUT extends javax.swing.plaf.FontUIResource>
extends org.j8unit.repository.javax.swing.plaf.UIResourceClassTests<SUT>, org.j8unit.repository.java.awt.FontClassTests<SUT> {

    /**
     * Test method for {@link javax.swing.plaf.FontUIResource#FontUIResource(java.awt.Font) public
     * javax.swing.plaf.FontUIResource(java.awt.Font)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_FontUIResource_Font()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.plaf.FontUIResource sut = null; // = new FontUIResource(java.awt.Font);
    }

    /**
     * Test method for {@link javax.swing.plaf.FontUIResource#FontUIResource(java.lang.String,int,int) public
     * javax.swing.plaf.FontUIResource(java.lang.String,int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_FontUIResource_String_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.plaf.FontUIResource sut = null; // = new FontUIResource(java.lang.String,int,int);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.plaf.FontUIResource.class.isAssignableFrom(sut));
    }

}
