package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.Any;
import org.omg.CORBA.NameValuePair;

@RunWith(J8Unit4.class)
public class NameValuePairClassTest
implements org.j8unit.repository.org.omg.CORBA.NameValuePairClassTests<NameValuePair> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.NameValuePair]

    @Override
    public Class<NameValuePair> createNewSUT() {
        return NameValuePair.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link NameValuePair#NameValuePair() public
     * org.omg.CORBA.NameValuePair()}.
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
    public void create_NameValuePair()
    throws Exception {
        // create new instance
        final NameValuePair sut = new NameValuePair();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link NameValuePair#NameValuePair(String, Any) public
     * org.omg.CORBA.NameValuePair(java.lang.String,org.omg.CORBA.Any)}.
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
    public void create_NameValuePair_String_Any()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NameValuePair sut = null; // = new NameValuePair(String, Any);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.NameValuePair]

}
