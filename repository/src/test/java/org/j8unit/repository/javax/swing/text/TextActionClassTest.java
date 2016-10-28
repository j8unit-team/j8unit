package org.j8unit.repository.javax.swing.text;

import static org.junit.Assert.fail;
import javax.swing.Action;
import javax.swing.text.TextAction;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TextActionClassTest
implements org.j8unit.repository.javax.swing.text.TextActionClassTests<TextAction> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.TextAction]

    @Override
    public Class<TextAction> createNewSUT() {
        return TextAction.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link TextAction#TextAction(String) public
     * javax.swing.text.TextAction(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_TextAction_String()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link TextAction#augmentList(Action[], Action[]) public
     * static final javax.swing.Action[]
     * javax.swing.text.TextAction.augmentList(javax.swing.Action[],javax.swing.Action[])}.
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
    public void test_augmentList_ActionArray_ActionArray()
    throws Exception {
        // write some test for {@link TextAction#augmentList(Action[], Action[])}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.TextAction]

}
