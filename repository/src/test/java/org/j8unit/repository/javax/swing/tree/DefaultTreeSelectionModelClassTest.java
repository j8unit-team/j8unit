package org.j8unit.repository.javax.swing.tree;

import javax.swing.tree.DefaultTreeSelectionModel;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DefaultTreeSelectionModel} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.swing.tree.DefaultTreeSelectionModelClassTests}).
 */
@RunWith(J8Unit4.class)
public class DefaultTreeSelectionModelClassTest
implements DefaultTreeSelectionModelClassTests<DefaultTreeSelectionModel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.tree.DefaultTreeSelectionModel]

    @Override
    public Class<DefaultTreeSelectionModel> createNewSUT() {
        return DefaultTreeSelectionModel.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.tree.DefaultTreeSelectionModel#DefaultTreeSelectionModel() public
     * javax.swing.tree.DefaultTreeSelectionModel()}.
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
    public void create_DefaultTreeSelectionModel()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DefaultTreeSelectionModel sut = new DefaultTreeSelectionModel();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.tree.DefaultTreeSelectionModel]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.tree.DefaultTreeSelectionModel]

}
