package org.j8unit.repository.javax.script;

import javax.script.ScriptEngineManager;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ScriptEngineManagerClassTest
implements org.j8unit.repository.javax.script.ScriptEngineManagerClassTests<ScriptEngineManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.script.ScriptEngineManager]

    @Override
    public Class<ScriptEngineManager> createNewSUT() {
        return ScriptEngineManager.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.script.ScriptEngineManager#ScriptEngineManager() public javax.script.ScriptEngineManager()}.
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
    public void create_ScriptEngineManager()
    throws Exception {
        // create new instance
        final ScriptEngineManager sut = new ScriptEngineManager();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.script.ScriptEngineManager#ScriptEngineManager(ClassLoader) public
     * javax.script.ScriptEngineManager(java.lang.ClassLoader)}.
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
    public void create_ScriptEngineManager_ClassLoader()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ScriptEngineManager sut = null; // = new ScriptEngineManager(ClassLoader);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.script.ScriptEngineManager]

}
