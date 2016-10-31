package org.j8unit.repository.javax.swing.text;

import javax.swing.text.DefaultCaret;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultCaretClassTest
implements org.j8unit.repository.javax.swing.text.DefaultCaretClassTests<DefaultCaret> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.DefaultCaret]

    @Override
    public Class<DefaultCaret> createNewSUT() {
        return DefaultCaret.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.text.DefaultCaret#DefaultCaret()
     * public javax.swing.text.DefaultCaret()}.
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
    public void create_DefaultCaret()
    throws Exception {
        // create new instance
        final DefaultCaret sut = new DefaultCaret();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.DefaultCaret]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.DefaultCaret]

}
