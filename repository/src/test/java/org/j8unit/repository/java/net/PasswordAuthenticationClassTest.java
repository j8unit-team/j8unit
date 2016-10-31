package org.j8unit.repository.java.net;

import java.net.PasswordAuthentication;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PasswordAuthenticationClassTest
implements org.j8unit.repository.java.net.PasswordAuthenticationClassTests<PasswordAuthentication> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.PasswordAuthentication]

    @Override
    public Class<PasswordAuthentication> createNewSUT() {
        return PasswordAuthentication.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.net.PasswordAuthentication#PasswordAuthentication(String, char[]) public
     * java.net.PasswordAuthentication(java.lang.String,char[])}.
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
    public void create_PasswordAuthentication_String_charArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PasswordAuthentication sut = null; // = new PasswordAuthentication(String, char[]);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.PasswordAuthentication]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.PasswordAuthentication]

}
