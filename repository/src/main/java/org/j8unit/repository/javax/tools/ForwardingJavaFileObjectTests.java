package org.j8unit.repository.javax.tools;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.tools.ForwardingJavaFileObject class
 * javax.tools.ForwardingJavaFileObject}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link ForwardingJavaFileObjectClassTests}.
 * </p>
 *
 * @see javax.tools.ForwardingJavaFileObject class javax.tools.ForwardingJavaFileObject (the hereby targeted
 *      class-under-test class)
 * @see ForwardingJavaFileObjectClassTests ForwardingJavaFileObjectClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ForwardingJavaFileObjectTests<SUT extends javax.tools.ForwardingJavaFileObject<F>, F extends javax.tools.JavaFileObject>
extends JavaFileObjectTests<SUT>, ForwardingFileObjectTests<SUT, F> {

    /**
     * <p>
     * Test method for
     * {@link javax.tools.ForwardingJavaFileObject#isNameCompatible(String, javax.tools.JavaFileObject.Kind) public
     * boolean javax.tools.ForwardingJavaFileObject.isNameCompatible(java.lang.String,javax.tools.JavaFileObject$Kind)}.
     *
     * <p>
     * Test method for
     * {@link javax.tools.ForwardingJavaFileObject#isNameCompatible(String, javax.tools.JavaFileObject.Kind) public
     * boolean javax.tools.ForwardingJavaFileObject.isNameCompatible(java.lang.String,javax.tools.JavaFileObject$Kind)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.ForwardingJavaFileObject#isNameCompatible(String, javax.tools.JavaFileObject.Kind) public
     *      boolean
     *      javax.tools.ForwardingJavaFileObject.isNameCompatible(java.lang.String,javax.tools.JavaFileObject$Kind) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isNameCompatible_String_Kind()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.tools.ForwardingJavaFileObject#getKind() public javax.tools.JavaFileObject$Kind
     * javax.tools.ForwardingJavaFileObject.getKind()}.
     *
     * <p>
     * Test method for {@link javax.tools.ForwardingJavaFileObject#getKind() public javax.tools.JavaFileObject$Kind
     * javax.tools.ForwardingJavaFileObject.getKind()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.ForwardingJavaFileObject#getKind() public javax.tools.JavaFileObject$Kind
     *      javax.tools.ForwardingJavaFileObject.getKind() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getKind()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.tools.ForwardingJavaFileObject#getNestingKind() public
     * javax.lang.model.element.NestingKind javax.tools.ForwardingJavaFileObject.getNestingKind()}.
     *
     * <p>
     * Test method for {@link javax.tools.ForwardingJavaFileObject#getNestingKind() public
     * javax.lang.model.element.NestingKind javax.tools.ForwardingJavaFileObject.getNestingKind()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.ForwardingJavaFileObject#getNestingKind() public javax.lang.model.element.NestingKind
     *      javax.tools.ForwardingJavaFileObject.getNestingKind() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getNestingKind()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.tools.ForwardingJavaFileObject#getAccessLevel() public
     * javax.lang.model.element.Modifier javax.tools.ForwardingJavaFileObject.getAccessLevel()}.
     *
     * <p>
     * Test method for {@link javax.tools.ForwardingJavaFileObject#getAccessLevel() public
     * javax.lang.model.element.Modifier javax.tools.ForwardingJavaFileObject.getAccessLevel()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.ForwardingJavaFileObject#getAccessLevel() public javax.lang.model.element.Modifier
     *      javax.tools.ForwardingJavaFileObject.getAccessLevel() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getAccessLevel()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.tools.ForwardingFileObject#openInputStream() class javax.tools.ForwardingFileObject}</li>
     * <li>{@linkplain javax.tools.FileObject#openInputStream() interface javax.tools.FileObject}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_openInputStream()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.tools.ForwardingFileObject#getCharContent(boolean) class javax.tools.ForwardingFileObject}
     * </li>
     * <li>{@linkplain javax.tools.FileObject#getCharContent(boolean) interface javax.tools.FileObject}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getCharContent_boolean()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.tools.ForwardingFileObject#delete() class javax.tools.ForwardingFileObject}</li>
     * <li>{@linkplain javax.tools.FileObject#delete() interface javax.tools.FileObject}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_delete()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.tools.ForwardingFileObject#openOutputStream() class javax.tools.ForwardingFileObject}</li>
     * <li>{@linkplain javax.tools.FileObject#openOutputStream() interface javax.tools.FileObject}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_openOutputStream()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.tools.ForwardingFileObject#openReader(boolean) class javax.tools.ForwardingFileObject}</li>
     * <li>{@linkplain javax.tools.FileObject#openReader(boolean) interface javax.tools.FileObject}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_openReader_boolean()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.tools.ForwardingFileObject#toUri() class javax.tools.ForwardingFileObject}</li>
     * <li>{@linkplain javax.tools.FileObject#toUri() interface javax.tools.FileObject}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toUri()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.tools.ForwardingFileObject#openWriter() class javax.tools.ForwardingFileObject}</li>
     * <li>{@linkplain javax.tools.FileObject#openWriter() interface javax.tools.FileObject}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_openWriter()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.tools.ForwardingFileObject#getName() class javax.tools.ForwardingFileObject}</li>
     * <li>{@linkplain javax.tools.FileObject#getName() interface javax.tools.FileObject}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getName()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.tools.ForwardingFileObject#getLastModified() class javax.tools.ForwardingFileObject}</li>
     * <li>{@linkplain javax.tools.FileObject#getLastModified() interface javax.tools.FileObject}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getLastModified()
    throws Exception {
    }

}
