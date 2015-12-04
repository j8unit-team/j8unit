package org.j8unit.repository.java.util;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.AbstractMap class java.util.AbstractMap}, containing all class relevant test methods
 * (at least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
 * class containing the instance relevant test methods is {@link org.j8unit.repository.java.util.AbstractMapTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a> Thus,
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable test
 * method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.AbstractMapTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AbstractMapClassTests<SUT extends Class<? extends java.util.AbstractMap<K, V>>, K, V>
extends org.j8unit.repository.java.util.MapClassTests<SUT, K, V>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link java.util.AbstractMap$SimpleEntry class java.util.AbstractMap$SimpleEntry}, containing all
     * class relevant test methods (at least the test methods of accessible constructors and of accessible
     * {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.util.AbstractMapTests.SimpleEntryTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.AbstractMapTests.SimpleEntryTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface SimpleEntryClassTests<SUT extends Class<? extends java.util.AbstractMap.SimpleEntry<K, V>>, K, V>
    extends org.j8unit.repository.java.util.MapClassTests.EntryClassTests<SUT, K, V>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
    org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for {@link java.util.AbstractMap.SimpleEntry#SimpleEntry(java.util.Map.Entry) public
         * java.util.AbstractMap$SimpleEntry(java.util.Map$Entry)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_SimpleEntry_Entry()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.util.AbstractMap.SimpleEntry<K, V> sut = null; // = new SimpleEntry(java.util.Map.Entry);
        }

        /**
         * Test method for {@link java.util.AbstractMap.SimpleEntry#SimpleEntry(java.lang.Object,java.lang.Object)
         * public java.util.AbstractMap$SimpleEntry(java.lang.Object,java.lang.Object)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_SimpleEntry_Object_Object()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.util.AbstractMap.SimpleEntry<K, V> sut = null; // = new
                                                                      // SimpleEntry(java.lang.Object,java.lang.Object);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.util.AbstractMap.SimpleEntry<K, V>> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.AbstractMap.SimpleEntry.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.util.AbstractMap$SimpleImmutableEntry class
     * java.util.AbstractMap$SimpleImmutableEntry}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.util.AbstractMapTests.SimpleImmutableEntryTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.AbstractMapTests.SimpleImmutableEntryTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface SimpleImmutableEntryClassTests<SUT extends Class<? extends java.util.AbstractMap.SimpleImmutableEntry<K, V>>, K, V>
    extends org.j8unit.repository.java.util.MapClassTests.EntryClassTests<SUT, K, V>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
    org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for {@link java.util.AbstractMap.SimpleImmutableEntry#SimpleImmutableEntry(java.util.Map.Entry)
         * public java.util.AbstractMap$SimpleImmutableEntry(java.util.Map$Entry)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_SimpleImmutableEntry_Entry()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.util.AbstractMap.SimpleImmutableEntry<K, V> sut = null; // = new
                                                                               // SimpleImmutableEntry(java.util.Map.Entry);
        }

        /**
         * Test method for
         * {@link java.util.AbstractMap.SimpleImmutableEntry#SimpleImmutableEntry(java.lang.Object,java.lang.Object)
         * public java.util.AbstractMap$SimpleImmutableEntry(java.lang.Object,java.lang.Object)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_SimpleImmutableEntry_Object_Object()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.util.AbstractMap.SimpleImmutableEntry<K, V> sut = null; // = new
                                                                               // SimpleImmutableEntry(java.lang.Object,java.lang.Object);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.util.AbstractMap.SimpleImmutableEntry<K, V>> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.AbstractMap.SimpleImmutableEntry.class.isAssignableFrom(sut));
        }

    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.util.AbstractMap<K, V>> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.AbstractMap.class.isAssignableFrom(sut));
    }

}
