package org.j8unit.repository.org.omg.IOP;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.IOP.TaggedProfileHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TaggedProfileHolder} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.IOP.TaggedProfileHolderClassTests}).
 */

@RunWith(J8Unit4.class)
public class TaggedProfileHolderClassTest
implements TaggedProfileHolderClassTests<TaggedProfileHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.IOP.TaggedProfileHolder]

    @Override
    public Class<TaggedProfileHolder> createNewSUT() {
        return TaggedProfileHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.IOP.TaggedProfileHolder#TaggedProfileHolder(org.omg.IOP.TaggedProfile) public
     * org.omg.IOP.TaggedProfileHolder(org.omg.IOP.TaggedProfile)}.
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
    public void create_TaggedProfileHolder_TaggedProfile()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TaggedProfileHolder sut = null; // = new TaggedProfileHolder(org.omg.IOP.TaggedProfile);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.IOP.TaggedProfileHolder#TaggedProfileHolder() public org.omg.IOP.TaggedProfileHolder()}.
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
    public void create_TaggedProfileHolder()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TaggedProfileHolder sut = new TaggedProfileHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.IOP.TaggedProfileHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.IOP.TaggedProfileHolder]

}
