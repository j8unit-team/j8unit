package org.j8unit.repository.org.xml.sax.helpers;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.xml.sax.AttributeList;
import org.xml.sax.helpers.AttributeListImpl;

@RunWith(J8Unit4.class)
public class AttributeListImplClassTest
implements org.j8unit.repository.org.xml.sax.helpers.AttributeListImplClassTests<AttributeListImpl> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.helpers.AttributeListImpl]

    @Override
    public Class<AttributeListImpl> createNewSUT() {
        return AttributeListImpl.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link AttributeListImpl#AttributeListImpl() public
     * org.xml.sax.helpers.AttributeListImpl()}.
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
    public void create_AttributeListImpl()
    throws Exception {
        // create new instance
        final AttributeListImpl sut = new AttributeListImpl();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link AttributeListImpl#AttributeListImpl(AttributeList) public
     * org.xml.sax.helpers.AttributeListImpl(org.xml.sax.AttributeList)}.
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
    public void create_AttributeListImpl_AttributeList()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AttributeListImpl sut = null; // = new AttributeListImpl(AttributeList);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.helpers.AttributeListImpl]

}
