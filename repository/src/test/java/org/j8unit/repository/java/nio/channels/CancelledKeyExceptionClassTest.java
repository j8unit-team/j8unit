package org.j8unit.repository.java.nio.channels;

import java.nio.channels.CancelledKeyException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CancelledKeyExceptionClassTest
implements org.j8unit.repository.java.nio.channels.CancelledKeyExceptionClassTests<CancelledKeyException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.CancelledKeyException]

    @Override
    public Class<CancelledKeyException> createNewSUT() {
        return CancelledKeyException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.nio.channels.CancelledKeyException#CancelledKeyException() public
     * java.nio.channels.CancelledKeyException()}.
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
    public void create_CancelledKeyException()
    throws Exception {
        // create new instance
        final CancelledKeyException sut = new CancelledKeyException();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.CancelledKeyException]

}
