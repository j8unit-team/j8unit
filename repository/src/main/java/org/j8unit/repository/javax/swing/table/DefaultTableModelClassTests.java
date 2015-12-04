package org.j8unit.repository.javax.swing.table;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.table.DefaultTableModel class javax.swing.table.DefaultTableModel}, containing all
 * class relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.table.DefaultTableModelTests}.
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
 * @see org.j8unit.repository.javax.swing.table.DefaultTableModelTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DefaultTableModelClassTests<SUT extends Class<? extends javax.swing.table.DefaultTableModel>>
extends org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.javax.swing.table.AbstractTableModelClassTests<SUT> {

    /**
     * Test method for {@link javax.swing.table.DefaultTableModel#DefaultTableModel() public
     * javax.swing.table.DefaultTableModel()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DefaultTableModel()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.table.DefaultTableModel sut = null; // = new DefaultTableModel();
    }

    /**
     * Test method for {@link javax.swing.table.DefaultTableModel#DefaultTableModel(int,int) public
     * javax.swing.table.DefaultTableModel(int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DefaultTableModel_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.table.DefaultTableModel sut = null; // = new DefaultTableModel(int,int);
    }

    /**
     * Test method for {@link javax.swing.table.DefaultTableModel#DefaultTableModel(java.lang.Object[],int) public
     * javax.swing.table.DefaultTableModel(java.lang.Object[],int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DefaultTableModel_ObjectArray_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.table.DefaultTableModel sut = null; // = new DefaultTableModel(java.lang.Object[],int);
    }

    /**
     * Test method for
     * {@link javax.swing.table.DefaultTableModel#DefaultTableModel(java.lang.Object[][],java.lang.Object[]) public
     * javax.swing.table.DefaultTableModel(java.lang.Object[][],java.lang.Object[])}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DefaultTableModel_ObjectArrayArray_ObjectArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.table.DefaultTableModel sut = null; // = new
                                                              // DefaultTableModel(java.lang.Object[][],java.lang.Object[]);
    }

    /**
     * Test method for {@link javax.swing.table.DefaultTableModel#DefaultTableModel(java.util.Vector,int) public
     * javax.swing.table.DefaultTableModel(java.util.Vector,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DefaultTableModel_Vector_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.table.DefaultTableModel sut = null; // = new DefaultTableModel(java.util.Vector,int);
    }

    /**
     * Test method for {@link javax.swing.table.DefaultTableModel#DefaultTableModel(java.util.Vector,java.util.Vector)
     * public javax.swing.table.DefaultTableModel(java.util.Vector,java.util.Vector)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DefaultTableModel_Vector_Vector()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.table.DefaultTableModel sut = null; // = new
                                                              // DefaultTableModel(java.util.Vector,java.util.Vector);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.table.DefaultTableModel> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.table.DefaultTableModel.class.isAssignableFrom(sut));
    }

}
