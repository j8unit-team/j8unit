package org.j8unit.repository.javax.swing.text.rtf;

import javax.swing.text.rtf.RTFEditorKit;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RTFEditorKit} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.rtf.RTFEditorKitClassTests}).
 */

@RunWith(J8Unit4.class)
public class RTFEditorKitClassTest
implements RTFEditorKitClassTests<RTFEditorKit> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.rtf.RTFEditorKit]

    @Override
    public Class<RTFEditorKit> createNewSUT() {
        return RTFEditorKit.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.rtf.RTFEditorKit#RTFEditorKit() public javax.swing.text.rtf.RTFEditorKit()}.
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
    public void create_RTFEditorKit()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RTFEditorKit sut = new RTFEditorKit();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.rtf.RTFEditorKit]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.rtf.RTFEditorKit]

}
