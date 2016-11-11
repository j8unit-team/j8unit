package org.j8unit.repository.java.lang.annotation;

import java.lang.annotation.IncompleteAnnotationException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IncompleteAnnotationException} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.lang.annotation.IncompleteAnnotationExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class IncompleteAnnotationExceptionClassTest
implements IncompleteAnnotationExceptionClassTests<IncompleteAnnotationException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.annotation.IncompleteAnnotationException]

    @Override
    public Class<IncompleteAnnotationException> createNewSUT() {
        return IncompleteAnnotationException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.lang.annotation.IncompleteAnnotationException#IncompleteAnnotationException(Class, String) public
     * java.lang.annotation.IncompleteAnnotationException(java.lang.Class<? extends
     * java.lang.annotation.Annotation>,java.lang.String)}.
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
    public void create_IncompleteAnnotationException_Class_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IncompleteAnnotationException sut = null; // = new IncompleteAnnotationException(Class, String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.annotation.IncompleteAnnotationException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.annotation.IncompleteAnnotationException]

}
