package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.StructMember;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StructMember} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.StructMemberClassTests}).
 */
@RunWith(J8Unit4.class)
public class StructMemberClassTest
implements StructMemberClassTests<StructMember> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.StructMember]

    @Override
    public Class<StructMember> createNewSUT() {
        return StructMember.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.StructMember#StructMember()
     * public org.omg.CORBA.StructMember()}.
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
    public void create_StructMember()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StructMember sut = new StructMember();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.StructMember#StructMember(String, org.omg.CORBA.TypeCode, org.omg.CORBA.IDLType) public
     * org.omg.CORBA.StructMember(java.lang.String,org.omg.CORBA.TypeCode,org.omg.CORBA.IDLType)}.
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
    public void create_StructMember_String_TypeCode_IDLType()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StructMember sut = null; // = new StructMember(String, org.omg.CORBA.TypeCode, org.omg.CORBA.IDLType);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.StructMember]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.StructMember]

}
