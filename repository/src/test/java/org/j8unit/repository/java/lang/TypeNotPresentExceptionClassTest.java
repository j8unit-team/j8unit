package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TypeNotPresentExceptionClassTest
implements org.j8unit.repository.java.lang.TypeNotPresentExceptionClassTests<TypeNotPresentException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.TypeNotPresentException]

    @Override
    public Class<TypeNotPresentException> createNewSUT() {
        return TypeNotPresentException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link TypeNotPresentException#TypeNotPresentException(String, Throwable) public
     * java.lang.TypeNotPresentException(java.lang.String,java.lang.Throwable)}.
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
    public void create_TypeNotPresentException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TypeNotPresentException sut = null; // = new TypeNotPresentException(String, Throwable);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.TypeNotPresentException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.TypeNotPresentException]

}
