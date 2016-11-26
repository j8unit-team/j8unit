package org.j8unit.repository.javax.crypto;

import javax.crypto.AEADBadTagException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AEADBadTagException} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.crypto.AEADBadTagExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class AEADBadTagExceptionClassTest
implements AEADBadTagExceptionClassTests<AEADBadTagException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.AEADBadTagException]

    @Override
    public Class<AEADBadTagException> createNewSUT() {
        return AEADBadTagException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.AEADBadTagException#AEADBadTagException() public javax.crypto.AEADBadTagException()}.
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
    public void create_AEADBadTagException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AEADBadTagException sut = new AEADBadTagException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.AEADBadTagException#AEADBadTagException(String) public
     * javax.crypto.AEADBadTagException(java.lang.String)}.
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
    public void create_AEADBadTagException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AEADBadTagException sut = null; // = new AEADBadTagException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.crypto.AEADBadTagException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.AEADBadTagException]

}
