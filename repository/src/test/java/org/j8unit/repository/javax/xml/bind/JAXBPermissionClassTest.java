package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.JAXBPermission;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JAXBPermissionClassTest
implements org.j8unit.repository.javax.xml.bind.JAXBPermissionClassTests<JAXBPermission> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.JAXBPermission]

    @Override
    public Class<JAXBPermission> createNewSUT() {
        return JAXBPermission.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link JAXBPermission#JAXBPermission(String) public
     * javax.xml.bind.JAXBPermission(java.lang.String)}.
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
    public void create_JAXBPermission_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JAXBPermission sut = null; // = new JAXBPermission(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.JAXBPermission]

}
