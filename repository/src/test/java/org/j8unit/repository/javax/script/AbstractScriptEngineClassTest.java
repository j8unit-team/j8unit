package org.j8unit.repository.javax.script;

import static org.junit.Assert.fail;
import javax.script.AbstractScriptEngine;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AbstractScriptEngine} (by simply reusing
 * the J8Unit test interface {@link AbstractScriptEngineClassTests}).
 */

@RunWith(J8Unit4.class)
public class AbstractScriptEngineClassTest
implements AbstractScriptEngineClassTests<AbstractScriptEngine> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.script.AbstractScriptEngine]

    @Override
    public Class<AbstractScriptEngine> createNewSUT() {
        return AbstractScriptEngine.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.script.AbstractScriptEngine#AbstractScriptEngine() public javax.script.AbstractScriptEngine()}.
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
    public void create_AbstractScriptEngine()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.script.AbstractScriptEngine#AbstractScriptEngine(javax.script.Bindings) public
     * javax.script.AbstractScriptEngine(javax.script.Bindings)}.
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
    public void create_AbstractScriptEngine_Bindings()
    throws Exception {
        Assert.fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.script.AbstractScriptEngine]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.script.AbstractScriptEngine]

}
