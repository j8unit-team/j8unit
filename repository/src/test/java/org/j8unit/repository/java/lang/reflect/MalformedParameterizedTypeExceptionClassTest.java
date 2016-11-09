package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.MalformedParameterizedTypeException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MalformedParameterizedTypeException} (by
 * simply reusing the J8Unit test interface {@link MalformedParameterizedTypeExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class MalformedParameterizedTypeExceptionClassTest
implements MalformedParameterizedTypeExceptionClassTests<MalformedParameterizedTypeException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.MalformedParameterizedTypeException]

    @Override
    public Class<MalformedParameterizedTypeException> createNewSUT() {
        return MalformedParameterizedTypeException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.lang.reflect.MalformedParameterizedTypeException#MalformedParameterizedTypeException() public
     * java.lang.reflect.MalformedParameterizedTypeException()}.
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
    public void create_MalformedParameterizedTypeException()
    throws Exception {
        // create new instance
        final MalformedParameterizedTypeException sut = new MalformedParameterizedTypeException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.reflect.MalformedParameterizedTypeException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.MalformedParameterizedTypeException]

}
