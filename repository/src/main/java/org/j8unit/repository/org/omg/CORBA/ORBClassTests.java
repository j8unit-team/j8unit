package org.j8unit.repository.org.omg.CORBA;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.CORBA.ORB class org.omg.CORBA.ORB}, containing all class relevant test methods (at
 * least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
 * class containing the instance relevant test methods is {@link org.j8unit.repository.org.omg.CORBA.ORBTests}.
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
 * @see org.j8unit.repository.org.omg.CORBA.ORBTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ORBClassTests<SUT extends org.omg.CORBA.ORB>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link org.omg.CORBA.ORB#ORB() public org.omg.CORBA.ORB()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ORB()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.CORBA.ORB sut = null; // = new ORB();
    }

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.ORB#init() public static synchronized org.omg.CORBA.ORB
     * org.omg.CORBA.ORB.init()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_init()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.ORB#init(java.applet.Applet,java.util.Properties) public static
     * org.omg.CORBA.ORB org.omg.CORBA.ORB.init(java.applet.Applet,java.util.Properties)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_init_Applet_Properties()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.ORB#init(java.lang.String[],java.util.Properties) public static
     * org.omg.CORBA.ORB org.omg.CORBA.ORB.init(java.lang.String[],java.util.Properties)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_init_StringArray_Properties()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(org.omg.CORBA.ORB.class.isAssignableFrom(sut));
    }

}
