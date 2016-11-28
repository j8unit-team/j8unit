package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.MimeHeaders;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MimeHeaders} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.soap.MimeHeadersClassTests}).
 */
@RunWith(J8Unit4.class)
public class MimeHeadersClassTest
implements MimeHeadersClassTests<MimeHeaders> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.soap.MimeHeaders]

    @Override
    public Class<MimeHeaders> createNewSUT() {
        return MimeHeaders.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.xml.soap.MimeHeaders#MimeHeaders() public
     * javax.xml.soap.MimeHeaders()}.
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
    public void create_MimeHeaders()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MimeHeaders sut = new MimeHeaders();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.soap.MimeHeaders]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.soap.MimeHeaders]

}
