package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.PortableInterceptor.PolicyFactoryOperations interface
 * org.omg.PortableInterceptor.PolicyFactoryOperations}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.PortableInterceptor.PolicyFactoryOperationsClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PolicyFactoryOperationsTests<SUT extends org.omg.PortableInterceptor.PolicyFactoryOperations>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.PortableInterceptor.PolicyFactoryOperations#create_policy(int,org.omg.CORBA.Any)
     * public abstract org.omg.CORBA.Policy
     * org.omg.PortableInterceptor.PolicyFactoryOperations.create_policy(int,org.omg.CORBA.Any) throws
     * org.omg.CORBA.PolicyError}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_create_policy_int_Any()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
