package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.PortableServer.ThreadPolicyOperations interface
 * org.omg.PortableServer.ThreadPolicyOperations}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.PortableServer.ThreadPolicyOperationsClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ThreadPolicyOperationsTests<SUT extends org.omg.PortableServer.ThreadPolicyOperations>
extends org.j8unit.repository.org.omg.CORBA.PolicyOperationsTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.ThreadPolicyOperations#value() public abstract
     * org.omg.PortableServer.ThreadPolicyValue org.omg.PortableServer.ThreadPolicyOperations.value()}.
     * </p>
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
