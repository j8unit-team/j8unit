package org.j8unit.repository.org.omg.stub.java.rmi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.rmi.RemoteTests;
import org.j8unit.repository.javax.rmi.CORBA.StubTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.omg.stub.java.rmi._Remote_Stub;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link _Remote_Stub
 * public final class org.omg.stub.java.rmi._Remote_Stub}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link _Remote_StubClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface _Remote_StubTests<SUT extends _Remote_Stub>
extends RemoteTests<SUT>, StubTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.stub.java.rmi._Remote_Stub]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link org.omg.stub.java.rmi._Remote_Stub#_ids() public
     * java.lang.String[] org.omg.stub.java.rmi._Remote_Stub._ids()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test__ids()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.stub.java.rmi._Remote_Stub]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.stub.java.rmi._Remote_Stub]
}
