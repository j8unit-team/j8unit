package org.j8unit.repository.org.omg.CORBA_2_3;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.CORBA_2_3.ORB class org.omg.CORBA_2_3.ORB}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is {@link org.j8unit.repository.org.omg.CORBA_2_3.ORBTests}
 * .
 * </p>
 *
 * @see org.j8unit.repository.org.omg.CORBA_2_3.ORBClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.CORBA_2_3.ORB
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ORBTests<SUT extends org.omg.CORBA_2_3.ORB>
extends org.j8unit.repository.org.omg.CORBA.ORBTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.CORBA_2_3.ORB#get_value_def(java.lang.String) public org.omg.CORBA.Object
     * org.omg.CORBA_2_3.ORB.get_value_def(java.lang.String) throws org.omg.CORBA.BAD_PARAM}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CORBA_2_3.ORB#get_value_def(java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_value_def_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CORBA_2_3.ORB#lookup_value_factory(java.lang.String) public
     * org.omg.CORBA.portable.ValueFactory org.omg.CORBA_2_3.ORB.lookup_value_factory(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CORBA_2_3.ORB#lookup_value_factory(java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lookup_value_factory_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.CORBA_2_3.ORB#register_value_factory(java.lang.String, org.omg.CORBA.portable.ValueFactory) public
     * org.omg.CORBA.portable.ValueFactory
     * org.omg.CORBA_2_3.ORB.register_value_factory(java.lang.String,org.omg.CORBA.portable.ValueFactory)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CORBA_2_3.ORB#register_value_factory(java.lang.String, org.omg.CORBA.portable.ValueFactory)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_register_value_factory_String_ValueFactory()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CORBA_2_3.ORB#set_delegate(java.lang.Object) public void
     * org.omg.CORBA_2_3.ORB.set_delegate(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CORBA_2_3.ORB#set_delegate(java.lang.Object)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set_delegate_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CORBA_2_3.ORB#unregister_value_factory(java.lang.String) public void
     * org.omg.CORBA_2_3.ORB.unregister_value_factory(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CORBA_2_3.ORB#unregister_value_factory(java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unregister_value_factory_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
