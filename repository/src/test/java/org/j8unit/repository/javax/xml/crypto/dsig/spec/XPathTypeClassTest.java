package org.j8unit.repository.javax.xml.crypto.dsig.spec;

import javax.xml.crypto.dsig.spec.XPathType;
import javax.xml.crypto.dsig.spec.XPathType.Filter;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XPathTypeClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.spec.XPathTypeClassTests<XPathType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.spec.XPathType]

    @Override
    public Class<XPathType> createNewSUT() {
        return XPathType.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.crypto.dsig.spec.XPathType#XPathType(String, javax.xml.crypto.dsig.spec.XPathType.Filter, java.util.Map)
     * public
     * javax.xml.crypto.dsig.spec.XPathType(java.lang.String,javax.xml.crypto.dsig.spec.XPathType$Filter,java.util.Map)}.
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
    public void create_XPathType_String_Filter_Map()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final XPathType sut = null; // = new XPathType(String, javax.xml.crypto.dsig.spec.XPathType.Filter,
                                    // java.util.Map);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.crypto.dsig.spec.XPathType#XPathType(String, javax.xml.crypto.dsig.spec.XPathType.Filter) public
     * javax.xml.crypto.dsig.spec.XPathType(java.lang.String,javax.xml.crypto.dsig.spec.XPathType$Filter)}.
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
    public void create_XPathType_String_Filter()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final XPathType sut = null; // = new XPathType(String, javax.xml.crypto.dsig.spec.XPathType.Filter);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.spec.XPathType]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.spec.XPathType]

    @RunWith(J8Unit4.class)
    public static class FilterClassTest
    implements org.j8unit.repository.javax.xml.crypto.dsig.spec.XPathTypeClassTests.FilterClassTests<Filter> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.spec.XPathType$Filter]

        @Override
        public Class<Filter> createNewSUT() {
            return Filter.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.spec.XPathType$Filter]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.spec.XPathType$Filter]

    }

}
