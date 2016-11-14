package org.j8unit.repository.javax.management;

import javax.management.BadBinaryOpValueExpException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BadBinaryOpValueExpException} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.BadBinaryOpValueExpExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class BadBinaryOpValueExpExceptionClassTest
implements BadBinaryOpValueExpExceptionClassTests<BadBinaryOpValueExpException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.BadBinaryOpValueExpException]

    @Override
    public Class<BadBinaryOpValueExpException> createNewSUT() {
        return BadBinaryOpValueExpException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.BadBinaryOpValueExpException#BadBinaryOpValueExpException(javax.management.ValueExp)
     * public javax.management.BadBinaryOpValueExpException(javax.management.ValueExp)}.
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
    public void create_BadBinaryOpValueExpException_ValueExp()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BadBinaryOpValueExpException sut = null; // = new BadBinaryOpValueExpException(javax.management.ValueExp);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.BadBinaryOpValueExpException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.BadBinaryOpValueExpException]

}
