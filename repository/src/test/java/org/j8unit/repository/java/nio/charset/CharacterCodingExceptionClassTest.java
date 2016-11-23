package org.j8unit.repository.java.nio.charset;

import java.nio.charset.CharacterCodingException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CharacterCodingException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.nio.charset.CharacterCodingExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class CharacterCodingExceptionClassTest
implements CharacterCodingExceptionClassTests<CharacterCodingException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.charset.CharacterCodingException]

    @Override
    public Class<CharacterCodingException> createNewSUT() {
        return CharacterCodingException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.nio.charset.CharacterCodingException#CharacterCodingException() public
     * java.nio.charset.CharacterCodingException()}.
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
    public void create_CharacterCodingException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CharacterCodingException sut = new CharacterCodingException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.charset.CharacterCodingException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.charset.CharacterCodingException]

}
