package org.j8unit.repository.javax.xml.bind.annotation.adapters;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlJavaTypeAdapterClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.adapters.XmlJavaTypeAdapterClassTests<XmlJavaTypeAdapter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter]

    @Override
    public Class<XmlJavaTypeAdapter> createNewSUT() {
        return XmlJavaTypeAdapter.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter]

    @RunWith(J8Unit4.class)
    public static class DEFAULTClassTest
    implements org.j8unit.repository.javax.xml.bind.annotation.adapters.XmlJavaTypeAdapterClassTests.DEFAULTClassTests<DEFAULT> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter$DEFAULT]

        @Override
        public Class<DEFAULT> createNewSUT() {
            return DEFAULT.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test {@link DEFAULT#DEFAULT() public
         * javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter$DEFAULT()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_DEFAULT()
        throws Exception {
            // create new instance
            final DEFAULT sut = new DEFAULT();
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter$DEFAULT]

    }

}
