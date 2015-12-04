package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.PortableServer.IdAssignmentPolicyOperations interface
 * org.omg.PortableServer.IdAssignmentPolicyOperations}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.PortableServer.IdAssignmentPolicyOperationsClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface IdAssignmentPolicyOperationsTests<SUT extends org.omg.PortableServer.IdAssignmentPolicyOperations>
extends org.j8unit.repository.org.omg.CORBA.PolicyOperationsTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.IdAssignmentPolicyOperations#value() public abstract
     * org.omg.PortableServer.IdAssignmentPolicyValue org.omg.PortableServer.IdAssignmentPolicyOperations.value()}.
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
