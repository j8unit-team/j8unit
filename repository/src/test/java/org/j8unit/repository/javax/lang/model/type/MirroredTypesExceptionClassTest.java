package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.MirroredTypesException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MirroredTypesExceptionClassTest
implements org.j8unit.repository.javax.lang.model.type.MirroredTypesExceptionClassTests<MirroredTypesException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.type.MirroredTypesException]

    @Override
    public Class<MirroredTypesException> createNewSUT() {
        return MirroredTypesException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.lang.model.type.MirroredTypesException#MirroredTypesException(java.util.List) public
     * javax.lang.model.type.MirroredTypesException(java.util.List<? extends javax.lang.model.type.TypeMirror>)}.
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
    public void create_MirroredTypesException_List()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MirroredTypesException sut = null; // = new MirroredTypesException(java.util.List);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.type.MirroredTypesException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.type.MirroredTypesException]

}
