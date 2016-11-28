package org.j8unit.repository.javax.print;

import javax.print.DocFlavor;
import javax.print.DocFlavor.BYTE_ARRAY;
import javax.print.DocFlavor.CHAR_ARRAY;
import javax.print.DocFlavor.INPUT_STREAM;
import javax.print.DocFlavor.READER;
import javax.print.DocFlavor.SERVICE_FORMATTED;
import javax.print.DocFlavor.STRING;
import javax.print.DocFlavor.URL;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.io.SerializableTests;
import org.j8unit.repository.java.lang.CloneableTests;
import org.j8unit.repository.java.lang.ObjectTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link DocFlavor
 * public class javax.print.DocFlavor}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.print.DocFlavorClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DocFlavorTests<SUT extends DocFlavor>
extends SerializableTests<SUT>, CloneableTests<SUT>, ObjectTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.DocFlavor]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.print.DocFlavor#getRepresentationClassName()
     * public java.lang.String javax.print.DocFlavor.getRepresentationClassName()}.
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
    public default void test_getRepresentationClassName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.print.DocFlavor#getParameter(String) public
     * java.lang.String javax.print.DocFlavor.getParameter(java.lang.String)}.
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
    public default void test_getParameter_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.print.DocFlavor#toString() public
     * java.lang.String javax.print.DocFlavor.toString()}.
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
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.print.DocFlavor#getMediaType() public
     * java.lang.String javax.print.DocFlavor.getMediaType()}.
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
    public default void test_getMediaType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.print.DocFlavor#getMimeType() public
     * java.lang.String javax.print.DocFlavor.getMimeType()}.
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
    public default void test_getMimeType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.print.DocFlavor#hashCode() public int
     * javax.print.DocFlavor.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.print.DocFlavor#equals(Object) public boolean
     * javax.print.DocFlavor.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.print.DocFlavor#getMediaSubtype() public
     * java.lang.String javax.print.DocFlavor.getMediaSubtype()}.
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
    public default void test_getMediaSubtype()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.DocFlavor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.DocFlavor]

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link SERVICE_FORMATTED public static class javax.print.DocFlavor$SERVICE_FORMATTED}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.print.DocFlavorClassTests.SERVICE_FORMATTEDClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface SERVICE_FORMATTEDTests<SUT extends SERVICE_FORMATTED>
    extends org.j8unit.repository.javax.print.DocFlavorTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.DocFlavor$SERVICE_FORMATTED]

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.DocFlavor$SERVICE_FORMATTED]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.DocFlavor$SERVICE_FORMATTED]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link URL public
     * static class javax.print.DocFlavor$URL}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.print.DocFlavorClassTests.URLClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface URLTests<SUT extends URL>
    extends org.j8unit.repository.javax.print.DocFlavorTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.DocFlavor$URL]

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.DocFlavor$URL]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.DocFlavor$URL]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link CHAR_ARRAY
     * public static class javax.print.DocFlavor$CHAR_ARRAY}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.print.DocFlavorClassTests.CHAR_ARRAYClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface CHAR_ARRAYTests<SUT extends CHAR_ARRAY>
    extends org.j8unit.repository.javax.print.DocFlavorTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.DocFlavor$CHAR_ARRAY]

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.DocFlavor$CHAR_ARRAY]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.DocFlavor$CHAR_ARRAY]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link INPUT_STREAM public static class javax.print.DocFlavor$INPUT_STREAM}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.print.DocFlavorClassTests.INPUT_STREAMClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface INPUT_STREAMTests<SUT extends INPUT_STREAM>
    extends org.j8unit.repository.javax.print.DocFlavorTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.DocFlavor$INPUT_STREAM]

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.DocFlavor$INPUT_STREAM]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.DocFlavor$INPUT_STREAM]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link STRING
     * public static class javax.print.DocFlavor$STRING}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.print.DocFlavorClassTests.STRINGClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface STRINGTests<SUT extends STRING>
    extends org.j8unit.repository.javax.print.DocFlavorTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.DocFlavor$STRING]

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.DocFlavor$STRING]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.DocFlavor$STRING]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link READER
     * public static class javax.print.DocFlavor$READER}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.print.DocFlavorClassTests.READERClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface READERTests<SUT extends READER>
    extends org.j8unit.repository.javax.print.DocFlavorTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.DocFlavor$READER]

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.DocFlavor$READER]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.DocFlavor$READER]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link BYTE_ARRAY
     * public static class javax.print.DocFlavor$BYTE_ARRAY}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.print.DocFlavorClassTests.BYTE_ARRAYClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BYTE_ARRAYTests<SUT extends BYTE_ARRAY>
    extends org.j8unit.repository.javax.print.DocFlavorTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.DocFlavor$BYTE_ARRAY]

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.DocFlavor$BYTE_ARRAY]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.DocFlavor$BYTE_ARRAY]

    }

}
