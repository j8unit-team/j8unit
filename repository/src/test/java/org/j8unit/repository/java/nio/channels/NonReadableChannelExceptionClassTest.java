package org.j8unit.repository.java.nio.channels;

import java.nio.channels.NonReadableChannelException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NonReadableChannelExceptionClassTest
implements org.j8unit.repository.java.nio.channels.NonReadableChannelExceptionClassTests<NonReadableChannelException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.NonReadableChannelException]

    @Override
    public Class<NonReadableChannelException> createNewSUT() {
        return NonReadableChannelException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link NonReadableChannelException#NonReadableChannelException() public
     * java.nio.channels.NonReadableChannelException()}.
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
    public void create_NonReadableChannelException()
    throws Exception {
        // create new instance
        final NonReadableChannelException sut = new NonReadableChannelException();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.NonReadableChannelException]

}
