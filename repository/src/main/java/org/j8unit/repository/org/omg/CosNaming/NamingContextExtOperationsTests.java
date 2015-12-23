package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.CosNaming.NamingContextExtOperations interface
 * org.omg.CosNaming.NamingContextExtOperations}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.org.omg.CosNaming.NamingContextExtOperationsTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.CosNaming.NamingContextExtOperationsClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.CosNaming.NamingContextExtOperations
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NamingContextExtOperationsTests<SUT extends org.omg.CosNaming.NamingContextExtOperations>
extends org.j8unit.repository.org.omg.CosNaming.NamingContextOperationsTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.CosNaming.NamingContextExtOperations#resolve_str(java.lang.String) public abstract
     * org.omg.CORBA.Object org.omg.CosNaming.NamingContextExtOperations.resolve_str(java.lang.String) throws
     * org.omg.CosNaming.NamingContextPackage.NotFound,org.omg.CosNaming.NamingContextPackage.CannotProceed,org.omg.CosNaming.NamingContextPackage.InvalidName}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CosNaming.NamingContextExtOperations#resolve_str(java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_resolve_str_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CosNaming.NamingContextExtOperations#to_name(java.lang.String) public abstract
     * org.omg.CosNaming.NameComponent[] org.omg.CosNaming.NamingContextExtOperations.to_name(java.lang.String) throws
     * org.omg.CosNaming.NamingContextPackage.InvalidName}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CosNaming.NamingContextExtOperations#to_name(java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_to_name_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CosNaming.NamingContextExtOperations#to_string(org.omg.CosNaming.NameComponent[])
     * public abstract java.lang.String
     * org.omg.CosNaming.NamingContextExtOperations.to_string(org.omg.CosNaming.NameComponent[]) throws
     * org.omg.CosNaming.NamingContextPackage.InvalidName}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CosNaming.NamingContextExtOperations#to_string(org.omg.CosNaming.NameComponent[])
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_to_string_NameComponentArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CosNaming.NamingContextExtOperations#to_url(java.lang.String, java.lang.String)
     * public abstract java.lang.String
     * org.omg.CosNaming.NamingContextExtOperations.to_url(java.lang.String,java.lang.String) throws
     * org.omg.CosNaming.NamingContextExtPackage.InvalidAddress,org.omg.CosNaming.NamingContextPackage.InvalidName}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CosNaming.NamingContextExtOperations#to_url(java.lang.String, java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_to_url_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
