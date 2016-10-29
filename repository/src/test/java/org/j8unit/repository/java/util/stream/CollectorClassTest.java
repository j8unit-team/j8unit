package org.j8unit.repository.java.util.stream;

import java.util.stream.Collector;
import java.util.stream.Collector.Characteristics;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class CollectorClassTest
implements org.j8unit.repository.java.util.stream.CollectorClassTests<Collector> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.stream.Collector]

    @Override
    public Class<Collector> createNewSUT() {
        return Collector.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.util.stream.Collector#of(java.util.function.Supplier, java.util.function.BiConsumer, java.util.function.BinaryOperator, java.util.function.Function, java.util.stream.Collector.Characteristics...)
     * public static <T,A,R> java.util.stream.Collector<T, A, R>
     * java.util.stream.Collector.of(java.util.function.Supplier<A>,java.util.function.BiConsumer<A,
     * T>,java.util.function.BinaryOperator<A>,java.util.function.Function<A,
     * R>,java.util.stream.Collector$Characteristics...)}.
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
    public void test_of_Supplier_BiConsumer_BinaryOperator_Function_CharacteristicsArray()
    throws Exception {
        // write some test for {@link java.util.stream.Collector#of(java.util.function.Supplier,
        // java.util.function.BiConsumer, java.util.function.BinaryOperator, java.util.function.Function,
        // java.util.stream.Collector.Characteristics...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.util.stream.Collector#of(java.util.function.Supplier, java.util.function.BiConsumer, java.util.function.BinaryOperator, java.util.stream.Collector.Characteristics...)
     * public static <T,R> java.util.stream.Collector<T, R, R>
     * java.util.stream.Collector.of(java.util.function.Supplier<R>,java.util.function.BiConsumer<R,
     * T>,java.util.function.BinaryOperator<R>,java.util.stream.Collector$Characteristics...)}.
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
    public void test_of_Supplier_BiConsumer_BinaryOperator_CharacteristicsArray()
    throws Exception {
        // write some test for {@link java.util.stream.Collector#of(java.util.function.Supplier,
        // java.util.function.BiConsumer, java.util.function.BinaryOperator,
        // java.util.stream.Collector.Characteristics...)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.stream.Collector]

    @RunWith(J8Unit4.class)
    public static class CharacteristicsClassTest
    implements org.j8unit.repository.java.util.stream.CollectorClassTests.CharacteristicsClassTests<Characteristics> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.stream.Collector$Characteristics]

        @Override
        public Class<Characteristics> createNewSUT() {
            return Characteristics.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link java.util.stream.Collector.Characteristics#valueOf(String) public static
         * java.util.stream.Collector$Characteristics
         * java.util.stream.Collector$Characteristics.valueOf(java.lang.String)}.
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
        public void test_valueOf_String()
        throws Exception {
            // write some test for {@link java.util.stream.Collector.Characteristics#valueOf(String)}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link java.util.stream.Collector.Characteristics#values() public static
         * java.util.stream.Collector$Characteristics[] java.util.stream.Collector$Characteristics.values()}.
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
        public void test_values()
        throws Exception {
            // write some test for {@link java.util.stream.Collector.Characteristics#values()}
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.stream.Collector$Characteristics]

    }

}
