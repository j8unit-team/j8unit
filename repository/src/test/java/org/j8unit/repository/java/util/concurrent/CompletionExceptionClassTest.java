package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.CompletionException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompletionExceptionClassTest
implements org.j8unit.repository.java.util.concurrent.CompletionExceptionClassTests<CompletionException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.CompletionException]

    @Override
    public Class<CompletionException> createNewSUT() {
        return CompletionException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.CompletionException#CompletionException(Throwable) public
     * java.util.concurrent.CompletionException(java.lang.Throwable)}.
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
    public void create_CompletionException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CompletionException sut = null; // = new CompletionException(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.CompletionException#CompletionException(String, Throwable) public
     * java.util.concurrent.CompletionException(java.lang.String,java.lang.Throwable)}.
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
    public void create_CompletionException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CompletionException sut = null; // = new CompletionException(String, Throwable);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.CompletionException]

}
