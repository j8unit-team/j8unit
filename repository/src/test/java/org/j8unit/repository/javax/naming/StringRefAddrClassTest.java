package org.j8unit.repository.javax.naming;

import javax.naming.StringRefAddr;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StringRefAddrClassTest
implements org.j8unit.repository.javax.naming.StringRefAddrClassTests<StringRefAddr> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.StringRefAddr]

    @Override
    public Class<StringRefAddr> createNewSUT() {
        return StringRefAddr.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.StringRefAddr#StringRefAddr(String, String) public
     * javax.naming.StringRefAddr(java.lang.String,java.lang.String)}.
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
    public void create_StringRefAddr_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StringRefAddr sut = null; // = new StringRefAddr(String, String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.StringRefAddr]

}
