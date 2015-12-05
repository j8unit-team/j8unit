package org.j8unit.repository.javax.swing;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.JFileChooser class javax.swing.JFileChooser}, containing all class relevant test
 * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.JFileChooserTests}.
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
 * @see org.j8unit.repository.javax.swing.JFileChooserTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JFileChooserClassTests<SUT extends Class<? extends javax.swing.JFileChooser>>
extends org.j8unit.repository.javax.accessibility.AccessibleClassTests<SUT>, org.j8unit.repository.javax.swing.JComponentClassTests<SUT> {

    /**
     * Test method for {@link javax.swing.JFileChooser#JFileChooser() public javax.swing.JFileChooser()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JFileChooser()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JFileChooser sut = null; // = new JFileChooser();
    }

    /**
     * Test method for {@link javax.swing.JFileChooser#JFileChooser(java.io.File) public
     * javax.swing.JFileChooser(java.io.File)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JFileChooser_File()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JFileChooser sut = null; // = new JFileChooser(java.io.File);
    }

    /**
     * Test method for {@link javax.swing.JFileChooser#JFileChooser(java.io.File,javax.swing.filechooser.FileSystemView)
     * public javax.swing.JFileChooser(java.io.File,javax.swing.filechooser.FileSystemView)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JFileChooser_File_FileSystemView()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JFileChooser sut = null; // = new
                                                   // JFileChooser(java.io.File,javax.swing.filechooser.FileSystemView);
    }

    /**
     * Test method for {@link javax.swing.JFileChooser#JFileChooser(javax.swing.filechooser.FileSystemView) public
     * javax.swing.JFileChooser(javax.swing.filechooser.FileSystemView)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JFileChooser_FileSystemView()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JFileChooser sut = null; // = new JFileChooser(javax.swing.filechooser.FileSystemView);
    }

    /**
     * Test method for {@link javax.swing.JFileChooser#JFileChooser(java.lang.String) public
     * javax.swing.JFileChooser(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JFileChooser_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JFileChooser sut = null; // = new JFileChooser(java.lang.String);
    }

    /**
     * Test method for
     * {@link javax.swing.JFileChooser#JFileChooser(java.lang.String,javax.swing.filechooser.FileSystemView) public
     * javax.swing.JFileChooser(java.lang.String,javax.swing.filechooser.FileSystemView)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JFileChooser_String_FileSystemView()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JFileChooser sut = null; // = new
                                                   // JFileChooser(java.lang.String,javax.swing.filechooser.FileSystemView);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.JFileChooser> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.JFileChooser.class.isAssignableFrom(sut));
    }

}