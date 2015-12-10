package org.j8unit.repository.javax.swing;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.JProgressBar class javax.swing.JProgressBar}, containing all class relevant test
 * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.JProgressBarTests}.
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
 * @see org.j8unit.repository.javax.swing.JProgressBarTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JProgressBarClassTests<SUT extends javax.swing.JProgressBar>
extends org.j8unit.repository.javax.swing.SwingConstantsClassTests<SUT>, org.j8unit.repository.javax.accessibility.AccessibleClassTests<SUT>,
org.j8unit.repository.javax.swing.JComponentClassTests<SUT> {

    /**
     * Test method for {@link javax.swing.JProgressBar#JProgressBar() public javax.swing.JProgressBar()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JProgressBar()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JProgressBar sut = null; // = new JProgressBar();
    }

    /**
     * Test method for {@link javax.swing.JProgressBar#JProgressBar(javax.swing.BoundedRangeModel) public
     * javax.swing.JProgressBar(javax.swing.BoundedRangeModel)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JProgressBar_BoundedRangeModel()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JProgressBar sut = null; // = new JProgressBar(javax.swing.BoundedRangeModel);
    }

    /**
     * Test method for {@link javax.swing.JProgressBar#JProgressBar(int) public javax.swing.JProgressBar(int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JProgressBar_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JProgressBar sut = null; // = new JProgressBar(int);
    }

    /**
     * Test method for {@link javax.swing.JProgressBar#JProgressBar(int,int) public javax.swing.JProgressBar(int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JProgressBar_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JProgressBar sut = null; // = new JProgressBar(int,int);
    }

    /**
     * Test method for {@link javax.swing.JProgressBar#JProgressBar(int,int,int) public
     * javax.swing.JProgressBar(int,int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JProgressBar_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JProgressBar sut = null; // = new JProgressBar(int,int,int);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.JProgressBar.class.isAssignableFrom(sut));
    }

}
