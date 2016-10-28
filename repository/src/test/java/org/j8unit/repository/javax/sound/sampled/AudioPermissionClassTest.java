package org.j8unit.repository.javax.sound.sampled;

import javax.sound.sampled.AudioPermission;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AudioPermissionClassTest
implements org.j8unit.repository.javax.sound.sampled.AudioPermissionClassTests<AudioPermission> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.AudioPermission]

    @Override
    public Class<AudioPermission> createNewSUT() {
        return AudioPermission.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link AudioPermission#AudioPermission(String) public
     * javax.sound.sampled.AudioPermission(java.lang.String)}.
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
    public void create_AudioPermission_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AudioPermission sut = null; // = new AudioPermission(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link AudioPermission#AudioPermission(String, String)
     * public javax.sound.sampled.AudioPermission(java.lang.String,java.lang.String)}.
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
    public void create_AudioPermission_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AudioPermission sut = null; // = new AudioPermission(String, String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.AudioPermission]

}
