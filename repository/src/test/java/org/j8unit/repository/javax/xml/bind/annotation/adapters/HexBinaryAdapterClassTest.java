package org.j8unit.repository.javax.xml.bind.annotation.adapters;

import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HexBinaryAdapter} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.annotation.adapters.HexBinaryAdapterClassTests}).
 */
@RunWith(J8Unit4.class)
public class HexBinaryAdapterClassTest
implements HexBinaryAdapterClassTests<HexBinaryAdapter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.adapters.HexBinaryAdapter]

    @Override
    public Class<HexBinaryAdapter> createNewSUT() {
        return HexBinaryAdapter.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.bind.annotation.adapters.HexBinaryAdapter#HexBinaryAdapter() public
     * javax.xml.bind.annotation.adapters.HexBinaryAdapter()}.
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
    public void create_HexBinaryAdapter()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final HexBinaryAdapter sut = new HexBinaryAdapter();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.adapters.HexBinaryAdapter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.adapters.HexBinaryAdapter]

}
