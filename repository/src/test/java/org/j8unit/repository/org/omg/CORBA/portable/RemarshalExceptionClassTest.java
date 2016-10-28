package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.portable.RemarshalException;

@RunWith(J8Unit4.class)
public class RemarshalExceptionClassTest
implements org.j8unit.repository.org.omg.CORBA.portable.RemarshalExceptionClassTests<RemarshalException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.portable.RemarshalException]

    @Override
    public Class<RemarshalException> createNewSUT() {
        return RemarshalException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link RemarshalException#RemarshalException() public
     * org.omg.CORBA.portable.RemarshalException()}.
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
    public void create_RemarshalException()
    throws Exception {
        // create new instance
        final RemarshalException sut = new RemarshalException();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.portable.RemarshalException]

}
