package org.j8unit.repository.java.beans;

import java.beans.DefaultPersistenceDelegate;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultPersistenceDelegateClassTest
implements org.j8unit.repository.java.beans.DefaultPersistenceDelegateClassTests<DefaultPersistenceDelegate> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.DefaultPersistenceDelegate]

    @Override
    public Class<DefaultPersistenceDelegate> createNewSUT() {
        return DefaultPersistenceDelegate.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.beans.DefaultPersistenceDelegate#DefaultPersistenceDelegate() public
     * java.beans.DefaultPersistenceDelegate()}.
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
    public void create_DefaultPersistenceDelegate()
    throws Exception {
        // create new instance
        final DefaultPersistenceDelegate sut = new DefaultPersistenceDelegate();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.beans.DefaultPersistenceDelegate#DefaultPersistenceDelegate(String[]) public
     * java.beans.DefaultPersistenceDelegate(java.lang.String[])}.
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
    public void create_DefaultPersistenceDelegate_StringArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DefaultPersistenceDelegate sut = null; // = new DefaultPersistenceDelegate(String[]);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.DefaultPersistenceDelegate]

}
