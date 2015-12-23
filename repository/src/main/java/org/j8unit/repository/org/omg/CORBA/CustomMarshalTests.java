package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.CORBA.CustomMarshal interface org.omg.CORBA.CustomMarshal},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.CORBA.CustomMarshalTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.CORBA.CustomMarshalClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.CORBA.CustomMarshal
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CustomMarshalTests<SUT extends org.omg.CORBA.CustomMarshal>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.CustomMarshal#marshal(org.omg.CORBA.DataOutputStream) public abstract void
     * org.omg.CORBA.CustomMarshal.marshal(org.omg.CORBA.DataOutputStream)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CORBA.CustomMarshal#marshal(org.omg.CORBA.DataOutputStream)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_marshal_DataOutputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.CustomMarshal#unmarshal(org.omg.CORBA.DataInputStream) public abstract void
     * org.omg.CORBA.CustomMarshal.unmarshal(org.omg.CORBA.DataInputStream)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CORBA.CustomMarshal#unmarshal(org.omg.CORBA.DataInputStream)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unmarshal_DataInputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
