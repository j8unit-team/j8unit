package org.j8unit.repository.javax.swing.text;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.text.TableView class javax.swing.text.TableView},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.swing.text.TableViewTests}.
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
 * @see org.j8unit.repository.javax.swing.text.TableViewTests
 */
@Category(J8UnitRepository.class)
public abstract interface TableViewClassTests<SUT extends Class<? extends javax.swing.text.TableView>>
extends org.j8unit.repository.javax.swing.text.BoxViewClassTests<SUT>
{

    /**
     * Test method for {@link javax.swing.text.TableView#TableView(javax.swing.text.Element) public javax.swing.text.TableView(javax.swing.text.Element)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_TableView_Element() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.text.TableView sut = null; // = new TableView(javax.swing.text.Element);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.swing.text.TableView> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.text.TableView.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.TableView$TableCell class javax.swing.text.TableView$TableCell},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.text.TableViewTests.TableCellTests}.
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
     * @see org.j8unit.repository.javax.swing.text.TableViewTests.TableCellTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface TableCellClassTests<SUT extends Class<? extends javax.swing.text.TableView.TableCell>>
    extends org.j8unit.repository.javax.swing.text.BoxViewClassTests<SUT>
    {

        /**
         * Test method for {@link javax.swing.text.TableView.TableCell#TableCell(javax.swing.text.TableView,javax.swing.text.Element) public javax.swing.text.TableView$TableCell(javax.swing.text.TableView,javax.swing.text.Element)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TableCell_TableView_Element() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            javax.swing.text.TableView.TableCell sut = null; // = new TableCell(javax.swing.text.TableView,javax.swing.text.Element);
        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.text.TableView.TableCell> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.TableView.TableCell.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.TableView$TableRow class javax.swing.text.TableView$TableRow},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.javax.swing.text.TableViewTests.TableRowTests}.
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
     * @see org.j8unit.repository.javax.swing.text.TableViewTests.TableRowTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface TableRowClassTests<SUT extends Class<? extends javax.swing.text.TableView.TableRow>>
    extends org.j8unit.repository.javax.swing.text.BoxViewClassTests<SUT>
    {

        /**
         * Test method for {@link javax.swing.text.TableView.TableRow#TableRow(javax.swing.text.TableView,javax.swing.text.Element) public javax.swing.text.TableView$TableRow(javax.swing.text.TableView,javax.swing.text.Element)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_TableRow_TableView_Element() throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            javax.swing.text.TableView.TableRow sut = null; // = new TableRow(javax.swing.text.TableView,javax.swing.text.Element);
        }

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends javax.swing.text.TableView.TableRow> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.text.TableView.TableRow.class.isAssignableFrom(sut));
        }

    }

}
