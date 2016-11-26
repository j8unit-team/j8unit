package org.j8unit.repository.org.omg.CORBA.DynAnyPackage;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.DynAnyPackage.InvalidSeq;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InvalidSeq} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.CORBA.DynAnyPackage.InvalidSeqClassTests}).
 */
@RunWith(J8Unit4.class)
public class InvalidSeqClassTest
implements InvalidSeqClassTests<InvalidSeq> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.DynAnyPackage.InvalidSeq]

    @Override
    public Class<InvalidSeq> createNewSUT() {
        return InvalidSeq.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.DynAnyPackage.InvalidSeq#InvalidSeq() public org.omg.CORBA.DynAnyPackage.InvalidSeq()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_InvalidSeq()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidSeq sut = new InvalidSeq();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.DynAnyPackage.InvalidSeq#InvalidSeq(String) public
     * org.omg.CORBA.DynAnyPackage.InvalidSeq(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_InvalidSeq_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidSeq sut = null; // = new InvalidSeq(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.DynAnyPackage.InvalidSeq]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.DynAnyPackage.InvalidSeq]

}
