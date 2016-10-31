package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SSLPeerUnverifiedException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLPeerUnverifiedExceptionClassTest
implements org.j8unit.repository.javax.net.ssl.SSLPeerUnverifiedExceptionClassTests<SSLPeerUnverifiedException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.SSLPeerUnverifiedException]

    @Override
    public Class<SSLPeerUnverifiedException> createNewSUT() {
        return SSLPeerUnverifiedException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.net.ssl.SSLPeerUnverifiedException#SSLPeerUnverifiedException(String) public
     * javax.net.ssl.SSLPeerUnverifiedException(java.lang.String)}.
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
    public void create_SSLPeerUnverifiedException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SSLPeerUnverifiedException sut = null; // = new SSLPeerUnverifiedException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.net.ssl.SSLPeerUnverifiedException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.SSLPeerUnverifiedException]

}
