package org.j8unit.repository.java.awt.color;

import java.awt.color.ProfileDataException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ProfileDataException} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.color.ProfileDataExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class ProfileDataExceptionClassTest
implements ProfileDataExceptionClassTests<ProfileDataException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.color.ProfileDataException]

    @Override
    public Class<ProfileDataException> createNewSUT() {
        return ProfileDataException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.color.ProfileDataException#ProfileDataException(String) public
     * java.awt.color.ProfileDataException(java.lang.String)}.
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
    public void create_ProfileDataException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ProfileDataException sut = null; // = new ProfileDataException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.color.ProfileDataException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.color.ProfileDataException]

}
