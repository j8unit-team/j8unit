package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.Principal class org.omg.CORBA.Principal}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link PrincipalClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.Principal class org.omg.CORBA.Principal (the hereby targeted class-under-test class)
 * @see PrincipalClassTests PrincipalClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PrincipalTests<SUT extends org.omg.CORBA.Principal>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.Principal#name(byte[]) public void org.omg.CORBA.Principal.name(byte[])}.
     *
     * <p>
     * Test method for {@link org.omg.CORBA.Principal#name(byte[]) public void org.omg.CORBA.Principal.name(byte[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CORBA.Principal#name(byte[]) public void org.omg.CORBA.Principal.name(byte[]) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_name_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.Principal#name() public byte[] org.omg.CORBA.Principal.name()}.
     *
     * <p>
     * Test method for {@link org.omg.CORBA.Principal#name() public byte[] org.omg.CORBA.Principal.name()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CORBA.Principal#name() public byte[] org.omg.CORBA.Principal.name() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_name()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
