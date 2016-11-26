package org.j8unit.repository.javax.lang.model.element;

import javax.lang.model.element.UnknownAnnotationValueException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UnknownAnnotationValueException} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.lang.model.element.UnknownAnnotationValueExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class UnknownAnnotationValueExceptionClassTest
implements UnknownAnnotationValueExceptionClassTests<UnknownAnnotationValueException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.element.UnknownAnnotationValueException]

    @Override
    public Class<UnknownAnnotationValueException> createNewSUT() {
        return UnknownAnnotationValueException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.lang.model.element.UnknownAnnotationValueException#UnknownAnnotationValueException(javax.lang.model.element.AnnotationValue, Object)
     * public
     * javax.lang.model.element.UnknownAnnotationValueException(javax.lang.model.element.AnnotationValue,java.lang.Object)}.
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
    public void create_UnknownAnnotationValueException_AnnotationValue_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnknownAnnotationValueException sut = null; // = new
                                                          // UnknownAnnotationValueException(javax.lang.model.element.AnnotationValue,
                                                          // Object);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.element.UnknownAnnotationValueException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.element.UnknownAnnotationValueException]

}
