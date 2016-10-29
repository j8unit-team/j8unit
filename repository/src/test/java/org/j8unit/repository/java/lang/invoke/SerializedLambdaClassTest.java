package org.j8unit.repository.java.lang.invoke;

import java.lang.invoke.SerializedLambda;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SerializedLambdaClassTest
implements org.j8unit.repository.java.lang.invoke.SerializedLambdaClassTests<SerializedLambda> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.invoke.SerializedLambda]

    @Override
    public Class<SerializedLambda> createNewSUT() {
        return SerializedLambda.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.lang.invoke.SerializedLambda#SerializedLambda(Class, String, String, String, int, String, String, String, String, Object[])
     * public
     * java.lang.invoke.SerializedLambda(java.lang.Class<?>,java.lang.String,java.lang.String,java.lang.String,int,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.Object[])}.
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
    public void create_SerializedLambda_Class_String_String_String_int_String_String_String_String_ObjectArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SerializedLambda sut = null; // = new SerializedLambda(Class, String, String, String, int, String, String,
                                           // String, String, Object[]);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.invoke.SerializedLambda]

}
