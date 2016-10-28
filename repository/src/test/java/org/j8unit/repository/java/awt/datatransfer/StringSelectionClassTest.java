package org.j8unit.repository.java.awt.datatransfer;

import java.awt.datatransfer.StringSelection;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StringSelectionClassTest
implements org.j8unit.repository.java.awt.datatransfer.StringSelectionClassTests<StringSelection> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.datatransfer.StringSelection]

    @Override
    public Class<StringSelection> createNewSUT() {
        return StringSelection.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.datatransfer.StringSelection#StringSelection(String) public
     * java.awt.datatransfer.StringSelection(java.lang.String)}.
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
    public void create_StringSelection_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StringSelection sut = null; // = new StringSelection(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.datatransfer.StringSelection]

}
