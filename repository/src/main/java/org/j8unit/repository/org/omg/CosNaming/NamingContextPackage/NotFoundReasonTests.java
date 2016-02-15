package org.j8unit.repository.org.omg.CosNaming.NamingContextPackage;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CosNaming.NamingContextPackage.NotFoundReason class
 * org.omg.CosNaming.NamingContextPackage.NotFoundReason}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link NotFoundReasonClassTests}.
 * </p>
 *
 * @see org.omg.CosNaming.NamingContextPackage.NotFoundReason class
 *      org.omg.CosNaming.NamingContextPackage.NotFoundReason (the hereby targeted class-under-test class)
 * @see NotFoundReasonClassTests NotFoundReasonClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NotFoundReasonTests<SUT extends org.omg.CosNaming.NamingContextPackage.NotFoundReason>
extends org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.CosNaming.NamingContextPackage.NotFoundReason#value() public int
     * org.omg.CosNaming.NamingContextPackage.NotFoundReason.value()}.
     *
     * <p>
     * Test method for {@link org.omg.CosNaming.NamingContextPackage.NotFoundReason#value() public int
     * org.omg.CosNaming.NamingContextPackage.NotFoundReason.value()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CosNaming.NamingContextPackage.NotFoundReason#value() public int
     *      org.omg.CosNaming.NamingContextPackage.NotFoundReason.value() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_value()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
