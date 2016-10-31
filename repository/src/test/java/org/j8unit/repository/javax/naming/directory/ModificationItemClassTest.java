package org.j8unit.repository.javax.naming.directory;

import javax.naming.directory.ModificationItem;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ModificationItemClassTest
implements org.j8unit.repository.javax.naming.directory.ModificationItemClassTests<ModificationItem> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.directory.ModificationItem]

    @Override
    public Class<ModificationItem> createNewSUT() {
        return ModificationItem.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.directory.ModificationItem#ModificationItem(int, javax.naming.directory.Attribute) public
     * javax.naming.directory.ModificationItem(int,javax.naming.directory.Attribute)}.
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
    public void create_ModificationItem_int_Attribute()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ModificationItem sut = null; // = new ModificationItem(int, javax.naming.directory.Attribute);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.directory.ModificationItem]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.directory.ModificationItem]

}
