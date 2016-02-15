package org.j8unit.repository.java.lang.instrument;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.instrument.Instrumentation interface
 * java.lang.instrument.Instrumentation}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link InstrumentationClassTests}.
 * </p>
 *
 * @see java.lang.instrument.Instrumentation interface java.lang.instrument.Instrumentation (the hereby targeted
 *      class-under-test class)
 * @see InstrumentationClassTests InstrumentationClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InstrumentationTests<SUT extends java.lang.instrument.Instrumentation>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.lang.instrument.Instrumentation#appendToBootstrapClassLoaderSearch(java.util.jar.JarFile) public
     * abstract void java.lang.instrument.Instrumentation.appendToBootstrapClassLoaderSearch(java.util.jar.JarFile)}.
     *
     * <p>
     * Test method for
     * {@link java.lang.instrument.Instrumentation#appendToBootstrapClassLoaderSearch(java.util.jar.JarFile) public
     * abstract void java.lang.instrument.Instrumentation.appendToBootstrapClassLoaderSearch(java.util.jar.JarFile)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.instrument.Instrumentation#appendToBootstrapClassLoaderSearch(java.util.jar.JarFile) public
     *      abstract void java.lang.instrument.Instrumentation.appendToBootstrapClassLoaderSearch(java.util.jar.JarFile)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_appendToBootstrapClassLoaderSearch_JarFile()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.instrument.Instrumentation#getInitiatedClasses(ClassLoader) public abstract
     * java.lang.Class[] java.lang.instrument.Instrumentation.getInitiatedClasses(java.lang.ClassLoader)}.
     *
     * <p>
     * Test method for {@link java.lang.instrument.Instrumentation#getInitiatedClasses(ClassLoader) public abstract
     * java.lang.Class[] java.lang.instrument.Instrumentation.getInitiatedClasses(java.lang.ClassLoader)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.instrument.Instrumentation#getInitiatedClasses(ClassLoader) public abstract java.lang.Class[]
     *      java.lang.instrument.Instrumentation.getInitiatedClasses(java.lang.ClassLoader) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInitiatedClasses_ClassLoader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.instrument.Instrumentation#isRedefineClassesSupported() public abstract boolean
     * java.lang.instrument.Instrumentation.isRedefineClassesSupported()}.
     *
     * <p>
     * Test method for {@link java.lang.instrument.Instrumentation#isRedefineClassesSupported() public abstract boolean
     * java.lang.instrument.Instrumentation.isRedefineClassesSupported()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.instrument.Instrumentation#isRedefineClassesSupported() public abstract boolean
     *      java.lang.instrument.Instrumentation.isRedefineClassesSupported() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isRedefineClassesSupported()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.instrument.Instrumentation#retransformClasses(Class...) public abstract void
     * java.lang.instrument.Instrumentation.retransformClasses(java.lang.Class<?>...) throws
     * java.lang.instrument.UnmodifiableClassException}.
     *
     * <p>
     * Test method for {@link java.lang.instrument.Instrumentation#retransformClasses(Class...) public abstract void
     * java.lang.instrument.Instrumentation.retransformClasses(java.lang.Class...) throws
     * java.lang.instrument.UnmodifiableClassException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.instrument.Instrumentation#retransformClasses(Class...) public abstract void
     *      java.lang.instrument.Instrumentation.retransformClasses(java.lang.Class[]) throws
     *      java.lang.instrument.UnmodifiableClassException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_retransformClasses_ClassArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.instrument.Instrumentation#getObjectSize(Object) public abstract long
     * java.lang.instrument.Instrumentation.getObjectSize(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.lang.instrument.Instrumentation#getObjectSize(Object) public abstract long
     * java.lang.instrument.Instrumentation.getObjectSize(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.instrument.Instrumentation#getObjectSize(Object) public abstract long
     *      java.lang.instrument.Instrumentation.getObjectSize(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getObjectSize_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.instrument.Instrumentation#isNativeMethodPrefixSupported() public abstract
     * boolean java.lang.instrument.Instrumentation.isNativeMethodPrefixSupported()}.
     *
     * <p>
     * Test method for {@link java.lang.instrument.Instrumentation#isNativeMethodPrefixSupported() public abstract
     * boolean java.lang.instrument.Instrumentation.isNativeMethodPrefixSupported()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.instrument.Instrumentation#isNativeMethodPrefixSupported() public abstract boolean
     *      java.lang.instrument.Instrumentation.isNativeMethodPrefixSupported() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isNativeMethodPrefixSupported()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.instrument.Instrumentation#getAllLoadedClasses() public abstract
     * java.lang.Class[] java.lang.instrument.Instrumentation.getAllLoadedClasses()}.
     *
     * <p>
     * Test method for {@link java.lang.instrument.Instrumentation#getAllLoadedClasses() public abstract
     * java.lang.Class[] java.lang.instrument.Instrumentation.getAllLoadedClasses()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.instrument.Instrumentation#getAllLoadedClasses() public abstract java.lang.Class[]
     *      java.lang.instrument.Instrumentation.getAllLoadedClasses() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAllLoadedClasses()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.lang.instrument.Instrumentation#removeTransformer(java.lang.instrument.ClassFileTransformer) public
     * abstract boolean
     * java.lang.instrument.Instrumentation.removeTransformer(java.lang.instrument.ClassFileTransformer)}.
     *
     * <p>
     * Test method for
     * {@link java.lang.instrument.Instrumentation#removeTransformer(java.lang.instrument.ClassFileTransformer) public
     * abstract boolean
     * java.lang.instrument.Instrumentation.removeTransformer(java.lang.instrument.ClassFileTransformer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.instrument.Instrumentation#removeTransformer(java.lang.instrument.ClassFileTransformer) public
     *      abstract boolean
     *      java.lang.instrument.Instrumentation.removeTransformer(java.lang.instrument.ClassFileTransformer) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeTransformer_ClassFileTransformer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.lang.instrument.Instrumentation#appendToSystemClassLoaderSearch(java.util.jar.JarFile) public
     * abstract void java.lang.instrument.Instrumentation.appendToSystemClassLoaderSearch(java.util.jar.JarFile)}.
     *
     * <p>
     * Test method for
     * {@link java.lang.instrument.Instrumentation#appendToSystemClassLoaderSearch(java.util.jar.JarFile) public
     * abstract void java.lang.instrument.Instrumentation.appendToSystemClassLoaderSearch(java.util.jar.JarFile)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.instrument.Instrumentation#appendToSystemClassLoaderSearch(java.util.jar.JarFile) public abstract
     *      void java.lang.instrument.Instrumentation.appendToSystemClassLoaderSearch(java.util.jar.JarFile) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_appendToSystemClassLoaderSearch_JarFile()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.instrument.Instrumentation#isRetransformClassesSupported() public abstract
     * boolean java.lang.instrument.Instrumentation.isRetransformClassesSupported()}.
     *
     * <p>
     * Test method for {@link java.lang.instrument.Instrumentation#isRetransformClassesSupported() public abstract
     * boolean java.lang.instrument.Instrumentation.isRetransformClassesSupported()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.instrument.Instrumentation#isRetransformClassesSupported() public abstract boolean
     *      java.lang.instrument.Instrumentation.isRetransformClassesSupported() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isRetransformClassesSupported()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.lang.instrument.Instrumentation#redefineClasses(java.lang.instrument.ClassDefinition...) public
     * abstract void java.lang.instrument.Instrumentation.redefineClasses(java.lang.instrument.ClassDefinition...)
     * throws java.lang.ClassNotFoundException,java.lang.instrument.UnmodifiableClassException}.
     *
     * <p>
     * Test method for
     * {@link java.lang.instrument.Instrumentation#redefineClasses(java.lang.instrument.ClassDefinition...) public
     * abstract void java.lang.instrument.Instrumentation.redefineClasses(java.lang.instrument.ClassDefinition...)
     * throws java.lang.ClassNotFoundException,java.lang.instrument.UnmodifiableClassException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.instrument.Instrumentation#redefineClasses(java.lang.instrument.ClassDefinition...) public
     *      abstract void java.lang.instrument.Instrumentation.redefineClasses(java.lang.instrument.ClassDefinition[])
     *      throws java.lang.ClassNotFoundException,java.lang.instrument.UnmodifiableClassException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_redefineClasses_ClassDefinitionArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.instrument.Instrumentation#isModifiableClass(Class) public abstract boolean
     * java.lang.instrument.Instrumentation.isModifiableClass(java.lang.Class<?>)}.
     *
     * <p>
     * Test method for {@link java.lang.instrument.Instrumentation#isModifiableClass(Class) public abstract boolean
     * java.lang.instrument.Instrumentation.isModifiableClass(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.instrument.Instrumentation#isModifiableClass(Class) public abstract boolean
     *      java.lang.instrument.Instrumentation.isModifiableClass(java.lang.Class) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isModifiableClass_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.lang.instrument.Instrumentation#addTransformer(java.lang.instrument.ClassFileTransformer, boolean)
     * public abstract void
     * java.lang.instrument.Instrumentation.addTransformer(java.lang.instrument.ClassFileTransformer,boolean)}.
     *
     * <p>
     * Test method for
     * {@link java.lang.instrument.Instrumentation#addTransformer(java.lang.instrument.ClassFileTransformer, boolean)
     * public abstract void
     * java.lang.instrument.Instrumentation.addTransformer(java.lang.instrument.ClassFileTransformer,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.instrument.Instrumentation#addTransformer(java.lang.instrument.ClassFileTransformer, boolean)
     *      public abstract void
     *      java.lang.instrument.Instrumentation.addTransformer(java.lang.instrument.ClassFileTransformer,boolean) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addTransformer_ClassFileTransformer_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.lang.instrument.Instrumentation#addTransformer(java.lang.instrument.ClassFileTransformer) public
     * abstract void java.lang.instrument.Instrumentation.addTransformer(java.lang.instrument.ClassFileTransformer)}.
     *
     * <p>
     * Test method for
     * {@link java.lang.instrument.Instrumentation#addTransformer(java.lang.instrument.ClassFileTransformer) public
     * abstract void java.lang.instrument.Instrumentation.addTransformer(java.lang.instrument.ClassFileTransformer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.instrument.Instrumentation#addTransformer(java.lang.instrument.ClassFileTransformer) public
     *      abstract void java.lang.instrument.Instrumentation.addTransformer(java.lang.instrument.ClassFileTransformer)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addTransformer_ClassFileTransformer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.lang.instrument.Instrumentation#setNativeMethodPrefix(java.lang.instrument.ClassFileTransformer, String)
     * public abstract void
     * java.lang.instrument.Instrumentation.setNativeMethodPrefix(java.lang.instrument.ClassFileTransformer,java.lang.String)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.lang.instrument.Instrumentation#setNativeMethodPrefix(java.lang.instrument.ClassFileTransformer, String)
     * public abstract void
     * java.lang.instrument.Instrumentation.setNativeMethodPrefix(java.lang.instrument.ClassFileTransformer,java.lang.String)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.instrument.Instrumentation#setNativeMethodPrefix(java.lang.instrument.ClassFileTransformer,
     *      String) public abstract void
     *      java.lang.instrument.Instrumentation.setNativeMethodPrefix(java.lang.instrument.ClassFileTransformer,java.
     *      lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setNativeMethodPrefix_ClassFileTransformer_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
