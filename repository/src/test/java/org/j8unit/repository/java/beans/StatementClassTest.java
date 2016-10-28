package org.j8unit.repository.java.beans;

import java.beans.Statement;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StatementClassTest
implements org.j8unit.repository.java.beans.StatementClassTests<Statement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.Statement]

    @Override
    public Class<Statement> createNewSUT() {
        return Statement.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link Statement#Statement(Object, String, Object[])
     * public java.beans.Statement(java.lang.Object,java.lang.String,java.lang.Object[])}.
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
    public void create_Statement_Object_String_ObjectArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Statement sut = null; // = new Statement(Object, String, Object[]);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.Statement]

}
