package org.j8unit.repository.java.lang.instrument;

import java.lang.instrument.UnmodifiableClassException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UnmodifiableClassException} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.lang.instrument.UnmodifiableClassExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class UnmodifiableClassExceptionClassTest
implements UnmodifiableClassExceptionClassTests<UnmodifiableClassException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.instrument.UnmodifiableClassException]

    @Override
    public Class<UnmodifiableClassException> createNewSUT() {
        return UnmodifiableClassException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.lang.instrument.UnmodifiableClassException#UnmodifiableClassException() public
     * java.lang.instrument.UnmodifiableClassException()}.
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
    public void create_UnmodifiableClassException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnmodifiableClassException sut = new UnmodifiableClassException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.lang.instrument.UnmodifiableClassException#UnmodifiableClassException(String) public
     * java.lang.instrument.UnmodifiableClassException(java.lang.String)}.
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
    public void create_UnmodifiableClassException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnmodifiableClassException sut = null; // = new UnmodifiableClassException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.instrument.UnmodifiableClassException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.instrument.UnmodifiableClassException]

}
