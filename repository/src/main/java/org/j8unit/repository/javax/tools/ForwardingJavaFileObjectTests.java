package org.j8unit.repository.javax.tools;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.tools.ForwardingJavaFileObject class
 * javax.tools.ForwardingJavaFileObject}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.tools.ForwardingJavaFileObjectTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.tools.ForwardingJavaFileObjectClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.tools.ForwardingJavaFileObject
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ForwardingJavaFileObjectTests<SUT extends javax.tools.ForwardingJavaFileObject<F>, F extends javax.tools.JavaFileObject>
extends org.j8unit.repository.javax.tools.JavaFileObjectTests<SUT>, org.j8unit.repository.javax.tools.ForwardingFileObjectTests<SUT, F> {

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>interface javax.tools.FileObject</li>
     * <li>class javax.tools.ForwardingFileObject</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test method within the super test classes. To solve this situation,
     * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_delete()
    throws Exception {
    }

    /**
     * <p>
     * Test method for {@link javax.tools.ForwardingJavaFileObject#getAccessLevel() public
     * javax.lang.model.element.Modifier javax.tools.ForwardingJavaFileObject.getAccessLevel()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.tools.ForwardingJavaFileObject#getAccessLevel()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
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
     * <li>interface javax.tools.FileObject</li>
     * <li>class javax.tools.ForwardingFileObject</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test method within the super test classes. To solve this situation,
     * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getCharContent_boolean()
    throws Exception {
    }

    /**
     * <p>
     * Test method for {@link javax.tools.ForwardingJavaFileObject#getKind() public javax.tools.JavaFileObject$Kind
     * javax.tools.ForwardingJavaFileObject.getKind()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.tools.ForwardingJavaFileObject#getKind()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getKind()
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
     * <li>interface javax.tools.FileObject</li>
     * <li>class javax.tools.ForwardingFileObject</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test method within the super test classes. To solve this situation,
     * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getLastModified()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>interface javax.tools.FileObject</li>
     * <li>class javax.tools.ForwardingFileObject</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test method within the super test classes. To solve this situation,
     * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getName()
    throws Exception {
    }

    /**
     * <p>
     * Test method for {@link javax.tools.ForwardingJavaFileObject#getNestingKind() public
     * javax.lang.model.element.NestingKind javax.tools.ForwardingJavaFileObject.getNestingKind()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.tools.ForwardingJavaFileObject#getNestingKind()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getNestingKind()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.tools.ForwardingJavaFileObject#isNameCompatible(java.lang.String, javax.tools.JavaFileObject.Kind)
     * public boolean
     * javax.tools.ForwardingJavaFileObject.isNameCompatible(java.lang.String,javax.tools.JavaFileObject$Kind)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.tools.ForwardingJavaFileObject#isNameCompatible(java.lang.String,
     *             javax.tools.JavaFileObject.Kind)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_isNameCompatible_String_Kind()
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
     * <li>interface javax.tools.FileObject</li>
     * <li>class javax.tools.ForwardingFileObject</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test method within the super test classes. To solve this situation,
     * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_openInputStream()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>interface javax.tools.FileObject</li>
     * <li>class javax.tools.ForwardingFileObject</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test method within the super test classes. To solve this situation,
     * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_openOutputStream()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>interface javax.tools.FileObject</li>
     * <li>class javax.tools.ForwardingFileObject</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test method within the super test classes. To solve this situation,
     * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_openReader_boolean()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>interface javax.tools.FileObject</li>
     * <li>class javax.tools.ForwardingFileObject</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test method within the super test classes. To solve this situation,
     * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_openWriter()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>interface javax.tools.FileObject</li>
     * <li>class javax.tools.ForwardingFileObject</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test method within the super test classes. To solve this situation,
     * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_toUri()
    throws Exception {
    }

}
