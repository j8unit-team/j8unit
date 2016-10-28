package org.j8unit.repository.java.awt.event;

import java.awt.event.ItemEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ItemEventClassTest
implements org.j8unit.repository.java.awt.event.ItemEventClassTests<ItemEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.event.ItemEvent]

    @Override
    public Class<ItemEvent> createNewSUT() {
        return ItemEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.event.ItemEvent#ItemEvent(java.awt.ItemSelectable, int, Object, int) public
     * java.awt.event.ItemEvent(java.awt.ItemSelectable,int,java.lang.Object,int)}.
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
    public void create_ItemEvent_ItemSelectable_int_Object_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ItemEvent sut = null; // = new ItemEvent(java.awt.ItemSelectable, int, Object, int);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.event.ItemEvent]

}
