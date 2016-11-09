package org.j8unit.repository.javax.swing.text;

import javax.swing.text.MaskFormatter;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MaskFormatter} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.MaskFormatterClassTests}).
 */

@RunWith(J8Unit4.class)
public class MaskFormatterClassTest
implements org.j8unit.repository.javax.swing.text.MaskFormatterClassTests<MaskFormatter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.MaskFormatter]

    @Override
    public Class<MaskFormatter> createNewSUT() {
        return MaskFormatter.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.text.MaskFormatter#MaskFormatter()
     * public javax.swing.text.MaskFormatter()}.
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
    public void create_MaskFormatter()
    throws Exception {
        // create new instance
        final MaskFormatter sut = new MaskFormatter();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.MaskFormatter#MaskFormatter(String) public
     * javax.swing.text.MaskFormatter(java.lang.String) throws java.text.ParseException}.
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
    public void create_MaskFormatter_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MaskFormatter sut = null; // = new MaskFormatter(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.MaskFormatter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.MaskFormatter]

}
