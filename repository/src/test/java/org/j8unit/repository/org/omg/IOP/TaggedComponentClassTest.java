package org.j8unit.repository.org.omg.IOP;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.IOP.TaggedComponent;

@RunWith(J8Unit4.class)
public class TaggedComponentClassTest
implements org.j8unit.repository.org.omg.IOP.TaggedComponentClassTests<TaggedComponent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.IOP.TaggedComponent]

    @Override
    public Class<TaggedComponent> createNewSUT() {
        return TaggedComponent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link TaggedComponent#TaggedComponent() public
     * org.omg.IOP.TaggedComponent()}.
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
    public void create_TaggedComponent()
    throws Exception {
        // create new instance
        final TaggedComponent sut = new TaggedComponent();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link TaggedComponent#TaggedComponent(int, byte[])
     * public org.omg.IOP.TaggedComponent(int,byte[])}.
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
    public void create_TaggedComponent_int_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TaggedComponent sut = null; // = new TaggedComponent(int, byte[]);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.IOP.TaggedComponent]

}
