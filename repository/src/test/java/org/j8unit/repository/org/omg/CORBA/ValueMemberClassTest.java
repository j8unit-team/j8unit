package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.ValueMember;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ValueMember} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.ValueMemberClassTests}).
 */

@RunWith(J8Unit4.class)
public class ValueMemberClassTest
implements ValueMemberClassTests<ValueMember> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.ValueMember]

    @Override
    public Class<ValueMember> createNewSUT() {
        return ValueMember.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.ValueMember#ValueMember() public
     * org.omg.CORBA.ValueMember()}.
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
    public void create_ValueMember()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ValueMember sut = new ValueMember();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.ValueMember#ValueMember(String, String, String, String, org.omg.CORBA.TypeCode, org.omg.CORBA.IDLType, short)
     * public
     * org.omg.CORBA.ValueMember(java.lang.String,java.lang.String,java.lang.String,java.lang.String,org.omg.CORBA.TypeCode,org.omg.CORBA.IDLType,short)}.
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
    public void create_ValueMember_String_String_String_String_TypeCode_IDLType_short()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ValueMember sut = null; // = new ValueMember(String, String, String, String, org.omg.CORBA.TypeCode,
                                      // org.omg.CORBA.IDLType, short);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.ValueMember]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.ValueMember]

}
