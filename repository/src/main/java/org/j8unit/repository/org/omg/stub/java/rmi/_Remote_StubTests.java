package org.j8unit.repository.org.omg.stub.java.rmi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.stub.java.rmi._Remote_Stub class org.omg.stub.java.rmi._Remote_Stub}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.stub.java.rmi._Remote_StubClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface _Remote_StubTests<SUT extends org.omg.stub.java.rmi._Remote_Stub>
extends org.j8unit.repository.java.rmi.RemoteTests<SUT>, org.j8unit.repository.javax.rmi.CORBA.StubTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.stub.java.rmi._Remote_Stub#_ids() public java.lang.String[]
     * org.omg.stub.java.rmi._Remote_Stub._ids()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test__ids()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
