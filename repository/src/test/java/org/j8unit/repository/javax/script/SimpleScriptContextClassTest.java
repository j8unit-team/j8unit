package org.j8unit.repository.javax.script;

import javax.script.SimpleScriptContext;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SimpleScriptContextClassTest
implements org.j8unit.repository.javax.script.SimpleScriptContextClassTests<SimpleScriptContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.script.SimpleScriptContext]

    @Override
    public Class<SimpleScriptContext> createNewSUT() {
        return SimpleScriptContext.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link SimpleScriptContext#SimpleScriptContext()
     * public javax.script.SimpleScriptContext()}.
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
    public void create_SimpleScriptContext()
    throws Exception {
        // create new instance
        final SimpleScriptContext sut = new SimpleScriptContext();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.script.SimpleScriptContext]

}
