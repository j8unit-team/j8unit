package org.j8unit.repository.javax.management.loading;

import java.net.URL;
import java.util.List;
import java.util.Map;
import javax.management.loading.MLetContent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MLetContentClassTest
implements org.j8unit.repository.javax.management.loading.MLetContentClassTests<MLetContent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.loading.MLetContent]

    @Override
    public Class<MLetContent> createNewSUT() {
        return MLetContent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link MLetContent#MLetContent(URL, Map, List, List)
     * public javax.management.loading.MLetContent(java.net.URL,java.util.Map<java.lang.String,
     * java.lang.String>,java.util.List<java.lang.String>,java.util.List<java.lang.String>)}.
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
    public void create_MLetContent_URL_Map_List_List()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MLetContent sut = null; // = new MLetContent(URL, Map, List, List);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.loading.MLetContent]

}
