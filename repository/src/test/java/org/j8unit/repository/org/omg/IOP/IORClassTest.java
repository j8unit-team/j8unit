package org.j8unit.repository.org.omg.IOP;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.IOP.IOR;
import org.omg.IOP.TaggedProfile;

@RunWith(J8Unit4.class)
public class IORClassTest
implements org.j8unit.repository.org.omg.IOP.IORClassTests<IOR> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.IOP.IOR]

    @Override
    public Class<IOR> createNewSUT() {
        return IOR.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link IOR#IOR() public org.omg.IOP.IOR()}.
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
    public void create_IOR()
    throws Exception {
        // create new instance
        final IOR sut = new IOR();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link IOR#IOR(String, TaggedProfile[]) public
     * org.omg.IOP.IOR(java.lang.String,org.omg.IOP.TaggedProfile[])}.
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
    public void create_IOR_String_TaggedProfileArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IOR sut = null; // = new IOR(String, TaggedProfile[]);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.IOP.IOR]

}
