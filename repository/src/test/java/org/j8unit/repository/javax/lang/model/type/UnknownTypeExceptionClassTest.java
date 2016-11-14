package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.UnknownTypeException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UnknownTypeException} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.lang.model.type.UnknownTypeExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class UnknownTypeExceptionClassTest
implements UnknownTypeExceptionClassTests<UnknownTypeException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.type.UnknownTypeException]

    @Override
    public Class<UnknownTypeException> createNewSUT() {
        return UnknownTypeException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.lang.model.type.UnknownTypeException#UnknownTypeException(javax.lang.model.type.TypeMirror, Object)
     * public javax.lang.model.type.UnknownTypeException(javax.lang.model.type.TypeMirror,java.lang.Object)}.
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
    public void create_UnknownTypeException_TypeMirror_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnknownTypeException sut = null; // = new UnknownTypeException(javax.lang.model.type.TypeMirror, Object);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.type.UnknownTypeException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.type.UnknownTypeException]

}
