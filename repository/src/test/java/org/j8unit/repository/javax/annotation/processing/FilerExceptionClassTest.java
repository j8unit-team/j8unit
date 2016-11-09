package org.j8unit.repository.javax.annotation.processing;

import javax.annotation.processing.FilerException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FilerException} (by simply reusing the
 * J8Unit test interface {@link FilerExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class FilerExceptionClassTest
implements FilerExceptionClassTests<FilerException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.annotation.processing.FilerException]

    @Override
    public Class<FilerException> createNewSUT() {
        return FilerException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.annotation.processing.FilerException#FilerException(String) public
     * javax.annotation.processing.FilerException(java.lang.String)}.
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
    public void create_FilerException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FilerException sut = null; // = new FilerException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.annotation.processing.FilerException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.annotation.processing.FilerException]

}
