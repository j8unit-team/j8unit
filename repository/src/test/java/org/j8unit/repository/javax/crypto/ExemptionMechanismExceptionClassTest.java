package org.j8unit.repository.javax.crypto;

import javax.crypto.ExemptionMechanismException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ExemptionMechanismException} (by simply
 * reusing the J8Unit test interface {@link ExemptionMechanismExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class ExemptionMechanismExceptionClassTest
implements ExemptionMechanismExceptionClassTests<ExemptionMechanismException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.ExemptionMechanismException]

    @Override
    public Class<ExemptionMechanismException> createNewSUT() {
        return ExemptionMechanismException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.ExemptionMechanismException#ExemptionMechanismException() public
     * javax.crypto.ExemptionMechanismException()}.
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
    public void create_ExemptionMechanismException()
    throws Exception {
        // create new instance
        final ExemptionMechanismException sut = new ExemptionMechanismException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.ExemptionMechanismException#ExemptionMechanismException(String) public
     * javax.crypto.ExemptionMechanismException(java.lang.String)}.
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
    public void create_ExemptionMechanismException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ExemptionMechanismException sut = null; // = new ExemptionMechanismException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.crypto.ExemptionMechanismException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.ExemptionMechanismException]

}
