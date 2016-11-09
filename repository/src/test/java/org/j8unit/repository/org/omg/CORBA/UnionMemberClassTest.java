package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.UnionMember;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UnionMember} (by simply reusing the
 * J8Unit test interface {@link UnionMemberClassTests}).
 */

@RunWith(J8Unit4.class)
public class UnionMemberClassTest
implements UnionMemberClassTests<UnionMember> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.UnionMember]

    @Override
    public Class<UnionMember> createNewSUT() {
        return UnionMember.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.UnionMember#UnionMember() public
     * org.omg.CORBA.UnionMember()}.
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
    public void create_UnionMember()
    throws Exception {
        // create new instance
        final UnionMember sut = new UnionMember();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.UnionMember#UnionMember(String, org.omg.CORBA.Any, org.omg.CORBA.TypeCode, org.omg.CORBA.IDLType)
     * public
     * org.omg.CORBA.UnionMember(java.lang.String,org.omg.CORBA.Any,org.omg.CORBA.TypeCode,org.omg.CORBA.IDLType)}.
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
    public void create_UnionMember_String_Any_TypeCode_IDLType()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnionMember sut = null; // = new UnionMember(String, org.omg.CORBA.Any, org.omg.CORBA.TypeCode,
                                      // org.omg.CORBA.IDLType);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.UnionMember]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.UnionMember]

}
