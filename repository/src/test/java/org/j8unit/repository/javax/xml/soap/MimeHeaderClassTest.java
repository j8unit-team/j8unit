package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.MimeHeader;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MimeHeaderClassTest
implements org.j8unit.repository.javax.xml.soap.MimeHeaderClassTests<MimeHeader> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.soap.MimeHeader]

    @Override
    public Class<MimeHeader> createNewSUT() {
        return MimeHeader.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.soap.MimeHeader#MimeHeader(String, String) public
     * javax.xml.soap.MimeHeader(java.lang.String,java.lang.String)}.
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
    public void create_MimeHeader_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MimeHeader sut = null; // = new MimeHeader(String, String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.soap.MimeHeader]

}
