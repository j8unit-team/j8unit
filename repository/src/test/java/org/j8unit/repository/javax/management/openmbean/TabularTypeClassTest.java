package org.j8unit.repository.javax.management.openmbean;

import javax.management.openmbean.CompositeType;
import javax.management.openmbean.TabularType;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TabularTypeClassTest
implements org.j8unit.repository.javax.management.openmbean.TabularTypeClassTests<TabularType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.openmbean.TabularType]

    @Override
    public Class<TabularType> createNewSUT() {
        return TabularType.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link TabularType#TabularType(String, String, CompositeType, String[]) public
     * javax.management.openmbean.TabularType(java.lang.String,java.lang.String,javax.management.openmbean.CompositeType,java.lang.String[])
     * throws javax.management.openmbean.OpenDataException}.
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
    public void create_TabularType_String_String_CompositeType_StringArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TabularType sut = null; // = new TabularType(String, String, CompositeType, String[]);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.openmbean.TabularType]

}
