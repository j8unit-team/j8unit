package org.j8unit.repository.javax.swing;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.SpinnerNumberModel class javax.swing.SpinnerNumberModel}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.SpinnerNumberModelTests}.
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
 * @see org.j8unit.repository.javax.swing.SpinnerNumberModelTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SpinnerNumberModelClassTests<SUT extends Class<? extends javax.swing.SpinnerNumberModel>>
extends org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.javax.swing.AbstractSpinnerModelClassTests<SUT> {

    /**
     * Test method for {@link javax.swing.SpinnerNumberModel#SpinnerNumberModel() public
     * javax.swing.SpinnerNumberModel()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SpinnerNumberModel()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.SpinnerNumberModel sut = null; // = new SpinnerNumberModel();
    }

    /**
     * Test method for {@link javax.swing.SpinnerNumberModel#SpinnerNumberModel(double,double,double,double) public
     * javax.swing.SpinnerNumberModel(double,double,double,double)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SpinnerNumberModel_double_double_double_double()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.SpinnerNumberModel sut = null; // = new SpinnerNumberModel(double,double,double,double);
    }

    /**
     * Test method for {@link javax.swing.SpinnerNumberModel#SpinnerNumberModel(int,int,int,int) public
     * javax.swing.SpinnerNumberModel(int,int,int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SpinnerNumberModel_int_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.SpinnerNumberModel sut = null; // = new SpinnerNumberModel(int,int,int,int);
    }

    /**
     * Test method for
     * {@link javax.swing.SpinnerNumberModel#SpinnerNumberModel(java.lang.Number,java.lang.Comparable,java.lang.Comparable,java.lang.Number)
     * public
     * javax.swing.SpinnerNumberModel(java.lang.Number,java.lang.Comparable,java.lang.Comparable,java.lang.Number)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_SpinnerNumberModel_Number_Comparable_Comparable_Number()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.SpinnerNumberModel sut = null; // = new
                                                         // SpinnerNumberModel(java.lang.Number,java.lang.Comparable,java.lang.Comparable,java.lang.Number);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.SpinnerNumberModel> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.SpinnerNumberModel.class.isAssignableFrom(sut));
    }

}
