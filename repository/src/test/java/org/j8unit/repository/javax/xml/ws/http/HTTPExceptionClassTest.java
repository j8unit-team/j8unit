package org.j8unit.repository.javax.xml.ws.http;

import javax.xml.ws.http.HTTPException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HTTPExceptionClassTest
implements org.j8unit.repository.javax.xml.ws.http.HTTPExceptionClassTests<HTTPException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.http.HTTPException]

    @Override
    public Class<HTTPException> createNewSUT() {
        return HTTPException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.ws.http.HTTPException#HTTPException(int) public javax.xml.ws.http.HTTPException(int)}.
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
    public void create_HTTPException_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final HTTPException sut = null; // = new HTTPException(int);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.http.HTTPException]

}
