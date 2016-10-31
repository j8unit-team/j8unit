package org.j8unit.repository.javax.swing.table;

import javax.swing.table.JTableHeader;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JTableHeaderClassTest
implements org.j8unit.repository.javax.swing.table.JTableHeaderClassTests<JTableHeader> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.table.JTableHeader]

    @Override
    public Class<JTableHeader> createNewSUT() {
        return JTableHeader.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.table.JTableHeader#JTableHeader()
     * public javax.swing.table.JTableHeader()}.
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
    public void create_JTableHeader()
    throws Exception {
        // create new instance
        final JTableHeader sut = new JTableHeader();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.table.JTableHeader#JTableHeader(javax.swing.table.TableColumnModel) public
     * javax.swing.table.JTableHeader(javax.swing.table.TableColumnModel)}.
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
    public void create_JTableHeader_TableColumnModel()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JTableHeader sut = null; // = new JTableHeader(javax.swing.table.TableColumnModel);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.table.JTableHeader]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.table.JTableHeader]

}
