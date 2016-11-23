package org.j8unit.repository.javax.xml.bind.annotation.adapters;

import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NormalizedStringAdapter} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.xml.bind.annotation.adapters.NormalizedStringAdapterClassTests}).
 */

@RunWith(J8Unit4.class)
public class NormalizedStringAdapterClassTest
implements NormalizedStringAdapterClassTests<NormalizedStringAdapter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.adapters.NormalizedStringAdapter]

    @Override
    public Class<NormalizedStringAdapter> createNewSUT() {
        return NormalizedStringAdapter.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.bind.annotation.adapters.NormalizedStringAdapter#NormalizedStringAdapter() public
     * javax.xml.bind.annotation.adapters.NormalizedStringAdapter()}.
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
    public void create_NormalizedStringAdapter()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NormalizedStringAdapter sut = new NormalizedStringAdapter();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.adapters.NormalizedStringAdapter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.adapters.NormalizedStringAdapter]

}
