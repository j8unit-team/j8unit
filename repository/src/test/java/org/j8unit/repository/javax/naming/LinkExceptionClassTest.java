package org.j8unit.repository.javax.naming;

import javax.naming.LinkException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LinkExceptionClassTest
implements org.j8unit.repository.javax.naming.LinkExceptionClassTests<LinkException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.LinkException]

    @Override
    public Class<LinkException> createNewSUT() {
        return LinkException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link LinkException#LinkException(String) public
     * javax.naming.LinkException(java.lang.String)}.
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
    public void create_LinkException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LinkException sut = null; // = new LinkException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link LinkException#LinkException() public
     * javax.naming.LinkException()}.
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
    public void create_LinkException()
    throws Exception {
        // create new instance
        final LinkException sut = new LinkException();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.LinkException]

}
