package org.j8unit.repository.java.lang.invoke;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.lang.ObjectTests;
import org.j8unit.repository.java.lang.invoke.MethodHandlesClassTests.LookupClassTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link MethodHandles
 * public class java.lang.invoke.MethodHandles}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link MethodHandlesClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MethodHandlesTests<SUT extends MethodHandles>
extends ObjectTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.invoke.MethodHandles]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.invoke.MethodHandles]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.invoke.MethodHandles]
    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link Lookup
     * public static final class java.lang.invoke.MethodHandles$Lookup}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link LookupClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface LookupTests<SUT extends Lookup>
    extends ObjectTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.invoke.MethodHandles$Lookup]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link java.lang.invoke.MethodHandles.Lookup#in(Class)
         * public java.lang.invoke.MethodHandles$Lookup java.lang.invoke.MethodHandles$Lookup.in(java.lang.Class<?>)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_in_Class()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link java.lang.invoke.MethodHandles.Lookup#unreflectConstructor(java.lang.reflect.Constructor) public
         * java.lang.invoke.MethodHandle
         * java.lang.invoke.MethodHandles$Lookup.unreflectConstructor(java.lang.reflect.Constructor<?>) throws
         * java.lang.IllegalAccessException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_unreflectConstructor_Constructor()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link java.lang.invoke.MethodHandles.Lookup#findStaticGetter(Class, String, Class) public
         * java.lang.invoke.MethodHandle
         * java.lang.invoke.MethodHandles$Lookup.findStaticGetter(java.lang.Class<?>,java.lang.String,java.lang.Class<?>)
         * throws java.lang.NoSuchFieldException,java.lang.IllegalAccessException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_findStaticGetter_Class_String_Class()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link java.lang.invoke.MethodHandles.Lookup#lookupClass() public java.lang.Class<?>
         * java.lang.invoke.MethodHandles$Lookup.lookupClass()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_lookupClass()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link java.lang.invoke.MethodHandles.Lookup#unreflectSetter(java.lang.reflect.Field) public
         * java.lang.invoke.MethodHandle java.lang.invoke.MethodHandles$Lookup.unreflectSetter(java.lang.reflect.Field)
         * throws java.lang.IllegalAccessException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_unreflectSetter_Field()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link java.lang.invoke.MethodHandles.Lookup#findVirtual(Class, String, java.lang.invoke.MethodType) public
         * java.lang.invoke.MethodHandle
         * java.lang.invoke.MethodHandles$Lookup.findVirtual(java.lang.Class<?>,java.lang.String,java.lang.invoke.MethodType)
         * throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_findVirtual_Class_String_MethodType()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link java.lang.invoke.MethodHandles.Lookup#findStaticSetter(Class, String, Class) public
         * java.lang.invoke.MethodHandle
         * java.lang.invoke.MethodHandles$Lookup.findStaticSetter(java.lang.Class<?>,java.lang.String,java.lang.Class<?>)
         * throws java.lang.NoSuchFieldException,java.lang.IllegalAccessException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_findStaticSetter_Class_String_Class()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link java.lang.invoke.MethodHandles.Lookup#unreflect(java.lang.reflect.Method) public
         * java.lang.invoke.MethodHandle java.lang.invoke.MethodHandles$Lookup.unreflect(java.lang.reflect.Method)
         * throws java.lang.IllegalAccessException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_unreflect_Method()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link java.lang.invoke.MethodHandles.Lookup#bind(Object, String, java.lang.invoke.MethodType) public
         * java.lang.invoke.MethodHandle
         * java.lang.invoke.MethodHandles$Lookup.bind(java.lang.Object,java.lang.String,java.lang.invoke.MethodType)
         * throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_bind_Object_String_MethodType()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link java.lang.invoke.MethodHandles.Lookup#findStatic(Class, String, java.lang.invoke.MethodType) public
         * java.lang.invoke.MethodHandle
         * java.lang.invoke.MethodHandles$Lookup.findStatic(java.lang.Class<?>,java.lang.String,java.lang.invoke.MethodType)
         * throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_findStatic_Class_String_MethodType()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link java.lang.invoke.MethodHandles.Lookup#unreflectSpecial(java.lang.reflect.Method, Class) public
         * java.lang.invoke.MethodHandle
         * java.lang.invoke.MethodHandles$Lookup.unreflectSpecial(java.lang.reflect.Method,java.lang.Class<?>) throws
         * java.lang.IllegalAccessException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_unreflectSpecial_Method_Class()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link java.lang.invoke.MethodHandles.Lookup#findConstructor(Class, java.lang.invoke.MethodType) public
         * java.lang.invoke.MethodHandle
         * java.lang.invoke.MethodHandles$Lookup.findConstructor(java.lang.Class<?>,java.lang.invoke.MethodType) throws
         * java.lang.NoSuchMethodException,java.lang.IllegalAccessException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_findConstructor_Class_MethodType()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link java.lang.invoke.MethodHandles.Lookup#lookupModes() public int
         * java.lang.invoke.MethodHandles$Lookup.lookupModes()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_lookupModes()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link java.lang.invoke.MethodHandles.Lookup#findGetter(Class, String, Class) public
         * java.lang.invoke.MethodHandle
         * java.lang.invoke.MethodHandles$Lookup.findGetter(java.lang.Class<?>,java.lang.String,java.lang.Class<?>)
         * throws java.lang.NoSuchFieldException,java.lang.IllegalAccessException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_findGetter_Class_String_Class()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link java.lang.invoke.MethodHandles.Lookup#findSetter(Class, String, Class) public
         * java.lang.invoke.MethodHandle
         * java.lang.invoke.MethodHandles$Lookup.findSetter(java.lang.Class<?>,java.lang.String,java.lang.Class<?>)
         * throws java.lang.NoSuchFieldException,java.lang.IllegalAccessException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_findSetter_Class_String_Class()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link java.lang.invoke.MethodHandles.Lookup#toString()
         * public java.lang.String java.lang.invoke.MethodHandles$Lookup.toString()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_toString()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link java.lang.invoke.MethodHandles.Lookup#revealDirect(java.lang.invoke.MethodHandle) public
         * java.lang.invoke.MethodHandleInfo
         * java.lang.invoke.MethodHandles$Lookup.revealDirect(java.lang.invoke.MethodHandle)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_revealDirect_MethodHandle()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link java.lang.invoke.MethodHandles.Lookup#unreflectGetter(java.lang.reflect.Field) public
         * java.lang.invoke.MethodHandle java.lang.invoke.MethodHandles$Lookup.unreflectGetter(java.lang.reflect.Field)
         * throws java.lang.IllegalAccessException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_unreflectGetter_Field()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link java.lang.invoke.MethodHandles.Lookup#findSpecial(Class, String, java.lang.invoke.MethodType, Class)
         * public java.lang.invoke.MethodHandle
         * java.lang.invoke.MethodHandles$Lookup.findSpecial(java.lang.Class<?>,java.lang.String,java.lang.invoke.MethodType,java.lang.Class<?>)
         * throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_findSpecial_Class_String_MethodType_Class()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.invoke.MethodHandles$Lookup]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.invoke.MethodHandles$Lookup]
    }

}
