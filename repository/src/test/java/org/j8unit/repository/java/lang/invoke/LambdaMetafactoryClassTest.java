package org.j8unit.repository.java.lang.invoke;

import java.lang.invoke.LambdaMetafactory;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LambdaMetafactory} (by simply reusing the
 * J8Unit test interface {@link LambdaMetafactoryClassTests}).
 */

@RunWith(J8Unit4.class)
public class LambdaMetafactoryClassTest
implements LambdaMetafactoryClassTests<LambdaMetafactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.invoke.LambdaMetafactory]

    @Override
    public Class<LambdaMetafactory> createNewSUT() {
        return LambdaMetafactory.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.lang.invoke.LambdaMetafactory#LambdaMetafactory() public java.lang.invoke.LambdaMetafactory()}.
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
    public void create_LambdaMetafactory()
    throws Exception {
        // create new instance
        final LambdaMetafactory sut = new LambdaMetafactory();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.lang.invoke.LambdaMetafactory#metafactory(java.lang.invoke.MethodHandles.Lookup, String, java.lang.invoke.MethodType, java.lang.invoke.MethodType, java.lang.invoke.MethodHandle, java.lang.invoke.MethodType)
     * public static java.lang.invoke.CallSite
     * java.lang.invoke.LambdaMetafactory.metafactory(java.lang.invoke.MethodHandles$Lookup,java.lang.String,java.lang.invoke.MethodType,java.lang.invoke.MethodType,java.lang.invoke.MethodHandle,java.lang.invoke.MethodType)
     * throws java.lang.invoke.LambdaConversionException}.
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
    public void test_metafactory_Lookup_String_MethodType_MethodType_MethodHandle_MethodType()
    throws Exception {
        // write some test for {@link
        // java.lang.invoke.LambdaMetafactory#metafactory(java.lang.invoke.MethodHandles.Lookup, String,
        // java.lang.invoke.MethodType, java.lang.invoke.MethodType, java.lang.invoke.MethodHandle,
        // java.lang.invoke.MethodType)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.lang.invoke.LambdaMetafactory#altMetafactory(java.lang.invoke.MethodHandles.Lookup, String, java.lang.invoke.MethodType, Object...)
     * public static java.lang.invoke.CallSite
     * java.lang.invoke.LambdaMetafactory.altMetafactory(java.lang.invoke.MethodHandles$Lookup,java.lang.String,java.lang.invoke.MethodType,java.lang.Object...)
     * throws java.lang.invoke.LambdaConversionException}.
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
    public void test_altMetafactory_Lookup_String_MethodType_ObjectArray()
    throws Exception {
        // write some test for {@link
        // java.lang.invoke.LambdaMetafactory#altMetafactory(java.lang.invoke.MethodHandles.Lookup, String,
        // java.lang.invoke.MethodType, Object...)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.invoke.LambdaMetafactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.invoke.LambdaMetafactory]

}
