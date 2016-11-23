package org.j8unit.repository.javax.activation;

import javax.activation.MimeTypeParameterList;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MimeTypeParameterList} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.activation.MimeTypeParameterListClassTests}).
 */

@RunWith(J8Unit4.class)
public class MimeTypeParameterListClassTest
implements MimeTypeParameterListClassTests<MimeTypeParameterList> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.activation.MimeTypeParameterList]

    @Override
    public Class<MimeTypeParameterList> createNewSUT() {
        return MimeTypeParameterList.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.activation.MimeTypeParameterList#MimeTypeParameterList() public
     * javax.activation.MimeTypeParameterList()}.
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
    public void create_MimeTypeParameterList()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MimeTypeParameterList sut = new MimeTypeParameterList();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.activation.MimeTypeParameterList#MimeTypeParameterList(String) public
     * javax.activation.MimeTypeParameterList(java.lang.String) throws javax.activation.MimeTypeParseException}.
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
    public void create_MimeTypeParameterList_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MimeTypeParameterList sut = null; // = new MimeTypeParameterList(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.activation.MimeTypeParameterList]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.activation.MimeTypeParameterList]

}
