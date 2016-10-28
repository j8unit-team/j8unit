package org.j8unit.repository.javax.swing;

import javax.swing.DefaultSingleSelectionModel;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultSingleSelectionModelClassTest
implements org.j8unit.repository.javax.swing.DefaultSingleSelectionModelClassTests<DefaultSingleSelectionModel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.DefaultSingleSelectionModel]

    @Override
    public Class<DefaultSingleSelectionModel> createNewSUT() {
        return DefaultSingleSelectionModel.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.DefaultSingleSelectionModel#DefaultSingleSelectionModel() public
     * javax.swing.DefaultSingleSelectionModel()}.
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
    public void create_DefaultSingleSelectionModel()
    throws Exception {
        // create new instance
        final DefaultSingleSelectionModel sut = new DefaultSingleSelectionModel();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.DefaultSingleSelectionModel]

}
