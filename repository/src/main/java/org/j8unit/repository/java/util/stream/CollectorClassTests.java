package org.j8unit.repository.java.util.stream;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.RepositoryClassTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.stream.Collector interface java.util.stream.Collector},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.util.stream.CollectorTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable
 * test method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @see org.j8unit.repository.java.util.stream.CollectorTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.stream.Collector
 */
@SuppressWarnings("rawtypes")
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CollectorClassTests<SUT extends java.util.stream.Collector>
extends RepositoryClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.util.stream.Collector.Characteristics class
     * java.util.stream.Collector$Characteristics}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.util.stream.CollectorTests.CharacteristicsTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.java.util.stream.CollectorTests.CharacteristicsTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.util.stream.Collector.Characteristics
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface CharacteristicsClassTests<SUT extends java.util.stream.Collector.Characteristics>
    extends org.j8unit.repository.java.lang.EnumClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.util.stream.Collector.Characteristics#valueOf(java.lang.String) public static
         * java.util.stream.Collector$Characteristics
         * java.util.stream.Collector$Characteristics.valueOf(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.stream.Collector.Characteristics#valueOf(java.lang.String)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_valueOf_String()
        throws Exception {
            // query fresh subject-under-test
            final Class<SUT> sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.stream.Collector.Characteristics#values() public static
         * java.util.stream.Collector$Characteristics[] java.util.stream.Collector$Characteristics.values()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.stream.Collector.Characteristics#values()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_values()
        throws Exception {
            // query fresh subject-under-test
            final Class<SUT> sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim java.util.stream.Collector.Characteristics#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.stream.Collector.Characteristics.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for
     * {@link java.util.stream.Collector#of(java.util.function.Supplier, java.util.function.BiConsumer, java.util.function.BinaryOperator, java.util.stream.Collector.Characteristics...)
     * public static java.util.stream.Collector
     * java.util.stream.Collector.of(java.util.function.Supplier,java.util.function.BiConsumer,java.util.function.BinaryOperator,java.util.stream.Collector$Characteristics...)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.stream.Collector#of(java.util.function.Supplier, java.util.function.BiConsumer,
     *             java.util.function.BinaryOperator, java.util.stream.Collector.Characteristics...)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_of_Supplier_BiConsumer_BinaryOperator_CharacteristicsArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.stream.Collector#of(java.util.function.Supplier, java.util.function.BiConsumer, java.util.function.BinaryOperator, java.util.function.Function, java.util.stream.Collector.Characteristics...)
     * public static java.util.stream.Collector
     * java.util.stream.Collector.of(java.util.function.Supplier,java.util.function.BiConsumer,java.util.function.BinaryOperator,java.util.function.Function,java.util.stream.Collector$Characteristics...)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.stream.Collector#of(java.util.function.Supplier, java.util.function.BiConsumer,
     *             java.util.function.BinaryOperator, java.util.function.Function,
     *             java.util.stream.Collector.Characteristics...)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_of_Supplier_BiConsumer_BinaryOperator_Function_CharacteristicsArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.util.stream.Collector#isAssignableFrom(java.lang.Class)
     */
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.stream.Collector.class.isAssignableFrom(sut));
    }

}
