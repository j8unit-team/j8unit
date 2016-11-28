package org.j8unit.repository.org.xml.sax.ext;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.xml.sax.ext.Attributes2Impl;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Attributes2Impl} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.xml.sax.ext.Attributes2ImplClassTests}).
 */
@RunWith(J8Unit4.class)
public class Attributes2ImplClassTest
implements Attributes2ImplClassTests<Attributes2Impl> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.ext.Attributes2Impl]

    @Override
    public Class<Attributes2Impl> createNewSUT() {
        return Attributes2Impl.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.xml.sax.ext.Attributes2Impl#Attributes2Impl() public org.xml.sax.ext.Attributes2Impl()}.
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
    public void create_Attributes2Impl()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Attributes2Impl sut = new Attributes2Impl();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.xml.sax.ext.Attributes2Impl#Attributes2Impl(org.xml.sax.Attributes) public
     * org.xml.sax.ext.Attributes2Impl(org.xml.sax.Attributes)}.
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
    public void create_Attributes2Impl_Attributes()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Attributes2Impl sut = null; // = new Attributes2Impl(org.xml.sax.Attributes);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.xml.sax.ext.Attributes2Impl]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.ext.Attributes2Impl]

}
