package org.j8unit.repository.javax.swing.text.html;

import static org.junit.Assert.assertTrue;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLDocument.BlockElement;
import javax.swing.text.html.HTMLDocument.HTMLReader;
import javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.FormAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.TagAction;
import javax.swing.text.html.HTMLDocument.Iterator;
import javax.swing.text.html.HTMLDocument.RunElement;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.lang.ObjectClassTests;
import org.j8unit.repository.javax.swing.text.DefaultStyledDocumentClassTests;
import org.j8unit.repository.javax.swing.text.html.HTMLEditorKitClassTests.ParserCallbackClassTests;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime constraints
 * and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test {@link HTMLDocument public
 * class javax.swing.text.html.HTMLDocument}.
 *
 * (In addition, the runtime type of this j8unit test interface's generic type is verified by
 * {@link #verifyGenericType()}).
 * </p>
 *
 * <p>
 * The complementary j8unit test interface containing the instance relevant aspects is
 * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests}.
 * </p>
 *
 * <p>
 * <strong>What? Testing the class/the type itself? What is it good for?</strong>
 * </p>
 *
 * <p>
 * Classes/Types may have its own requirements and/or constraints; and all of these needs to be tested too!
 *
 * For example, all sub-types of {@link Throwable} should provide a zero-argument and a {@link String}-argument
 * constructor. Obviously, this is a class-specific behaviour. In general, all constraints refering to the provision of
 * specific constructors (and its individual requirements) should be covered by according test methods. (Note, this is
 * not limited to constructors only; Just think of factory methods and further.)
 *
 * For another example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the <em>AnnotationTypeElementDeclaration</em> production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a {@code throws} clause</q> (JLS,
 * Sec.&thinsp;9.6.1</a>). Obviously, this is a type-specific behaviour too; And it must be tested!
 * </p>
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HTMLDocumentClassTests<SUT extends HTMLDocument>
extends DefaultStyledDocumentClassTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLDocument]
    /**
     * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class<?>)
     *      (the hereby targeted method-under-test)
     *
     * @since 0.9.2
     */
    @Override
    @Test
    public default void verifyGenericType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to HTMLDocument.class!",
                   HTMLDocument.class.isAssignableFrom(sut));
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLDocument]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLDocument]

    /**
     * <p>
     * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime
     * constraints and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link RunElement public class javax.swing.text.html.HTMLDocument$RunElement}.
     *
     * (In addition, the runtime type of this j8unit test interface's generic type is verified by
     * {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.RunElementTests}.
     * </p>
     *
     * <p>
     * <strong>What? Testing the class/the type itself? What is it good for?</strong>
     * </p>
     *
     * <p>
     * Classes/Types may have its own requirements and/or constraints; and all of these needs to be tested too!
     *
     * For example, all sub-types of {@link Throwable} should provide a zero-argument and a {@link String}-argument
     * constructor. Obviously, this is a class-specific behaviour. In general, all constraints refering to the provision
     * of specific constructors (and its individual requirements) should be covered by according test methods. (Note,
     * this is not limited to constructors only; Just think of factory methods and further.)
     *
     * For another example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the <em>AnnotationTypeElementDeclaration</em> production, a method declaration in an annotation
     * type declaration cannot have formal parameters, type parameters, or a {@code throws} clause</q> (JLS,
     * Sec.&thinsp;9.6.1</a>). Obviously, this is a type-specific behaviour too; And it must be tested!
     * </p>
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface RunElementClassTests<SUT extends RunElement>
    extends LeafElementClassTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLDocument$RunElement]
        /**
         * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class<?>)
         *      (the hereby targeted method-under-test)
         *
         * @since 0.9.2
         */
        @Override
        @Test
        public default void verifyGenericType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            Assert.assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to RunElement.class!",
                              RunElement.class.isAssignableFrom(sut));
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLDocument$RunElement]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLDocument$RunElement]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime
     * constraints and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link HTMLReader public class javax.swing.text.html.HTMLDocument$HTMLReader}.
     *
     * (In addition, the runtime type of this j8unit test interface's generic type is verified by
     * {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests}.
     * </p>
     *
     * <p>
     * <strong>What? Testing the class/the type itself? What is it good for?</strong>
     * </p>
     *
     * <p>
     * Classes/Types may have its own requirements and/or constraints; and all of these needs to be tested too!
     *
     * For example, all sub-types of {@link Throwable} should provide a zero-argument and a {@link String}-argument
     * constructor. Obviously, this is a class-specific behaviour. In general, all constraints refering to the provision
     * of specific constructors (and its individual requirements) should be covered by according test methods. (Note,
     * this is not limited to constructors only; Just think of factory methods and further.)
     *
     * For another example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the <em>AnnotationTypeElementDeclaration</em> production, a method declaration in an annotation
     * type declaration cannot have formal parameters, type parameters, or a {@code throws} clause</q> (JLS,
     * Sec.&thinsp;9.6.1</a>). Obviously, this is a type-specific behaviour too; And it must be tested!
     * </p>
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface HTMLReaderClassTests<SUT extends HTMLReader>
    extends ParserCallbackClassTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader]
        /**
         * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class<?>)
         *      (the hereby targeted method-under-test)
         *
         * @since 0.9.2
         */
        @Override
        @Test
        public default void verifyGenericType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            Assert.assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to HTMLReader.class!",
                              HTMLReader.class.isAssignableFrom(sut));
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader]

        /**
         * <p>
         * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime
         * constraints and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test
         * {@link SpecialAction public class javax.swing.text.html.HTMLDocument$HTMLReader$SpecialAction}.
         *
         * (In addition, the runtime type of this j8unit test interface's generic type is verified by
         * {@link #verifyGenericType()}).
         * </p>
         *
         * <p>
         * The complementary j8unit test interface containing the instance relevant aspects is
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.SpecialActionTests}.
         * </p>
         *
         * <p>
         * <strong>What? Testing the class/the type itself? What is it good for?</strong>
         * </p>
         *
         * <p>
         * Classes/Types may have its own requirements and/or constraints; and all of these needs to be tested too!
         *
         * For example, all sub-types of {@link Throwable} should provide a zero-argument and a {@link String}-argument
         * constructor. Obviously, this is a class-specific behaviour. In general, all constraints refering to the
         * provision of specific constructors (and its individual requirements) should be covered by according test
         * methods. (Note, this is not limited to constructors only; Just think of factory methods and further.)
         *
         * For another example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
         * <q>by virtue of the <em>AnnotationTypeElementDeclaration</em> production, a method declaration in an
         * annotation type declaration cannot have formal parameters, type parameters, or a {@code throws} clause</q>
         * (JLS, Sec.&thinsp;9.6.1</a>). Obviously, this is a type-specific behaviour too; And it must be tested!
         * </p>
         *
         * @param SUT
         *            the class' type of the subject-under-test
         * @since 0.9.0
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface SpecialActionClassTests<SUT extends SpecialAction>
        extends org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.TagActionClassTests<SUT> {

            // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$SpecialAction]
            /**
             * @see Class#isAssignableFrom(Class) public native boolean
             *      java.lang.Class.isAssignableFrom(java.lang.Class<?>) (the hereby targeted method-under-test)
             *
             * @since 0.9.2
             */
            @Override
            @Test
            public default void verifyGenericType()
            throws Exception {
                // create new instance
                final Class<SUT> sut = createNewSUT();
                // assert assignability
                Assert.assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to SpecialAction.class!",
                                  SpecialAction.class.isAssignableFrom(sut));
            }

            // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$SpecialAction]

            // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$SpecialAction]

        }

        /**
         * <p>
         * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime
         * constraints and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test
         * {@link IsindexAction public class javax.swing.text.html.HTMLDocument$HTMLReader$IsindexAction}.
         *
         * (In addition, the runtime type of this j8unit test interface's generic type is verified by
         * {@link #verifyGenericType()}).
         * </p>
         *
         * <p>
         * The complementary j8unit test interface containing the instance relevant aspects is
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.IsindexActionTests}.
         * </p>
         *
         * <p>
         * <strong>What? Testing the class/the type itself? What is it good for?</strong>
         * </p>
         *
         * <p>
         * Classes/Types may have its own requirements and/or constraints; and all of these needs to be tested too!
         *
         * For example, all sub-types of {@link Throwable} should provide a zero-argument and a {@link String}-argument
         * constructor. Obviously, this is a class-specific behaviour. In general, all constraints refering to the
         * provision of specific constructors (and its individual requirements) should be covered by according test
         * methods. (Note, this is not limited to constructors only; Just think of factory methods and further.)
         *
         * For another example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
         * <q>by virtue of the <em>AnnotationTypeElementDeclaration</em> production, a method declaration in an
         * annotation type declaration cannot have formal parameters, type parameters, or a {@code throws} clause</q>
         * (JLS, Sec.&thinsp;9.6.1</a>). Obviously, this is a type-specific behaviour too; And it must be tested!
         * </p>
         *
         * @param SUT
         *            the class' type of the subject-under-test
         * @since 0.9.0
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface IsindexActionClassTests<SUT extends IsindexAction>
        extends org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.TagActionClassTests<SUT> {

            // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$IsindexAction]
            /**
             * @see Class#isAssignableFrom(Class) public native boolean
             *      java.lang.Class.isAssignableFrom(java.lang.Class<?>) (the hereby targeted method-under-test)
             *
             * @since 0.9.2
             */
            @Override
            @Test
            public default void verifyGenericType()
            throws Exception {
                // create new instance
                final Class<SUT> sut = createNewSUT();
                // assert assignability
                Assert.assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to IsindexAction.class!",
                                  IsindexAction.class.isAssignableFrom(sut));
            }

            // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$IsindexAction]

            // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$IsindexAction]

        }

        /**
         * <p>
         * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime
         * constraints and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test
         * {@link TagAction public class javax.swing.text.html.HTMLDocument$HTMLReader$TagAction}.
         *
         * (In addition, the runtime type of this j8unit test interface's generic type is verified by
         * {@link #verifyGenericType()}).
         * </p>
         *
         * <p>
         * The complementary j8unit test interface containing the instance relevant aspects is
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.TagActionTests}.
         * </p>
         *
         * <p>
         * <strong>What? Testing the class/the type itself? What is it good for?</strong>
         * </p>
         *
         * <p>
         * Classes/Types may have its own requirements and/or constraints; and all of these needs to be tested too!
         *
         * For example, all sub-types of {@link Throwable} should provide a zero-argument and a {@link String}-argument
         * constructor. Obviously, this is a class-specific behaviour. In general, all constraints refering to the
         * provision of specific constructors (and its individual requirements) should be covered by according test
         * methods. (Note, this is not limited to constructors only; Just think of factory methods and further.)
         *
         * For another example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
         * <q>by virtue of the <em>AnnotationTypeElementDeclaration</em> production, a method declaration in an
         * annotation type declaration cannot have formal parameters, type parameters, or a {@code throws} clause</q>
         * (JLS, Sec.&thinsp;9.6.1</a>). Obviously, this is a type-specific behaviour too; And it must be tested!
         * </p>
         *
         * @param SUT
         *            the class' type of the subject-under-test
         * @since 0.9.0
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface TagActionClassTests<SUT extends TagAction>
        extends ObjectClassTests<SUT> {

            // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$TagAction]
            /**
             * @see Class#isAssignableFrom(Class) public native boolean
             *      java.lang.Class.isAssignableFrom(java.lang.Class<?>) (the hereby targeted method-under-test)
             *
             * @since 0.9.2
             */
            @Override
            @Test
            public default void verifyGenericType()
            throws Exception {
                // create new instance
                final Class<SUT> sut = createNewSUT();
                // assert assignability
                Assert.assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to TagAction.class!",
                                  TagAction.class.isAssignableFrom(sut));
            }

            // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$TagAction]

            // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$TagAction]

        }

        /**
         * <p>
         * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime
         * constraints and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test
         * {@link PreAction public class javax.swing.text.html.HTMLDocument$HTMLReader$PreAction}.
         *
         * (In addition, the runtime type of this j8unit test interface's generic type is verified by
         * {@link #verifyGenericType()}).
         * </p>
         *
         * <p>
         * The complementary j8unit test interface containing the instance relevant aspects is
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.PreActionTests}.
         * </p>
         *
         * <p>
         * <strong>What? Testing the class/the type itself? What is it good for?</strong>
         * </p>
         *
         * <p>
         * Classes/Types may have its own requirements and/or constraints; and all of these needs to be tested too!
         *
         * For example, all sub-types of {@link Throwable} should provide a zero-argument and a {@link String}-argument
         * constructor. Obviously, this is a class-specific behaviour. In general, all constraints refering to the
         * provision of specific constructors (and its individual requirements) should be covered by according test
         * methods. (Note, this is not limited to constructors only; Just think of factory methods and further.)
         *
         * For another example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
         * <q>by virtue of the <em>AnnotationTypeElementDeclaration</em> production, a method declaration in an
         * annotation type declaration cannot have formal parameters, type parameters, or a {@code throws} clause</q>
         * (JLS, Sec.&thinsp;9.6.1</a>). Obviously, this is a type-specific behaviour too; And it must be tested!
         * </p>
         *
         * @param SUT
         *            the class' type of the subject-under-test
         * @since 0.9.0
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface PreActionClassTests<SUT extends PreAction>
        extends org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.BlockActionClassTests<SUT> {

            // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$PreAction]
            /**
             * @see Class#isAssignableFrom(Class) public native boolean
             *      java.lang.Class.isAssignableFrom(java.lang.Class<?>) (the hereby targeted method-under-test)
             *
             * @since 0.9.2
             */
            @Override
            @Test
            public default void verifyGenericType()
            throws Exception {
                // create new instance
                final Class<SUT> sut = createNewSUT();
                // assert assignability
                Assert.assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to PreAction.class!",
                                  PreAction.class.isAssignableFrom(sut));
            }

            // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$PreAction]

            // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$PreAction]

        }

        /**
         * <p>
         * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime
         * constraints and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test
         * {@link HiddenAction public class javax.swing.text.html.HTMLDocument$HTMLReader$HiddenAction}.
         *
         * (In addition, the runtime type of this j8unit test interface's generic type is verified by
         * {@link #verifyGenericType()}).
         * </p>
         *
         * <p>
         * The complementary j8unit test interface containing the instance relevant aspects is
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.HiddenActionTests}.
         * </p>
         *
         * <p>
         * <strong>What? Testing the class/the type itself? What is it good for?</strong>
         * </p>
         *
         * <p>
         * Classes/Types may have its own requirements and/or constraints; and all of these needs to be tested too!
         *
         * For example, all sub-types of {@link Throwable} should provide a zero-argument and a {@link String}-argument
         * constructor. Obviously, this is a class-specific behaviour. In general, all constraints refering to the
         * provision of specific constructors (and its individual requirements) should be covered by according test
         * methods. (Note, this is not limited to constructors only; Just think of factory methods and further.)
         *
         * For another example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
         * <q>by virtue of the <em>AnnotationTypeElementDeclaration</em> production, a method declaration in an
         * annotation type declaration cannot have formal parameters, type parameters, or a {@code throws} clause</q>
         * (JLS, Sec.&thinsp;9.6.1</a>). Obviously, this is a type-specific behaviour too; And it must be tested!
         * </p>
         *
         * @param SUT
         *            the class' type of the subject-under-test
         * @since 0.9.0
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface HiddenActionClassTests<SUT extends HiddenAction>
        extends org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.TagActionClassTests<SUT> {

            // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$HiddenAction]
            /**
             * @see Class#isAssignableFrom(Class) public native boolean
             *      java.lang.Class.isAssignableFrom(java.lang.Class<?>) (the hereby targeted method-under-test)
             *
             * @since 0.9.2
             */
            @Override
            @Test
            public default void verifyGenericType()
            throws Exception {
                // create new instance
                final Class<SUT> sut = createNewSUT();
                // assert assignability
                Assert.assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to HiddenAction.class!",
                                  HiddenAction.class.isAssignableFrom(sut));
            }

            // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$HiddenAction]

            // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$HiddenAction]

        }

        /**
         * <p>
         * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime
         * constraints and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test
         * {@link BlockAction public class javax.swing.text.html.HTMLDocument$HTMLReader$BlockAction}.
         *
         * (In addition, the runtime type of this j8unit test interface's generic type is verified by
         * {@link #verifyGenericType()}).
         * </p>
         *
         * <p>
         * The complementary j8unit test interface containing the instance relevant aspects is
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.BlockActionTests}.
         * </p>
         *
         * <p>
         * <strong>What? Testing the class/the type itself? What is it good for?</strong>
         * </p>
         *
         * <p>
         * Classes/Types may have its own requirements and/or constraints; and all of these needs to be tested too!
         *
         * For example, all sub-types of {@link Throwable} should provide a zero-argument and a {@link String}-argument
         * constructor. Obviously, this is a class-specific behaviour. In general, all constraints refering to the
         * provision of specific constructors (and its individual requirements) should be covered by according test
         * methods. (Note, this is not limited to constructors only; Just think of factory methods and further.)
         *
         * For another example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
         * <q>by virtue of the <em>AnnotationTypeElementDeclaration</em> production, a method declaration in an
         * annotation type declaration cannot have formal parameters, type parameters, or a {@code throws} clause</q>
         * (JLS, Sec.&thinsp;9.6.1</a>). Obviously, this is a type-specific behaviour too; And it must be tested!
         * </p>
         *
         * @param SUT
         *            the class' type of the subject-under-test
         * @since 0.9.0
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface BlockActionClassTests<SUT extends BlockAction>
        extends org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.TagActionClassTests<SUT> {

            // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$BlockAction]
            /**
             * @see Class#isAssignableFrom(Class) public native boolean
             *      java.lang.Class.isAssignableFrom(java.lang.Class<?>) (the hereby targeted method-under-test)
             *
             * @since 0.9.2
             */
            @Override
            @Test
            public default void verifyGenericType()
            throws Exception {
                // create new instance
                final Class<SUT> sut = createNewSUT();
                // assert assignability
                Assert.assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to BlockAction.class!",
                                  BlockAction.class.isAssignableFrom(sut));
            }

            // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$BlockAction]

            // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$BlockAction]

        }

        /**
         * <p>
         * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime
         * constraints and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test
         * {@link FormAction public class javax.swing.text.html.HTMLDocument$HTMLReader$FormAction}.
         *
         * (In addition, the runtime type of this j8unit test interface's generic type is verified by
         * {@link #verifyGenericType()}).
         * </p>
         *
         * <p>
         * The complementary j8unit test interface containing the instance relevant aspects is
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.FormActionTests}.
         * </p>
         *
         * <p>
         * <strong>What? Testing the class/the type itself? What is it good for?</strong>
         * </p>
         *
         * <p>
         * Classes/Types may have its own requirements and/or constraints; and all of these needs to be tested too!
         *
         * For example, all sub-types of {@link Throwable} should provide a zero-argument and a {@link String}-argument
         * constructor. Obviously, this is a class-specific behaviour. In general, all constraints refering to the
         * provision of specific constructors (and its individual requirements) should be covered by according test
         * methods. (Note, this is not limited to constructors only; Just think of factory methods and further.)
         *
         * For another example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
         * <q>by virtue of the <em>AnnotationTypeElementDeclaration</em> production, a method declaration in an
         * annotation type declaration cannot have formal parameters, type parameters, or a {@code throws} clause</q>
         * (JLS, Sec.&thinsp;9.6.1</a>). Obviously, this is a type-specific behaviour too; And it must be tested!
         * </p>
         *
         * @param SUT
         *            the class' type of the subject-under-test
         * @since 0.9.0
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface FormActionClassTests<SUT extends FormAction>
        extends org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.SpecialActionClassTests<SUT> {

            // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$FormAction]
            /**
             * @see Class#isAssignableFrom(Class) public native boolean
             *      java.lang.Class.isAssignableFrom(java.lang.Class<?>) (the hereby targeted method-under-test)
             *
             * @since 0.9.2
             */
            @Override
            @Test
            public default void verifyGenericType()
            throws Exception {
                // create new instance
                final Class<SUT> sut = createNewSUT();
                // assert assignability
                Assert.assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to FormAction.class!",
                                  FormAction.class.isAssignableFrom(sut));
            }

            // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$FormAction]

            // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$FormAction]

        }

        /**
         * <p>
         * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime
         * constraints and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test
         * {@link CharacterAction public class javax.swing.text.html.HTMLDocument$HTMLReader$CharacterAction}.
         *
         * (In addition, the runtime type of this j8unit test interface's generic type is verified by
         * {@link #verifyGenericType()}).
         * </p>
         *
         * <p>
         * The complementary j8unit test interface containing the instance relevant aspects is
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.CharacterActionTests}.
         * </p>
         *
         * <p>
         * <strong>What? Testing the class/the type itself? What is it good for?</strong>
         * </p>
         *
         * <p>
         * Classes/Types may have its own requirements and/or constraints; and all of these needs to be tested too!
         *
         * For example, all sub-types of {@link Throwable} should provide a zero-argument and a {@link String}-argument
         * constructor. Obviously, this is a class-specific behaviour. In general, all constraints refering to the
         * provision of specific constructors (and its individual requirements) should be covered by according test
         * methods. (Note, this is not limited to constructors only; Just think of factory methods and further.)
         *
         * For another example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
         * <q>by virtue of the <em>AnnotationTypeElementDeclaration</em> production, a method declaration in an
         * annotation type declaration cannot have formal parameters, type parameters, or a {@code throws} clause</q>
         * (JLS, Sec.&thinsp;9.6.1</a>). Obviously, this is a type-specific behaviour too; And it must be tested!
         * </p>
         *
         * @param SUT
         *            the class' type of the subject-under-test
         * @since 0.9.0
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface CharacterActionClassTests<SUT extends CharacterAction>
        extends org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.TagActionClassTests<SUT> {

            // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$CharacterAction]
            /**
             * @see Class#isAssignableFrom(Class) public native boolean
             *      java.lang.Class.isAssignableFrom(java.lang.Class<?>) (the hereby targeted method-under-test)
             *
             * @since 0.9.2
             */
            @Override
            @Test
            public default void verifyGenericType()
            throws Exception {
                // create new instance
                final Class<SUT> sut = createNewSUT();
                // assert assignability
                Assert.assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to CharacterAction.class!",
                                  CharacterAction.class.isAssignableFrom(sut));
            }

            // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$CharacterAction]

            // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$CharacterAction]

        }

        /**
         * <p>
         * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime
         * constraints and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test
         * {@link ParagraphAction public class javax.swing.text.html.HTMLDocument$HTMLReader$ParagraphAction}.
         *
         * (In addition, the runtime type of this j8unit test interface's generic type is verified by
         * {@link #verifyGenericType()}).
         * </p>
         *
         * <p>
         * The complementary j8unit test interface containing the instance relevant aspects is
         * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.HTMLReaderTests.ParagraphActionTests}.
         * </p>
         *
         * <p>
         * <strong>What? Testing the class/the type itself? What is it good for?</strong>
         * </p>
         *
         * <p>
         * Classes/Types may have its own requirements and/or constraints; and all of these needs to be tested too!
         *
         * For example, all sub-types of {@link Throwable} should provide a zero-argument and a {@link String}-argument
         * constructor. Obviously, this is a class-specific behaviour. In general, all constraints refering to the
         * provision of specific constructors (and its individual requirements) should be covered by according test
         * methods. (Note, this is not limited to constructors only; Just think of factory methods and further.)
         *
         * For another example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
         * <q>by virtue of the <em>AnnotationTypeElementDeclaration</em> production, a method declaration in an
         * annotation type declaration cannot have formal parameters, type parameters, or a {@code throws} clause</q>
         * (JLS, Sec.&thinsp;9.6.1</a>). Obviously, this is a type-specific behaviour too; And it must be tested!
         * </p>
         *
         * @param SUT
         *            the class' type of the subject-under-test
         * @since 0.9.0
         */
        @FunctionalInterface
        @Category(J8UnitRepository.class)
        public static abstract interface ParagraphActionClassTests<SUT extends ParagraphAction>
        extends org.j8unit.repository.javax.swing.text.html.HTMLDocumentClassTests.HTMLReaderClassTests.BlockActionClassTests<SUT> {

            // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$ParagraphAction]
            /**
             * @see Class#isAssignableFrom(Class) public native boolean
             *      java.lang.Class.isAssignableFrom(java.lang.Class<?>) (the hereby targeted method-under-test)
             *
             * @since 0.9.2
             */
            @Override
            @Test
            public default void verifyGenericType()
            throws Exception {
                // create new instance
                final Class<SUT> sut = createNewSUT();
                // assert assignability
                Assert.assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to ParagraphAction.class!",
                                  ParagraphAction.class.isAssignableFrom(sut));
            }

            // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$ParagraphAction]

            // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLDocument$HTMLReader$ParagraphAction]

        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime
     * constraints and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link BlockElement public class javax.swing.text.html.HTMLDocument$BlockElement}.
     *
     * (In addition, the runtime type of this j8unit test interface's generic type is verified by
     * {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.BlockElementTests}.
     * </p>
     *
     * <p>
     * <strong>What? Testing the class/the type itself? What is it good for?</strong>
     * </p>
     *
     * <p>
     * Classes/Types may have its own requirements and/or constraints; and all of these needs to be tested too!
     *
     * For example, all sub-types of {@link Throwable} should provide a zero-argument and a {@link String}-argument
     * constructor. Obviously, this is a class-specific behaviour. In general, all constraints refering to the provision
     * of specific constructors (and its individual requirements) should be covered by according test methods. (Note,
     * this is not limited to constructors only; Just think of factory methods and further.)
     *
     * For another example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the <em>AnnotationTypeElementDeclaration</em> production, a method declaration in an annotation
     * type declaration cannot have formal parameters, type parameters, or a {@code throws} clause</q> (JLS,
     * Sec.&thinsp;9.6.1</a>). Obviously, this is a type-specific behaviour too; And it must be tested!
     * </p>
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BlockElementClassTests<SUT extends BlockElement>
    extends BranchElementClassTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLDocument$BlockElement]
        /**
         * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class<?>)
         *      (the hereby targeted method-under-test)
         *
         * @since 0.9.2
         */
        @Override
        @Test
        public default void verifyGenericType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            Assert.assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to BlockElement.class!",
                              BlockElement.class.isAssignableFrom(sut));
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLDocument$BlockElement]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLDocument$BlockElement]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime
     * constraints and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link Iterator public abstract static class javax.swing.text.html.HTMLDocument$Iterator}.
     *
     * (In addition, the runtime type of this j8unit test interface's generic type is verified by
     * {@link #verifyGenericType()}).
     * </p>
     *
     * <p>
     * The complementary j8unit test interface containing the instance relevant aspects is
     * {@link org.j8unit.repository.javax.swing.text.html.HTMLDocumentTests.IteratorTests}.
     * </p>
     *
     * <p>
     * <strong>What? Testing the class/the type itself? What is it good for?</strong>
     * </p>
     *
     * <p>
     * Classes/Types may have its own requirements and/or constraints; and all of these needs to be tested too!
     *
     * For example, all sub-types of {@link Throwable} should provide a zero-argument and a {@link String}-argument
     * constructor. Obviously, this is a class-specific behaviour. In general, all constraints refering to the provision
     * of specific constructors (and its individual requirements) should be covered by according test methods. (Note,
     * this is not limited to constructors only; Just think of factory methods and further.)
     *
     * For another example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the <em>AnnotationTypeElementDeclaration</em> production, a method declaration in an annotation
     * type declaration cannot have formal parameters, type parameters, or a {@code throws} clause</q> (JLS,
     * Sec.&thinsp;9.6.1</a>). Obviously, this is a type-specific behaviour too; And it must be tested!
     * </p>
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface IteratorClassTests<SUT extends Iterator>
    extends ObjectClassTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLDocument$Iterator]
        /**
         * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class<?>)
         *      (the hereby targeted method-under-test)
         *
         * @since 0.9.2
         */
        @Override
        @Test
        public default void verifyGenericType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            Assert.assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to Iterator.class!",
                              Iterator.class.isAssignableFrom(sut));
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLDocument$Iterator]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLDocument$Iterator]

    }

}
