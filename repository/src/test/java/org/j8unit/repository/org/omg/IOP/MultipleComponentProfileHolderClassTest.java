package org.j8unit.repository.org.omg.IOP;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.IOP.MultipleComponentProfileHolder;
import org.omg.IOP.TaggedComponent;

@RunWith(J8Unit4.class)
public class MultipleComponentProfileHolderClassTest
implements org.j8unit.repository.org.omg.IOP.MultipleComponentProfileHolderClassTests<MultipleComponentProfileHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.IOP.MultipleComponentProfileHolder]

    @Override
    public Class<MultipleComponentProfileHolder> createNewSUT() {
        return MultipleComponentProfileHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link MultipleComponentProfileHolder#MultipleComponentProfileHolder() public
     * org.omg.IOP.MultipleComponentProfileHolder()}.
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
    public void create_MultipleComponentProfileHolder()
    throws Exception {
        // create new instance
        final MultipleComponentProfileHolder sut = new MultipleComponentProfileHolder();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link MultipleComponentProfileHolder#MultipleComponentProfileHolder(TaggedComponent[]) public
     * org.omg.IOP.MultipleComponentProfileHolder(org.omg.IOP.TaggedComponent[])}.
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
    public void create_MultipleComponentProfileHolder_TaggedComponentArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MultipleComponentProfileHolder sut = null; // = new MultipleComponentProfileHolder(TaggedComponent[]);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.IOP.MultipleComponentProfileHolder]

}
