package org.j8unit.repository.javax.naming.spi;

import java.util.Hashtable;
import javax.naming.CannotProceedException;
import javax.naming.Context;
import javax.naming.Name;
import javax.naming.directory.Attributes;
import javax.naming.spi.DirectoryManager;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DirectoryManagerClassTest
implements org.j8unit.repository.javax.naming.spi.DirectoryManagerClassTests<DirectoryManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.spi.DirectoryManager]

    @Override
    public Class<DirectoryManager> createNewSUT() {
        return DirectoryManager.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link DirectoryManager#getObjectInstance(Object, Name, Context, Hashtable, Attributes) public static
     * java.lang.Object
     * javax.naming.spi.DirectoryManager.getObjectInstance(java.lang.Object,javax.naming.Name,javax.naming.Context,java.util.Hashtable<?,
     * ?>,javax.naming.directory.Attributes) throws java.lang.Exception}.
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
    public void test_getObjectInstance_Object_Name_Context_Hashtable_Attributes()
    throws Exception {
        // write some test for {@link DirectoryManager#getObjectInstance(Object, Name, Context, Hashtable, Attributes)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link DirectoryManager#getContinuationDirContext(CannotProceedException) public static
     * javax.naming.directory.DirContext
     * javax.naming.spi.DirectoryManager.getContinuationDirContext(javax.naming.CannotProceedException) throws
     * javax.naming.NamingException}.
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
    public void test_getContinuationDirContext_CannotProceedException()
    throws Exception {
        // write some test for {@link DirectoryManager#getContinuationDirContext(CannotProceedException)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link DirectoryManager#getStateToBind(Object, Name, Context, Hashtable, Attributes) public static
     * javax.naming.spi.DirStateFactory$Result
     * javax.naming.spi.DirectoryManager.getStateToBind(java.lang.Object,javax.naming.Name,javax.naming.Context,java.util.Hashtable<?,
     * ?>,javax.naming.directory.Attributes) throws javax.naming.NamingException}.
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
    public void test_getStateToBind_Object_Name_Context_Hashtable_Attributes()
    throws Exception {
        // write some test for {@link DirectoryManager#getStateToBind(Object, Name, Context, Hashtable, Attributes)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.spi.DirectoryManager]

}
