package org.j8unit.repository.org.omg.IOP;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.IOP.TaggedProfile;

@RunWith(J8Unit4.class)
public class TaggedProfileClassTest
implements org.j8unit.repository.org.omg.IOP.TaggedProfileClassTests<TaggedProfile> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.IOP.TaggedProfile]

    @Override
    public Class<TaggedProfile> createNewSUT() {
        return TaggedProfile.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.IOP.TaggedProfile#TaggedProfile()
     * public org.omg.IOP.TaggedProfile()}.
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
    public void create_TaggedProfile()
    throws Exception {
        // create new instance
        final TaggedProfile sut = new TaggedProfile();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.IOP.TaggedProfile#TaggedProfile(int, byte[]) public org.omg.IOP.TaggedProfile(int,byte[])}.
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
    public void create_TaggedProfile_int_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TaggedProfile sut = null; // = new TaggedProfile(int, byte[]);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.IOP.TaggedProfile]

}
