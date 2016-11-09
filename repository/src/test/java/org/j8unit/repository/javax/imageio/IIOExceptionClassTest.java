package org.j8unit.repository.javax.imageio;

import javax.imageio.IIOException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IIOException} (by simply reusing the
 * J8Unit test interface {@link IIOExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class IIOExceptionClassTest
implements IIOExceptionClassTests<IIOException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.IIOException]

    @Override
    public Class<IIOException> createNewSUT() {
        return IIOException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.imageio.IIOException#IIOException(String)
     * public javax.imageio.IIOException(java.lang.String)}.
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
    public void create_IIOException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IIOException sut = null; // = new IIOException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.imageio.IIOException#IIOException(String, Throwable) public
     * javax.imageio.IIOException(java.lang.String,java.lang.Throwable)}.
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
    public void create_IIOException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IIOException sut = null; // = new IIOException(String, Throwable);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.IIOException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.IIOException]

}
