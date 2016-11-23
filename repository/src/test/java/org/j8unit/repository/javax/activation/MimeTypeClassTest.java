package org.j8unit.repository.javax.activation;

import javax.activation.MimeType;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MimeType} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.activation.MimeTypeClassTests}).
 */

@RunWith(J8Unit4.class)
public class MimeTypeClassTest
implements MimeTypeClassTests<MimeType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.activation.MimeType]

    @Override
    public Class<MimeType> createNewSUT() {
        return MimeType.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.activation.MimeType#MimeType() public
     * javax.activation.MimeType()}.
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
    public void create_MimeType()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MimeType sut = new MimeType();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.activation.MimeType#MimeType(String)
     * public javax.activation.MimeType(java.lang.String) throws javax.activation.MimeTypeParseException}.
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
    public void create_MimeType_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MimeType sut = null; // = new MimeType(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.activation.MimeType#MimeType(String, String) public
     * javax.activation.MimeType(java.lang.String,java.lang.String) throws javax.activation.MimeTypeParseException}.
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
    public void create_MimeType_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MimeType sut = null; // = new MimeType(String, String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.activation.MimeType]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.activation.MimeType]

}
