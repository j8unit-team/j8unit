package org.j8unit.repository.org.xml.sax.ext;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.xml.sax.ext.Locator2Impl;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Locator2Impl} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.xml.sax.ext.Locator2ImplClassTests}).
 */

@RunWith(J8Unit4.class)
public class Locator2ImplClassTest
implements Locator2ImplClassTests<Locator2Impl> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.ext.Locator2Impl]

    @Override
    public Class<Locator2Impl> createNewSUT() {
        return Locator2Impl.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.xml.sax.ext.Locator2Impl#Locator2Impl()
     * public org.xml.sax.ext.Locator2Impl()}.
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
    public void create_Locator2Impl()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Locator2Impl sut = new Locator2Impl();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.xml.sax.ext.Locator2Impl#Locator2Impl(org.xml.sax.Locator) public
     * org.xml.sax.ext.Locator2Impl(org.xml.sax.Locator)}.
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
    public void create_Locator2Impl_Locator()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Locator2Impl sut = null; // = new Locator2Impl(org.xml.sax.Locator);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.xml.sax.ext.Locator2Impl]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.ext.Locator2Impl]

}
