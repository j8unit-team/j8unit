package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.MirroredTypeException;
import javax.lang.model.type.TypeMirror;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MirroredTypeExceptionClassTest
implements org.j8unit.repository.javax.lang.model.type.MirroredTypeExceptionClassTests<MirroredTypeException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.type.MirroredTypeException]

    @Override
    public Class<MirroredTypeException> createNewSUT() {
        return MirroredTypeException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link MirroredTypeException#MirroredTypeException(TypeMirror) public
     * javax.lang.model.type.MirroredTypeException(javax.lang.model.type.TypeMirror)}.
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
    public void create_MirroredTypeException_TypeMirror()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MirroredTypeException sut = null; // = new MirroredTypeException(TypeMirror);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.type.MirroredTypeException]

}
