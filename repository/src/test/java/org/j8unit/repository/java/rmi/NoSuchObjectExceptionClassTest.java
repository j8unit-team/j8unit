package org.j8unit.repository.java.rmi;

import java.rmi.NoSuchObjectException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoSuchObjectExceptionClassTest
implements org.j8unit.repository.java.rmi.NoSuchObjectExceptionClassTests<NoSuchObjectException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.NoSuchObjectException]

    @Override
    public Class<NoSuchObjectException> createNewSUT() {
        return NoSuchObjectException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link NoSuchObjectException#NoSuchObjectException(String) public
     * java.rmi.NoSuchObjectException(java.lang.String)}.
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
    public void create_NoSuchObjectException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NoSuchObjectException sut = null; // = new NoSuchObjectException(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.NoSuchObjectException]

}
