package org.j8unit.repository.org.omg.IOP;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.IOP.ServiceContextListHelper class org.omg.IOP.ServiceContextListHelper}, containing
 * all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.org.omg.IOP.ServiceContextListHelperTests}.
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
 * @see org.j8unit.repository.org.omg.IOP.ServiceContextListHelperTests
 */
@Category(J8UnitRepository.class)
public abstract interface ServiceContextListHelperClassTests<SUT extends Class<? extends org.omg.IOP.ServiceContextListHelper>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link org.omg.IOP.ServiceContextListHelper#ServiceContextListHelper() public
     * org.omg.IOP.ServiceContextListHelper()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ServiceContextListHelper()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.IOP.ServiceContextListHelper sut = null; // = new ServiceContextListHelper();
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends org.omg.IOP.ServiceContextListHelper> sut = createNewSUT();
        // assert assignability
        assertTrue(org.omg.IOP.ServiceContextListHelper.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link org.omg.IOP.ServiceContextListHelper#read(org.omg.CORBA.portable.InputStream) public
     * static org.omg.IOP.ServiceContext[]
     * org.omg.IOP.ServiceContextListHelper.read(org.omg.CORBA.portable.InputStream)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_read_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.IOP.ServiceContextListHelper#extract(org.omg.CORBA.Any) public static
     * org.omg.IOP.ServiceContext[] org.omg.IOP.ServiceContextListHelper.extract(org.omg.CORBA.Any)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_extract_Any()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.IOP.ServiceContextListHelper#write(org.omg.CORBA.portable.OutputStream,org.omg.IOP.ServiceContext[])
     * public static void
     * org.omg.IOP.ServiceContextListHelper.write(org.omg.CORBA.portable.OutputStream,org.omg.IOP.ServiceContext[])}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write_OutputStream_ServiceContextArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.IOP.ServiceContextListHelper#type() public static synchronized
     * org.omg.CORBA.TypeCode org.omg.IOP.ServiceContextListHelper.type()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_type()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.IOP.ServiceContextListHelper#id() public static java.lang.String
     * org.omg.IOP.ServiceContextListHelper.id()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_id()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.IOP.ServiceContextListHelper#insert(org.omg.CORBA.Any,org.omg.IOP.ServiceContext[]) public static
     * void org.omg.IOP.ServiceContextListHelper.insert(org.omg.CORBA.Any,org.omg.IOP.ServiceContext[])}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_insert_Any_ServiceContextArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
