package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.CompletableFuture class
 * java.util.concurrent.CompletableFuture}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link CompletableFutureClassTests}.
 * </p>
 *
 * @see java.util.concurrent.CompletableFuture class java.util.concurrent.CompletableFuture (the hereby targeted
 *      class-under-test class)
 * @see CompletableFutureClassTests CompletableFutureClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CompletableFutureTests<SUT extends java.util.concurrent.CompletableFuture<T>, T>
extends FutureTests<SUT, T>, CompletionStageTests<SUT, T>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#thenRunAsync(Runnable, java.util.concurrent.Executor) public
     * java.util.concurrent.CompletableFuture<java.lang.Void>
     * java.util.concurrent.CompletableFuture.thenRunAsync(java.lang.Runnable,java.util.concurrent.Executor)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#thenRunAsync(Runnable, java.util.concurrent.Executor) public
     * java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.thenRunAsync(java.lang.Runnable,java.util.concurrent.Executor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#thenRunAsync(Runnable, java.util.concurrent.Executor) public
     *      java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.thenRunAsync(java.lang.Runnable,java.util.concurrent.Executor) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_thenRunAsync_Runnable_Executor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#thenRunAsync(Runnable) public
     * java.util.concurrent.CompletableFuture
     * <java.lang.Void> java.util.concurrent.CompletableFuture.thenRunAsync(java.lang.Runnable)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#thenRunAsync(Runnable) public
     * java.util.concurrent.CompletableFuture java.util.concurrent.CompletableFuture.thenRunAsync(java.lang.Runnable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#thenRunAsync(Runnable) public java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.thenRunAsync(java.lang.Runnable) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_thenRunAsync_Runnable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#thenComposeAsync(java.util.function.Function, java.util.concurrent.Executor)
     * public <U> java.util.concurrent.CompletableFuture
     * <U> java.util.concurrent.CompletableFuture.thenComposeAsync(java.util.function.Function<? super T, ? extends
     * java.util.concurrent.CompletionStage<U>>,java.util.concurrent.Executor)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#thenComposeAsync(java.util.function.Function, java.util.concurrent.Executor)
     * public java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.thenComposeAsync(java.util.function.Function,java.util.concurrent.Executor)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#thenComposeAsync(java.util.function.Function,
     *      java.util.concurrent.Executor) public java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.thenComposeAsync(java.util.function.Function,java.util.concurrent.
     *      Executor) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_thenComposeAsync_Function_Executor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#thenComposeAsync(java.util.function.Function)
     * public <U> java.util.concurrent.CompletableFuture
     * <U> java.util.concurrent.CompletableFuture.thenComposeAsync(java.util.function.Function<? super T, ? extends
     * java.util.concurrent.CompletionStage<U>>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#thenComposeAsync(java.util.function.Function)
     * public java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.thenComposeAsync(java.util.function.Function)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#thenComposeAsync(java.util.function.Function) public
     *      java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.thenComposeAsync(java.util.function.Function) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_thenComposeAsync_Function()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#runAfterEither(java.util.concurrent.CompletionStage, Runnable)
     * public java.util.concurrent.CompletableFuture
     * <java.lang.Void> java.util.concurrent.CompletableFuture.runAfterEither(java.util.concurrent.CompletionStage
     * <?>,java.lang.Runnable)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#runAfterEither(java.util.concurrent.CompletionStage, Runnable)
     * public java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.runAfterEither(java.util.concurrent.CompletionStage,java.lang.Runnable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#runAfterEither(java.util.concurrent.CompletionStage, Runnable) public
     *      java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.runAfterEither(java.util.concurrent.CompletionStage,java.lang.
     *      Runnable) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_runAfterEither_CompletionStage_Runnable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#get() public T
     * java.util.concurrent.CompletableFuture.get() throws
     * java.lang.InterruptedException,java.util.concurrent.ExecutionException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#get() public java.lang.Object
     * java.util.concurrent.CompletableFuture.get() throws
     * java.lang.InterruptedException,java.util.concurrent.ExecutionException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#get() public java.lang.Object
     *      java.util.concurrent.CompletableFuture.get() throws
     *      java.lang.InterruptedException,java.util.concurrent.ExecutionException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_get()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#get(long, java.util.concurrent.TimeUnit) public T
     * java.util.concurrent.CompletableFuture.get(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException,java.util.concurrent.ExecutionException,java.util.concurrent.TimeoutException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#get(long, java.util.concurrent.TimeUnit) public
     * java.lang.Object java.util.concurrent.CompletableFuture.get(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException,java.util.concurrent.ExecutionException,java.util.concurrent.TimeoutException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#get(long, java.util.concurrent.TimeUnit) public java.lang.Object
     *      java.util.concurrent.CompletableFuture.get(long,java.util.concurrent.TimeUnit) throws
     *      java.lang.InterruptedException,java.util.concurrent.ExecutionException,java.util.concurrent.TimeoutException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_get_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#acceptEither(java.util.concurrent.CompletionStage, java.util.function.Consumer)
     * public java.util.concurrent.CompletableFuture
     * <java.lang.Void> java.util.concurrent.CompletableFuture.acceptEither(java.util.concurrent.CompletionStage<?
     * extends T>,java.util.function.Consumer<? super T>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#acceptEither(java.util.concurrent.CompletionStage, java.util.function.Consumer)
     * public java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.acceptEither(java.util.concurrent.CompletionStage,java.util.function.Consumer)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#acceptEither(java.util.concurrent.CompletionStage,
     *      java.util.function.Consumer) public java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.acceptEither(java.util.concurrent.CompletionStage,java.util.function.
     *      Consumer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_acceptEither_CompletionStage_Consumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#applyToEitherAsync(java.util.concurrent.CompletionStage, java.util.function.Function)
     * public <U> java.util.concurrent.CompletableFuture
     * <U> java.util.concurrent.CompletableFuture.applyToEitherAsync(java.util.concurrent.CompletionStage<? extends
     * T>,java.util.function.Function<? super T, U>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#applyToEitherAsync(java.util.concurrent.CompletionStage, java.util.function.Function)
     * public java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.applyToEitherAsync(java.util.concurrent.CompletionStage,java.util.function.Function)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#applyToEitherAsync(java.util.concurrent.CompletionStage,
     *      java.util.function.Function) public java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.applyToEitherAsync(java.util.concurrent.CompletionStage,java.util.
     *      function.Function) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_applyToEitherAsync_CompletionStage_Function()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#applyToEitherAsync(java.util.concurrent.CompletionStage, java.util.function.Function, java.util.concurrent.Executor)
     * public <U> java.util.concurrent.CompletableFuture
     * <U> java.util.concurrent.CompletableFuture.applyToEitherAsync(java.util.concurrent.CompletionStage<? extends
     * T>,java.util.function.Function<? super T, U>,java.util.concurrent.Executor)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#applyToEitherAsync(java.util.concurrent.CompletionStage, java.util.function.Function, java.util.concurrent.Executor)
     * public java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.applyToEitherAsync(java.util.concurrent.CompletionStage,java.util.function.Function,java.util.concurrent.Executor)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#applyToEitherAsync(java.util.concurrent.CompletionStage,
     *      java.util.function.Function, java.util.concurrent.Executor) public java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.applyToEitherAsync(java.util.concurrent.CompletionStage,java.util.
     *      function.Function,java.util.concurrent.Executor) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_applyToEitherAsync_CompletionStage_Function_Executor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#runAfterEitherAsync(java.util.concurrent.CompletionStage, Runnable)
     * public java.util.concurrent.CompletableFuture
     * <java.lang.Void> java.util.concurrent.CompletableFuture.runAfterEitherAsync(java.util.concurrent.CompletionStage
     * <?>,java.lang.Runnable)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#runAfterEitherAsync(java.util.concurrent.CompletionStage, Runnable)
     * public java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.runAfterEitherAsync(java.util.concurrent.CompletionStage,java.lang.Runnable)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#runAfterEitherAsync(java.util.concurrent.CompletionStage, Runnable)
     *      public java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.runAfterEitherAsync(java.util.concurrent.CompletionStage,java.lang.
     *      Runnable) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_runAfterEitherAsync_CompletionStage_Runnable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#runAfterEitherAsync(java.util.concurrent.CompletionStage, Runnable, java.util.concurrent.Executor)
     * public java.util.concurrent.CompletableFuture
     * <java.lang.Void> java.util.concurrent.CompletableFuture.runAfterEitherAsync(java.util.concurrent.CompletionStage
     * <?>,java.lang.Runnable,java.util.concurrent.Executor)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#runAfterEitherAsync(java.util.concurrent.CompletionStage, Runnable, java.util.concurrent.Executor)
     * public java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.runAfterEitherAsync(java.util.concurrent.CompletionStage,java.lang.Runnable,java.util.concurrent.Executor)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#runAfterEitherAsync(java.util.concurrent.CompletionStage, Runnable,
     *      java.util.concurrent.Executor) public java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.runAfterEitherAsync(java.util.concurrent.CompletionStage,java.lang.
     *      Runnable,java.util.concurrent.Executor) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_runAfterEitherAsync_CompletionStage_Runnable_Executor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#acceptEitherAsync(java.util.concurrent.CompletionStage, java.util.function.Consumer, java.util.concurrent.Executor)
     * public java.util.concurrent.CompletableFuture
     * <java.lang.Void> java.util.concurrent.CompletableFuture.acceptEitherAsync(java.util.concurrent.CompletionStage<?
     * extends T>,java.util.function.Consumer<? super T>,java.util.concurrent.Executor)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#acceptEitherAsync(java.util.concurrent.CompletionStage, java.util.function.Consumer, java.util.concurrent.Executor)
     * public java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.acceptEitherAsync(java.util.concurrent.CompletionStage,java.util.function.Consumer,java.util.concurrent.Executor)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#acceptEitherAsync(java.util.concurrent.CompletionStage,
     *      java.util.function.Consumer, java.util.concurrent.Executor) public java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.acceptEitherAsync(java.util.concurrent.CompletionStage,java.util.
     *      function.Consumer,java.util.concurrent.Executor) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_acceptEitherAsync_CompletionStage_Consumer_Executor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#acceptEitherAsync(java.util.concurrent.CompletionStage, java.util.function.Consumer)
     * public java.util.concurrent.CompletableFuture
     * <java.lang.Void> java.util.concurrent.CompletableFuture.acceptEitherAsync(java.util.concurrent.CompletionStage<?
     * extends T>,java.util.function.Consumer<? super T>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#acceptEitherAsync(java.util.concurrent.CompletionStage, java.util.function.Consumer)
     * public java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.acceptEitherAsync(java.util.concurrent.CompletionStage,java.util.function.Consumer)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#acceptEitherAsync(java.util.concurrent.CompletionStage,
     *      java.util.function.Consumer) public java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.acceptEitherAsync(java.util.concurrent.CompletionStage,java.util.
     *      function.Consumer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_acceptEitherAsync_CompletionStage_Consumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#handleAsync(java.util.function.BiFunction, java.util.concurrent.Executor)
     * public <U> java.util.concurrent.CompletableFuture
     * <U> java.util.concurrent.CompletableFuture.handleAsync(java.util.function.BiFunction<? super T,
     * java.lang.Throwable, ? extends U>,java.util.concurrent.Executor)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#handleAsync(java.util.function.BiFunction, java.util.concurrent.Executor)
     * public java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.handleAsync(java.util.function.BiFunction,java.util.concurrent.Executor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#handleAsync(java.util.function.BiFunction,
     *      java.util.concurrent.Executor) public java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.handleAsync(java.util.function.BiFunction,java.util.concurrent.
     *      Executor) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_handleAsync_BiFunction_Executor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#handleAsync(java.util.function.BiFunction) public
     * <U> java.util.concurrent.CompletableFuture
     * <U> java.util.concurrent.CompletableFuture.handleAsync(java.util.function.BiFunction<? super T,
     * java.lang.Throwable, ? extends U>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#handleAsync(java.util.function.BiFunction) public
     * java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.handleAsync(java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#handleAsync(java.util.function.BiFunction) public
     *      java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.handleAsync(java.util.function.BiFunction) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_handleAsync_BiFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#runAfterBoth(java.util.concurrent.CompletionStage, Runnable) public
     * java.util.concurrent.CompletableFuture
     * <java.lang.Void> java.util.concurrent.CompletableFuture.runAfterBoth(java.util.concurrent.CompletionStage
     * <?>,java.lang.Runnable)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#runAfterBoth(java.util.concurrent.CompletionStage, Runnable) public
     * java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.runAfterBoth(java.util.concurrent.CompletionStage,java.lang.Runnable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#runAfterBoth(java.util.concurrent.CompletionStage, Runnable) public
     *      java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.runAfterBoth(java.util.concurrent.CompletionStage,java.lang.Runnable)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_runAfterBoth_CompletionStage_Runnable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#thenAcceptBothAsync(java.util.concurrent.CompletionStage, java.util.function.BiConsumer, java.util.concurrent.Executor)
     * public <U> java.util.concurrent.CompletableFuture<java.lang.Void>
     * java.util.concurrent.CompletableFuture.thenAcceptBothAsync(java.util.concurrent.CompletionStage<? extends
     * U>,java.util.function.BiConsumer<? super T, ? super U>,java.util.concurrent.Executor)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#thenAcceptBothAsync(java.util.concurrent.CompletionStage, java.util.function.BiConsumer, java.util.concurrent.Executor)
     * public java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.thenAcceptBothAsync(java.util.concurrent.CompletionStage,java.util.function.BiConsumer,java.util.concurrent.Executor)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#thenAcceptBothAsync(java.util.concurrent.CompletionStage,
     *      java.util.function.BiConsumer, java.util.concurrent.Executor) public java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.thenAcceptBothAsync(java.util.concurrent.CompletionStage,java.util.
     *      function.BiConsumer,java.util.concurrent.Executor) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_thenAcceptBothAsync_CompletionStage_BiConsumer_Executor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#thenAcceptBothAsync(java.util.concurrent.CompletionStage, java.util.function.BiConsumer)
     * public <U> java.util.concurrent.CompletableFuture<java.lang.Void>
     * java.util.concurrent.CompletableFuture.thenAcceptBothAsync(java.util.concurrent.CompletionStage<? extends
     * U>,java.util.function.BiConsumer<? super T, ? super U>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#thenAcceptBothAsync(java.util.concurrent.CompletionStage, java.util.function.BiConsumer)
     * public java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.thenAcceptBothAsync(java.util.concurrent.CompletionStage,java.util.function.BiConsumer)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#thenAcceptBothAsync(java.util.concurrent.CompletionStage,
     *      java.util.function.BiConsumer) public java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.thenAcceptBothAsync(java.util.concurrent.CompletionStage,java.util.
     *      function.BiConsumer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_thenAcceptBothAsync_CompletionStage_BiConsumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#whenComplete(java.util.function.BiConsumer) public
     * java.util.concurrent.CompletableFuture
     * <T> java.util.concurrent.CompletableFuture.whenComplete(java.util.function.BiConsumer<? super T, ? super
     * java.lang.Throwable>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#whenComplete(java.util.function.BiConsumer) public
     * java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.whenComplete(java.util.function.BiConsumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#whenComplete(java.util.function.BiConsumer) public
     *      java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.whenComplete(java.util.function.BiConsumer) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_whenComplete_BiConsumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#completeExceptionally(Throwable) public boolean
     * java.util.concurrent.CompletableFuture.completeExceptionally(java.lang.Throwable)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#completeExceptionally(Throwable) public boolean
     * java.util.concurrent.CompletableFuture.completeExceptionally(java.lang.Throwable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#completeExceptionally(Throwable) public boolean
     *      java.util.concurrent.CompletableFuture.completeExceptionally(java.lang.Throwable) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_completeExceptionally_Throwable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#isDone() public boolean
     * java.util.concurrent.CompletableFuture.isDone()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#isDone() public boolean
     * java.util.concurrent.CompletableFuture.isDone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#isDone() public boolean
     *      java.util.concurrent.CompletableFuture.isDone() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isDone()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#isCancelled() public boolean
     * java.util.concurrent.CompletableFuture.isCancelled()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#isCancelled() public boolean
     * java.util.concurrent.CompletableFuture.isCancelled()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#isCancelled() public boolean
     *      java.util.concurrent.CompletableFuture.isCancelled() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isCancelled()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#thenAccept(java.util.function.Consumer) public
     * java.util.concurrent.CompletableFuture
     * <java.lang.Void> java.util.concurrent.CompletableFuture.thenAccept(java.util.function.Consumer<? super T>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#thenAccept(java.util.function.Consumer) public
     * java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.thenAccept(java.util.function.Consumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#thenAccept(java.util.function.Consumer) public
     *      java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.thenAccept(java.util.function.Consumer) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_thenAccept_Consumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#toString() public java.lang.String
     * java.util.concurrent.CompletableFuture.toString()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#toString() public java.lang.String
     * java.util.concurrent.CompletableFuture.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#toString() public java.lang.String
     *      java.util.concurrent.CompletableFuture.toString() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.CompletableFuture#complete(Object) public boolean
     * java.util.concurrent.CompletableFuture.complete(T)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#complete(Object) public boolean
     * java.util.concurrent.CompletableFuture.complete(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#complete(Object) public boolean
     *      java.util.concurrent.CompletableFuture.complete(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_complete_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#thenCombine(java.util.concurrent.CompletionStage, java.util.function.BiFunction)
     * public <U,V> java.util.concurrent.CompletableFuture
     * <V> java.util.concurrent.CompletableFuture.thenCombine(java.util.concurrent.CompletionStage<? extends
     * U>,java.util.function.BiFunction<? super T, ? super U, ? extends V>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#thenCombine(java.util.concurrent.CompletionStage, java.util.function.BiFunction)
     * public java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.thenCombine(java.util.concurrent.CompletionStage,java.util.function.BiFunction)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#thenCombine(java.util.concurrent.CompletionStage,
     *      java.util.function.BiFunction) public java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.thenCombine(java.util.concurrent.CompletionStage,java.util.function.
     *      BiFunction) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_thenCombine_CompletionStage_BiFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#runAfterBothAsync(java.util.concurrent.CompletionStage, Runnable, java.util.concurrent.Executor)
     * public java.util.concurrent.CompletableFuture
     * <java.lang.Void> java.util.concurrent.CompletableFuture.runAfterBothAsync(java.util.concurrent.CompletionStage
     * <?>,java.lang.Runnable,java.util.concurrent.Executor)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#runAfterBothAsync(java.util.concurrent.CompletionStage, Runnable, java.util.concurrent.Executor)
     * public java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.runAfterBothAsync(java.util.concurrent.CompletionStage,java.lang.Runnable,java.util.concurrent.Executor)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#runAfterBothAsync(java.util.concurrent.CompletionStage, Runnable,
     *      java.util.concurrent.Executor) public java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.runAfterBothAsync(java.util.concurrent.CompletionStage,java.lang.
     *      Runnable,java.util.concurrent.Executor) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_runAfterBothAsync_CompletionStage_Runnable_Executor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#runAfterBothAsync(java.util.concurrent.CompletionStage, Runnable)
     * public java.util.concurrent.CompletableFuture
     * <java.lang.Void> java.util.concurrent.CompletableFuture.runAfterBothAsync(java.util.concurrent.CompletionStage
     * <?>,java.lang.Runnable)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#runAfterBothAsync(java.util.concurrent.CompletionStage, Runnable)
     * public java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.runAfterBothAsync(java.util.concurrent.CompletionStage,java.lang.Runnable)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#runAfterBothAsync(java.util.concurrent.CompletionStage, Runnable)
     *      public java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.runAfterBothAsync(java.util.concurrent.CompletionStage,java.lang.
     *      Runnable) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_runAfterBothAsync_CompletionStage_Runnable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#obtrudeValue(Object) public void
     * java.util.concurrent.CompletableFuture.obtrudeValue(T)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#obtrudeValue(Object) public void
     * java.util.concurrent.CompletableFuture.obtrudeValue(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#obtrudeValue(Object) public void
     *      java.util.concurrent.CompletableFuture.obtrudeValue(java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_obtrudeValue_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#cancel(boolean) public boolean
     * java.util.concurrent.CompletableFuture.cancel(boolean)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#cancel(boolean) public boolean
     * java.util.concurrent.CompletableFuture.cancel(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#cancel(boolean) public boolean
     *      java.util.concurrent.CompletableFuture.cancel(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_cancel_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#thenAcceptBoth(java.util.concurrent.CompletionStage, java.util.function.BiConsumer)
     * public <U> java.util.concurrent.CompletableFuture
     * <java.lang.Void> java.util.concurrent.CompletableFuture.thenAcceptBoth(java.util.concurrent.CompletionStage<?
     * extends U>,java.util.function.BiConsumer<? super T, ? super U>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#thenAcceptBoth(java.util.concurrent.CompletionStage, java.util.function.BiConsumer)
     * public java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.thenAcceptBoth(java.util.concurrent.CompletionStage,java.util.function.BiConsumer)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#thenAcceptBoth(java.util.concurrent.CompletionStage,
     *      java.util.function.BiConsumer) public java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.thenAcceptBoth(java.util.concurrent.CompletionStage,java.util.
     *      function.BiConsumer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_thenAcceptBoth_CompletionStage_BiConsumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#join() public T
     * java.util.concurrent.CompletableFuture.join()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#join() public java.lang.Object
     * java.util.concurrent.CompletableFuture.join()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#join() public java.lang.Object
     *      java.util.concurrent.CompletableFuture.join() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_join()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#thenApply(java.util.function.Function) public
     * <U> java.util.concurrent.CompletableFuture
     * <U> java.util.concurrent.CompletableFuture.thenApply(java.util.function.Function<? super T, ? extends U>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#thenApply(java.util.function.Function) public
     * java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.thenApply(java.util.function.Function)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#thenApply(java.util.function.Function) public
     *      java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.thenApply(java.util.function.Function) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_thenApply_Function()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#applyToEither(java.util.concurrent.CompletionStage, java.util.function.Function)
     * public <U> java.util.concurrent.CompletableFuture
     * <U> java.util.concurrent.CompletableFuture.applyToEither(java.util.concurrent.CompletionStage<? extends
     * T>,java.util.function.Function<? super T, U>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#applyToEither(java.util.concurrent.CompletionStage, java.util.function.Function)
     * public java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.applyToEither(java.util.concurrent.CompletionStage,java.util.function.Function)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#applyToEither(java.util.concurrent.CompletionStage,
     *      java.util.function.Function) public java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.applyToEither(java.util.concurrent.CompletionStage,java.util.function
     *      .Function) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_applyToEither_CompletionStage_Function()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#isCompletedExceptionally() public boolean
     * java.util.concurrent.CompletableFuture.isCompletedExceptionally()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#isCompletedExceptionally() public boolean
     * java.util.concurrent.CompletableFuture.isCompletedExceptionally()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#isCompletedExceptionally() public boolean
     *      java.util.concurrent.CompletableFuture.isCompletedExceptionally() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isCompletedExceptionally()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#obtrudeException(Throwable) public void
     * java.util.concurrent.CompletableFuture.obtrudeException(java.lang.Throwable)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#obtrudeException(Throwable) public void
     * java.util.concurrent.CompletableFuture.obtrudeException(java.lang.Throwable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#obtrudeException(Throwable) public void
     *      java.util.concurrent.CompletableFuture.obtrudeException(java.lang.Throwable) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_obtrudeException_Throwable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#handle(java.util.function.BiFunction) public
     * <U> java.util.concurrent.CompletableFuture
     * <U> java.util.concurrent.CompletableFuture.handle(java.util.function.BiFunction<? super T, java.lang.Throwable, ?
     * extends U>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#handle(java.util.function.BiFunction) public
     * java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.handle(java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#handle(java.util.function.BiFunction) public
     *      java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.handle(java.util.function.BiFunction) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_handle_BiFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#getNow(Object) public T
     * java.util.concurrent.CompletableFuture.getNow(T)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#getNow(Object) public java.lang.Object
     * java.util.concurrent.CompletableFuture.getNow(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#getNow(Object) public java.lang.Object
     *      java.util.concurrent.CompletableFuture.getNow(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNow_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#exceptionally(java.util.function.Function) public
     * java.util.concurrent.CompletableFuture
     * <T> java.util.concurrent.CompletableFuture.exceptionally(java.util.function.Function<java.lang.Throwable, ?
     * extends T>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#exceptionally(java.util.function.Function) public
     * java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.exceptionally(java.util.function.Function)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#exceptionally(java.util.function.Function) public
     *      java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.exceptionally(java.util.function.Function) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_exceptionally_Function()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#thenCombineAsync(java.util.concurrent.CompletionStage, java.util.function.BiFunction, java.util.concurrent.Executor)
     * public <U,V> java.util.concurrent.CompletableFuture
     * <V> java.util.concurrent.CompletableFuture.thenCombineAsync(java.util.concurrent.CompletionStage<? extends
     * U>,java.util.function.BiFunction<? super T, ? super U, ? extends V>,java.util.concurrent.Executor)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#thenCombineAsync(java.util.concurrent.CompletionStage, java.util.function.BiFunction, java.util.concurrent.Executor)
     * public java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.thenCombineAsync(java.util.concurrent.CompletionStage,java.util.function.BiFunction,java.util.concurrent.Executor)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#thenCombineAsync(java.util.concurrent.CompletionStage,
     *      java.util.function.BiFunction, java.util.concurrent.Executor) public java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.thenCombineAsync(java.util.concurrent.CompletionStage,java.util.
     *      function.BiFunction,java.util.concurrent.Executor) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_thenCombineAsync_CompletionStage_BiFunction_Executor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#thenCombineAsync(java.util.concurrent.CompletionStage, java.util.function.BiFunction)
     * public <U,V> java.util.concurrent.CompletableFuture
     * <V> java.util.concurrent.CompletableFuture.thenCombineAsync(java.util.concurrent.CompletionStage<? extends
     * U>,java.util.function.BiFunction<? super T, ? super U, ? extends V>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#thenCombineAsync(java.util.concurrent.CompletionStage, java.util.function.BiFunction)
     * public java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.thenCombineAsync(java.util.concurrent.CompletionStage,java.util.function.BiFunction)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#thenCombineAsync(java.util.concurrent.CompletionStage,
     *      java.util.function.BiFunction) public java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.thenCombineAsync(java.util.concurrent.CompletionStage,java.util.
     *      function.BiFunction) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_thenCombineAsync_CompletionStage_BiFunction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#thenCompose(java.util.function.Function) public
     * <U> java.util.concurrent.CompletableFuture
     * <U> java.util.concurrent.CompletableFuture.thenCompose(java.util.function.Function<? super T, ? extends
     * java.util.concurrent.CompletionStage<U>>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#thenCompose(java.util.function.Function) public
     * java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.thenCompose(java.util.function.Function)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#thenCompose(java.util.function.Function) public
     *      java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.thenCompose(java.util.function.Function) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_thenCompose_Function()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#thenRun(Runnable) public
     * java.util.concurrent.CompletableFuture
     * <java.lang.Void> java.util.concurrent.CompletableFuture.thenRun(java.lang.Runnable)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#thenRun(Runnable) public
     * java.util.concurrent.CompletableFuture java.util.concurrent.CompletableFuture.thenRun(java.lang.Runnable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#thenRun(Runnable) public java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.thenRun(java.lang.Runnable) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_thenRun_Runnable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#getNumberOfDependents() public int
     * java.util.concurrent.CompletableFuture.getNumberOfDependents()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#getNumberOfDependents() public int
     * java.util.concurrent.CompletableFuture.getNumberOfDependents()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#getNumberOfDependents() public int
     *      java.util.concurrent.CompletableFuture.getNumberOfDependents() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNumberOfDependents()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#thenAcceptAsync(java.util.function.Consumer, java.util.concurrent.Executor)
     * public java.util.concurrent.CompletableFuture
     * <java.lang.Void> java.util.concurrent.CompletableFuture.thenAcceptAsync(java.util.function.Consumer<? super
     * T>,java.util.concurrent.Executor)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#thenAcceptAsync(java.util.function.Consumer, java.util.concurrent.Executor)
     * public java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.thenAcceptAsync(java.util.function.Consumer,java.util.concurrent.Executor)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#thenAcceptAsync(java.util.function.Consumer,
     *      java.util.concurrent.Executor) public java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.thenAcceptAsync(java.util.function.Consumer,java.util.concurrent.
     *      Executor) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_thenAcceptAsync_Consumer_Executor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#thenAcceptAsync(java.util.function.Consumer) public
     * java.util.concurrent.CompletableFuture
     * <java.lang.Void> java.util.concurrent.CompletableFuture.thenAcceptAsync(java.util.function.Consumer<? super T>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#thenAcceptAsync(java.util.function.Consumer) public
     * java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.thenAcceptAsync(java.util.function.Consumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#thenAcceptAsync(java.util.function.Consumer) public
     *      java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.thenAcceptAsync(java.util.function.Consumer) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_thenAcceptAsync_Consumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#thenApplyAsync(java.util.function.Function, java.util.concurrent.Executor)
     * public <U> java.util.concurrent.CompletableFuture
     * <U> java.util.concurrent.CompletableFuture.thenApplyAsync(java.util.function.Function<? super T, ? extends
     * U>,java.util.concurrent.Executor)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#thenApplyAsync(java.util.function.Function, java.util.concurrent.Executor)
     * public java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.thenApplyAsync(java.util.function.Function,java.util.concurrent.Executor)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#thenApplyAsync(java.util.function.Function,
     *      java.util.concurrent.Executor) public java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.thenApplyAsync(java.util.function.Function,java.util.concurrent.
     *      Executor) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_thenApplyAsync_Function_Executor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#thenApplyAsync(java.util.function.Function) public
     * <U> java.util.concurrent.CompletableFuture
     * <U> java.util.concurrent.CompletableFuture.thenApplyAsync(java.util.function.Function<? super T, ? extends U>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#thenApplyAsync(java.util.function.Function) public
     * java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.thenApplyAsync(java.util.function.Function)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#thenApplyAsync(java.util.function.Function) public
     *      java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.thenApplyAsync(java.util.function.Function) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_thenApplyAsync_Function()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#toCompletableFuture() public
     * java.util.concurrent.CompletableFuture<T> java.util.concurrent.CompletableFuture.toCompletableFuture()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#toCompletableFuture() public
     * java.util.concurrent.CompletableFuture java.util.concurrent.CompletableFuture.toCompletableFuture()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#toCompletableFuture() public java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.toCompletableFuture() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toCompletableFuture()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#whenCompleteAsync(java.util.function.BiConsumer)
     * public java.util.concurrent.CompletableFuture
     * <T> java.util.concurrent.CompletableFuture.whenCompleteAsync(java.util.function.BiConsumer<? super T, ? super
     * java.lang.Throwable>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletableFuture#whenCompleteAsync(java.util.function.BiConsumer)
     * public java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.whenCompleteAsync(java.util.function.BiConsumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#whenCompleteAsync(java.util.function.BiConsumer) public
     *      java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.whenCompleteAsync(java.util.function.BiConsumer) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_whenCompleteAsync_BiConsumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#whenCompleteAsync(java.util.function.BiConsumer, java.util.concurrent.Executor)
     * public java.util.concurrent.CompletableFuture
     * <T> java.util.concurrent.CompletableFuture.whenCompleteAsync(java.util.function.BiConsumer<? super T, ? super
     * java.lang.Throwable>,java.util.concurrent.Executor)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletableFuture#whenCompleteAsync(java.util.function.BiConsumer, java.util.concurrent.Executor)
     * public java.util.concurrent.CompletableFuture
     * java.util.concurrent.CompletableFuture.whenCompleteAsync(java.util.function.BiConsumer,java.util.concurrent.Executor)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture#whenCompleteAsync(java.util.function.BiConsumer,
     *      java.util.concurrent.Executor) public java.util.concurrent.CompletableFuture
     *      java.util.concurrent.CompletableFuture.whenCompleteAsync(java.util.function.BiConsumer,java.util.concurrent.
     *      Executor) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_whenCompleteAsync_BiConsumer_Executor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.util.concurrent.CompletableFuture.AsynchronousCompletionTask
     * interface java.util.concurrent.CompletableFuture$AsynchronousCompletionTask}. The complementary j8unit test
     * interface containing the class relevant aspects is
     * {@link CompletableFutureClassTests.AsynchronousCompletionTaskClassTests}.
     * </p>
     *
     * @see java.util.concurrent.CompletableFuture.AsynchronousCompletionTask interface
     *      java.util.concurrent.CompletableFuture$AsynchronousCompletionTask (the hereby targeted class-under-test
     *      class)
     * @see CompletableFutureClassTests.AsynchronousCompletionTaskClassTests
     *      CompletableFutureClassTests.AsynchronousCompletionTaskClassTests (the complementary j8unit test interface
     *      containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface AsynchronousCompletionTaskTests<SUT extends java.util.concurrent.CompletableFuture.AsynchronousCompletionTask>
    extends RepositoryTests<SUT> {

    }

}
