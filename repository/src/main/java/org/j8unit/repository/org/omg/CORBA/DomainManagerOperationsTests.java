package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.DomainManagerOperations interface
 * org.omg.CORBA.DomainManagerOperations}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link DomainManagerOperationsClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.DomainManagerOperations interface org.omg.CORBA.DomainManagerOperations (the hereby targeted
 *      class-under-test class)
 * @see DomainManagerOperationsClassTests DomainManagerOperationsClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DomainManagerOperationsTests<SUT extends org.omg.CORBA.DomainManagerOperations>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.DomainManagerOperations#get_domain_policy(int) public abstract
     * org.omg.CORBA.Policy org.omg.CORBA.DomainManagerOperations.get_domain_policy(int)}.
     *
     * <p>
     * Test method for {@link org.omg.CORBA.DomainManagerOperations#get_domain_policy(int) public abstract
     * org.omg.CORBA.Policy org.omg.CORBA.DomainManagerOperations.get_domain_policy(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CORBA.DomainManagerOperations#get_domain_policy(int) public abstract org.omg.CORBA.Policy
     *      org.omg.CORBA.DomainManagerOperations.get_domain_policy(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_domain_policy_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
