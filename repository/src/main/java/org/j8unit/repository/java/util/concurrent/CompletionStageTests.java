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
 * non-{@code static} methods) of {@linkplain java.util.concurrent.CompletionStage interface
 * java.util.concurrent.CompletionStage}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link CompletionStageClassTests}.
 * </p>
 *
 * @see java.util.concurrent.CompletionStage interface java.util.concurrent.CompletionStage (the hereby targeted
 *      class-under-test class)
 * @see CompletionStageClassTests CompletionStageClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CompletionStageTests<SUT extends java.util.concurrent.CompletionStage<T>, T>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletionStage#thenCombine(java.util.concurrent.CompletionStage, java.util.function.BiFunction)
     * public abstract <U,V> java.util.concurrent.CompletionStage
     * <V> java.util.concurrent.CompletionStage.thenCombine(java.util.concurrent.CompletionStage<? extends
     * U>,java.util.function.BiFunction<? super T, ? super U, ? extends V>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletionStage#thenCombine(java.util.concurrent.CompletionStage, java.util.function.BiFunction)
     * public abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.thenCombine(java.util.concurrent.CompletionStage,java.util.function.BiFunction)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#thenCombine(java.util.concurrent.CompletionStage,
     *      java.util.function.BiFunction) public abstract java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.thenCombine(java.util.concurrent.CompletionStage,java.util.function.
     *      BiFunction) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * {@link java.util.concurrent.CompletionStage#thenAcceptAsync(java.util.function.Consumer, java.util.concurrent.Executor)
     * public abstract java.util.concurrent.CompletionStage
     * <java.lang.Void> java.util.concurrent.CompletionStage.thenAcceptAsync(java.util.function.Consumer<? super
     * T>,java.util.concurrent.Executor)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletionStage#thenAcceptAsync(java.util.function.Consumer, java.util.concurrent.Executor)
     * public abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.thenAcceptAsync(java.util.function.Consumer,java.util.concurrent.Executor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#thenAcceptAsync(java.util.function.Consumer,
     *      java.util.concurrent.Executor) public abstract java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.thenAcceptAsync(java.util.function.Consumer,java.util.concurrent.
     *      Executor) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.CompletionStage#thenAcceptAsync(java.util.function.Consumer) public
     * abstract java.util.concurrent.CompletionStage
     * <java.lang.Void> java.util.concurrent.CompletionStage.thenAcceptAsync(java.util.function.Consumer<? super T>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletionStage#thenAcceptAsync(java.util.function.Consumer) public
     * abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.thenAcceptAsync(java.util.function.Consumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#thenAcceptAsync(java.util.function.Consumer) public abstract
     *      java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.thenAcceptAsync(java.util.function.Consumer) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * {@link java.util.concurrent.CompletionStage#thenApplyAsync(java.util.function.Function, java.util.concurrent.Executor)
     * public abstract <U> java.util.concurrent.CompletionStage
     * <U> java.util.concurrent.CompletionStage.thenApplyAsync(java.util.function.Function<? super T, ? extends
     * U>,java.util.concurrent.Executor)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletionStage#thenApplyAsync(java.util.function.Function, java.util.concurrent.Executor)
     * public abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.thenApplyAsync(java.util.function.Function,java.util.concurrent.Executor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#thenApplyAsync(java.util.function.Function,
     *      java.util.concurrent.Executor) public abstract java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.thenApplyAsync(java.util.function.Function,java.util.concurrent.
     *      Executor) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.CompletionStage#thenApplyAsync(java.util.function.Function) public
     * abstract <U> java.util.concurrent.CompletionStage
     * <U> java.util.concurrent.CompletionStage.thenApplyAsync(java.util.function.Function<? super T, ? extends U>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletionStage#thenApplyAsync(java.util.function.Function) public
     * abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.thenApplyAsync(java.util.function.Function)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#thenApplyAsync(java.util.function.Function) public abstract
     *      java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.thenApplyAsync(java.util.function.Function) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.CompletionStage#toCompletableFuture() public abstract
     * java.util.concurrent.CompletableFuture<T> java.util.concurrent.CompletionStage.toCompletableFuture()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletionStage#toCompletableFuture() public abstract
     * java.util.concurrent.CompletableFuture java.util.concurrent.CompletionStage.toCompletableFuture()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#toCompletableFuture() public abstract
     *      java.util.concurrent.CompletableFuture java.util.concurrent.CompletionStage.toCompletableFuture() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for
     * {@link java.util.concurrent.CompletionStage#whenCompleteAsync(java.util.function.BiConsumer, java.util.concurrent.Executor)
     * public abstract java.util.concurrent.CompletionStage
     * <T> java.util.concurrent.CompletionStage.whenCompleteAsync(java.util.function.BiConsumer<? super T, ? super
     * java.lang.Throwable>,java.util.concurrent.Executor)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletionStage#whenCompleteAsync(java.util.function.BiConsumer, java.util.concurrent.Executor)
     * public abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.whenCompleteAsync(java.util.function.BiConsumer,java.util.concurrent.Executor)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#whenCompleteAsync(java.util.function.BiConsumer,
     *      java.util.concurrent.Executor) public abstract java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.whenCompleteAsync(java.util.function.BiConsumer,java.util.concurrent.
     *      Executor) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.CompletionStage#whenCompleteAsync(java.util.function.BiConsumer)
     * public abstract java.util.concurrent.CompletionStage
     * <T> java.util.concurrent.CompletionStage.whenCompleteAsync(java.util.function.BiConsumer<? super T, ? super
     * java.lang.Throwable>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletionStage#whenCompleteAsync(java.util.function.BiConsumer)
     * public abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.whenCompleteAsync(java.util.function.BiConsumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#whenCompleteAsync(java.util.function.BiConsumer) public abstract
     *      java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.whenCompleteAsync(java.util.function.BiConsumer) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.CompletionStage#thenRun(Runnable) public abstract
     * java.util.concurrent.CompletionStage
     * <java.lang.Void> java.util.concurrent.CompletionStage.thenRun(java.lang.Runnable)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletionStage#thenRun(Runnable) public abstract
     * java.util.concurrent.CompletionStage java.util.concurrent.CompletionStage.thenRun(java.lang.Runnable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#thenRun(Runnable) public abstract java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.thenRun(java.lang.Runnable) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.CompletionStage#thenAccept(java.util.function.Consumer) public
     * abstract java.util.concurrent.CompletionStage
     * <java.lang.Void> java.util.concurrent.CompletionStage.thenAccept(java.util.function.Consumer<? super T>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletionStage#thenAccept(java.util.function.Consumer) public
     * abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.thenAccept(java.util.function.Consumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#thenAccept(java.util.function.Consumer) public abstract
     *      java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.thenAccept(java.util.function.Consumer) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.CompletionStage#handle(java.util.function.BiFunction) public abstract
     * <U> java.util.concurrent.CompletionStage
     * <U> java.util.concurrent.CompletionStage.handle(java.util.function.BiFunction<? super T, java.lang.Throwable, ?
     * extends U>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletionStage#handle(java.util.function.BiFunction) public abstract
     * java.util.concurrent.CompletionStage java.util.concurrent.CompletionStage.handle(java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#handle(java.util.function.BiFunction) public abstract
     *      java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.handle(java.util.function.BiFunction) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for
     * {@link java.util.concurrent.CompletionStage#handleAsync(java.util.function.BiFunction, java.util.concurrent.Executor)
     * public abstract <U> java.util.concurrent.CompletionStage
     * <U> java.util.concurrent.CompletionStage.handleAsync(java.util.function.BiFunction<? super T,
     * java.lang.Throwable, ? extends U>,java.util.concurrent.Executor)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletionStage#handleAsync(java.util.function.BiFunction, java.util.concurrent.Executor)
     * public abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.handleAsync(java.util.function.BiFunction,java.util.concurrent.Executor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#handleAsync(java.util.function.BiFunction,
     *      java.util.concurrent.Executor) public abstract java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.handleAsync(java.util.function.BiFunction,java.util.concurrent.
     *      Executor) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.CompletionStage#handleAsync(java.util.function.BiFunction) public
     * abstract <U> java.util.concurrent.CompletionStage
     * <U> java.util.concurrent.CompletionStage.handleAsync(java.util.function.BiFunction<? super T,
     * java.lang.Throwable, ? extends U>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletionStage#handleAsync(java.util.function.BiFunction) public
     * abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.handleAsync(java.util.function.BiFunction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#handleAsync(java.util.function.BiFunction) public abstract
     *      java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.handleAsync(java.util.function.BiFunction) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.CompletionStage#exceptionally(java.util.function.Function) public
     * abstract java.util.concurrent.CompletionStage
     * <T> java.util.concurrent.CompletionStage.exceptionally(java.util.function.Function<java.lang.Throwable, ? extends
     * T>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletionStage#exceptionally(java.util.function.Function) public
     * abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.exceptionally(java.util.function.Function)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#exceptionally(java.util.function.Function) public abstract
     *      java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.exceptionally(java.util.function.Function) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * {@link java.util.concurrent.CompletionStage#runAfterBoth(java.util.concurrent.CompletionStage, Runnable) public
     * abstract java.util.concurrent.CompletionStage
     * <java.lang.Void> java.util.concurrent.CompletionStage.runAfterBoth(java.util.concurrent.CompletionStage
     * <?>,java.lang.Runnable)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletionStage#runAfterBoth(java.util.concurrent.CompletionStage, Runnable) public
     * abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.runAfterBoth(java.util.concurrent.CompletionStage,java.lang.Runnable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#runAfterBoth(java.util.concurrent.CompletionStage, Runnable) public
     *      abstract java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.runAfterBoth(java.util.concurrent.CompletionStage,java.lang.Runnable)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * {@link java.util.concurrent.CompletionStage#thenAcceptBothAsync(java.util.concurrent.CompletionStage, java.util.function.BiConsumer)
     * public abstract <U> java.util.concurrent.CompletionStage
     * <java.lang.Void> java.util.concurrent.CompletionStage.thenAcceptBothAsync(java.util.concurrent.CompletionStage<?
     * extends U>,java.util.function.BiConsumer<? super T, ? super U>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletionStage#thenAcceptBothAsync(java.util.concurrent.CompletionStage, java.util.function.BiConsumer)
     * public abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.thenAcceptBothAsync(java.util.concurrent.CompletionStage,java.util.function.BiConsumer)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#thenAcceptBothAsync(java.util.concurrent.CompletionStage,
     *      java.util.function.BiConsumer) public abstract java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.thenAcceptBothAsync(java.util.concurrent.CompletionStage,java.util.
     *      function.BiConsumer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for
     * {@link java.util.concurrent.CompletionStage#thenAcceptBothAsync(java.util.concurrent.CompletionStage, java.util.function.BiConsumer, java.util.concurrent.Executor)
     * public abstract <U> java.util.concurrent.CompletionStage
     * <java.lang.Void> java.util.concurrent.CompletionStage.thenAcceptBothAsync(java.util.concurrent.CompletionStage<?
     * extends U>,java.util.function.BiConsumer<? super T, ? super U>,java.util.concurrent.Executor)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletionStage#thenAcceptBothAsync(java.util.concurrent.CompletionStage, java.util.function.BiConsumer, java.util.concurrent.Executor)
     * public abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.thenAcceptBothAsync(java.util.concurrent.CompletionStage,java.util.function.BiConsumer,java.util.concurrent.Executor)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#thenAcceptBothAsync(java.util.concurrent.CompletionStage,
     *      java.util.function.BiConsumer, java.util.concurrent.Executor) public abstract
     *      java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.thenAcceptBothAsync(java.util.concurrent.CompletionStage,java.util.
     *      function.BiConsumer,java.util.concurrent.Executor) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * {@link java.util.concurrent.CompletionStage#thenCombineAsync(java.util.concurrent.CompletionStage, java.util.function.BiFunction)
     * public abstract <U,V> java.util.concurrent.CompletionStage
     * <V> java.util.concurrent.CompletionStage.thenCombineAsync(java.util.concurrent.CompletionStage<? extends
     * U>,java.util.function.BiFunction<? super T, ? super U, ? extends V>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletionStage#thenCombineAsync(java.util.concurrent.CompletionStage, java.util.function.BiFunction)
     * public abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.thenCombineAsync(java.util.concurrent.CompletionStage,java.util.function.BiFunction)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#thenCombineAsync(java.util.concurrent.CompletionStage,
     *      java.util.function.BiFunction) public abstract java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.thenCombineAsync(java.util.concurrent.CompletionStage,java.util.
     *      function.BiFunction) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for
     * {@link java.util.concurrent.CompletionStage#thenCombineAsync(java.util.concurrent.CompletionStage, java.util.function.BiFunction, java.util.concurrent.Executor)
     * public abstract <U,V> java.util.concurrent.CompletionStage
     * <V> java.util.concurrent.CompletionStage.thenCombineAsync(java.util.concurrent.CompletionStage<? extends
     * U>,java.util.function.BiFunction<? super T, ? super U, ? extends V>,java.util.concurrent.Executor)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletionStage#thenCombineAsync(java.util.concurrent.CompletionStage, java.util.function.BiFunction, java.util.concurrent.Executor)
     * public abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.thenCombineAsync(java.util.concurrent.CompletionStage,java.util.function.BiFunction,java.util.concurrent.Executor)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#thenCombineAsync(java.util.concurrent.CompletionStage,
     *      java.util.function.BiFunction, java.util.concurrent.Executor) public abstract
     *      java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.thenCombineAsync(java.util.concurrent.CompletionStage,java.util.
     *      function.BiFunction,java.util.concurrent.Executor) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.CompletionStage#whenComplete(java.util.function.BiConsumer) public
     * abstract java.util.concurrent.CompletionStage
     * <T> java.util.concurrent.CompletionStage.whenComplete(java.util.function.BiConsumer<? super T, ? super
     * java.lang.Throwable>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletionStage#whenComplete(java.util.function.BiConsumer) public
     * abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.whenComplete(java.util.function.BiConsumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#whenComplete(java.util.function.BiConsumer) public abstract
     *      java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.whenComplete(java.util.function.BiConsumer) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.CompletionStage#thenCompose(java.util.function.Function) public
     * abstract <U> java.util.concurrent.CompletionStage
     * <U> java.util.concurrent.CompletionStage.thenCompose(java.util.function.Function<? super T, ? extends
     * java.util.concurrent.CompletionStage<U>>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletionStage#thenCompose(java.util.function.Function) public
     * abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.thenCompose(java.util.function.Function)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#thenCompose(java.util.function.Function) public abstract
     *      java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.thenCompose(java.util.function.Function) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for
     * {@link java.util.concurrent.CompletionStage#acceptEither(java.util.concurrent.CompletionStage, java.util.function.Consumer)
     * public abstract java.util.concurrent.CompletionStage
     * <java.lang.Void> java.util.concurrent.CompletionStage.acceptEither(java.util.concurrent.CompletionStage<? extends
     * T>,java.util.function.Consumer<? super T>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletionStage#acceptEither(java.util.concurrent.CompletionStage, java.util.function.Consumer)
     * public abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.acceptEither(java.util.concurrent.CompletionStage,java.util.function.Consumer)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#acceptEither(java.util.concurrent.CompletionStage,
     *      java.util.function.Consumer) public abstract java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.acceptEither(java.util.concurrent.CompletionStage,java.util.function.
     *      Consumer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * {@link java.util.concurrent.CompletionStage#runAfterEitherAsync(java.util.concurrent.CompletionStage, Runnable)
     * public abstract java.util.concurrent.CompletionStage
     * <java.lang.Void> java.util.concurrent.CompletionStage.runAfterEitherAsync(java.util.concurrent.CompletionStage
     * <?>,java.lang.Runnable)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletionStage#runAfterEitherAsync(java.util.concurrent.CompletionStage, Runnable)
     * public abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.runAfterEitherAsync(java.util.concurrent.CompletionStage,java.lang.Runnable)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#runAfterEitherAsync(java.util.concurrent.CompletionStage, Runnable)
     *      public abstract java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.runAfterEitherAsync(java.util.concurrent.CompletionStage,java.lang.
     *      Runnable) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * {@link java.util.concurrent.CompletionStage#runAfterEitherAsync(java.util.concurrent.CompletionStage, Runnable, java.util.concurrent.Executor)
     * public abstract java.util.concurrent.CompletionStage
     * <java.lang.Void> java.util.concurrent.CompletionStage.runAfterEitherAsync(java.util.concurrent.CompletionStage
     * <?>,java.lang.Runnable,java.util.concurrent.Executor)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletionStage#runAfterEitherAsync(java.util.concurrent.CompletionStage, Runnable, java.util.concurrent.Executor)
     * public abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.runAfterEitherAsync(java.util.concurrent.CompletionStage,java.lang.Runnable,java.util.concurrent.Executor)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#runAfterEitherAsync(java.util.concurrent.CompletionStage, Runnable,
     *      java.util.concurrent.Executor) public abstract java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.runAfterEitherAsync(java.util.concurrent.CompletionStage,java.lang.
     *      Runnable,java.util.concurrent.Executor) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * {@link java.util.concurrent.CompletionStage#acceptEitherAsync(java.util.concurrent.CompletionStage, java.util.function.Consumer)
     * public abstract java.util.concurrent.CompletionStage
     * <java.lang.Void> java.util.concurrent.CompletionStage.acceptEitherAsync(java.util.concurrent.CompletionStage<?
     * extends T>,java.util.function.Consumer<? super T>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletionStage#acceptEitherAsync(java.util.concurrent.CompletionStage, java.util.function.Consumer)
     * public abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.acceptEitherAsync(java.util.concurrent.CompletionStage,java.util.function.Consumer)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#acceptEitherAsync(java.util.concurrent.CompletionStage,
     *      java.util.function.Consumer) public abstract java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.acceptEitherAsync(java.util.concurrent.CompletionStage,java.util.
     *      function.Consumer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * {@link java.util.concurrent.CompletionStage#acceptEitherAsync(java.util.concurrent.CompletionStage, java.util.function.Consumer, java.util.concurrent.Executor)
     * public abstract java.util.concurrent.CompletionStage
     * <java.lang.Void> java.util.concurrent.CompletionStage.acceptEitherAsync(java.util.concurrent.CompletionStage<?
     * extends T>,java.util.function.Consumer<? super T>,java.util.concurrent.Executor)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletionStage#acceptEitherAsync(java.util.concurrent.CompletionStage, java.util.function.Consumer, java.util.concurrent.Executor)
     * public abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.acceptEitherAsync(java.util.concurrent.CompletionStage,java.util.function.Consumer,java.util.concurrent.Executor)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#acceptEitherAsync(java.util.concurrent.CompletionStage,
     *      java.util.function.Consumer, java.util.concurrent.Executor) public abstract
     *      java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.acceptEitherAsync(java.util.concurrent.CompletionStage,java.util.
     *      function.Consumer,java.util.concurrent.Executor) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * {@link java.util.concurrent.CompletionStage#applyToEitherAsync(java.util.concurrent.CompletionStage, java.util.function.Function)
     * public abstract <U> java.util.concurrent.CompletionStage
     * <U> java.util.concurrent.CompletionStage.applyToEitherAsync(java.util.concurrent.CompletionStage<? extends
     * T>,java.util.function.Function<? super T, U>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletionStage#applyToEitherAsync(java.util.concurrent.CompletionStage, java.util.function.Function)
     * public abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.applyToEitherAsync(java.util.concurrent.CompletionStage,java.util.function.Function)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#applyToEitherAsync(java.util.concurrent.CompletionStage,
     *      java.util.function.Function) public abstract java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.applyToEitherAsync(java.util.concurrent.CompletionStage,java.util.
     *      function.Function) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * {@link java.util.concurrent.CompletionStage#applyToEitherAsync(java.util.concurrent.CompletionStage, java.util.function.Function, java.util.concurrent.Executor)
     * public abstract <U> java.util.concurrent.CompletionStage
     * <U> java.util.concurrent.CompletionStage.applyToEitherAsync(java.util.concurrent.CompletionStage<? extends
     * T>,java.util.function.Function<? super T, U>,java.util.concurrent.Executor)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletionStage#applyToEitherAsync(java.util.concurrent.CompletionStage, java.util.function.Function, java.util.concurrent.Executor)
     * public abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.applyToEitherAsync(java.util.concurrent.CompletionStage,java.util.function.Function,java.util.concurrent.Executor)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#applyToEitherAsync(java.util.concurrent.CompletionStage,
     *      java.util.function.Function, java.util.concurrent.Executor) public abstract
     *      java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.applyToEitherAsync(java.util.concurrent.CompletionStage,java.util.
     *      function.Function,java.util.concurrent.Executor) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * {@link java.util.concurrent.CompletionStage#thenAcceptBoth(java.util.concurrent.CompletionStage, java.util.function.BiConsumer)
     * public abstract <U> java.util.concurrent.CompletionStage
     * <java.lang.Void> java.util.concurrent.CompletionStage.thenAcceptBoth(java.util.concurrent.CompletionStage<?
     * extends U>,java.util.function.BiConsumer<? super T, ? super U>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletionStage#thenAcceptBoth(java.util.concurrent.CompletionStage, java.util.function.BiConsumer)
     * public abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.thenAcceptBoth(java.util.concurrent.CompletionStage,java.util.function.BiConsumer)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#thenAcceptBoth(java.util.concurrent.CompletionStage,
     *      java.util.function.BiConsumer) public abstract java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.thenAcceptBoth(java.util.concurrent.CompletionStage,java.util.function.
     *      BiConsumer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.CompletionStage#thenApply(java.util.function.Function) public
     * abstract <U> java.util.concurrent.CompletionStage
     * <U> java.util.concurrent.CompletionStage.thenApply(java.util.function.Function<? super T, ? extends U>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletionStage#thenApply(java.util.function.Function) public
     * abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.thenApply(java.util.function.Function)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#thenApply(java.util.function.Function) public abstract
     *      java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.thenApply(java.util.function.Function) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.CompletionStage#thenComposeAsync(java.util.function.Function) public
     * abstract <U> java.util.concurrent.CompletionStage
     * <U> java.util.concurrent.CompletionStage.thenComposeAsync(java.util.function.Function<? super T, ? extends
     * java.util.concurrent.CompletionStage<U>>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletionStage#thenComposeAsync(java.util.function.Function) public
     * abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.thenComposeAsync(java.util.function.Function)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#thenComposeAsync(java.util.function.Function) public abstract
     *      java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.thenComposeAsync(java.util.function.Function) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * {@link java.util.concurrent.CompletionStage#thenComposeAsync(java.util.function.Function, java.util.concurrent.Executor)
     * public abstract <U> java.util.concurrent.CompletionStage
     * <U> java.util.concurrent.CompletionStage.thenComposeAsync(java.util.function.Function<? super T, ? extends
     * java.util.concurrent.CompletionStage<U>>,java.util.concurrent.Executor)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletionStage#thenComposeAsync(java.util.function.Function, java.util.concurrent.Executor)
     * public abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.thenComposeAsync(java.util.function.Function,java.util.concurrent.Executor)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#thenComposeAsync(java.util.function.Function,
     *      java.util.concurrent.Executor) public abstract java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.thenComposeAsync(java.util.function.Function,java.util.concurrent.
     *      Executor) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for
     * {@link java.util.concurrent.CompletionStage#applyToEither(java.util.concurrent.CompletionStage, java.util.function.Function)
     * public abstract <U> java.util.concurrent.CompletionStage
     * <U> java.util.concurrent.CompletionStage.applyToEither(java.util.concurrent.CompletionStage<? extends
     * T>,java.util.function.Function<? super T, U>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletionStage#applyToEither(java.util.concurrent.CompletionStage, java.util.function.Function)
     * public abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.applyToEither(java.util.concurrent.CompletionStage,java.util.function.Function)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#applyToEither(java.util.concurrent.CompletionStage,
     *      java.util.function.Function) public abstract java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.applyToEither(java.util.concurrent.CompletionStage,java.util.function.
     *      Function) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for
     * {@link java.util.concurrent.CompletionStage#runAfterEither(java.util.concurrent.CompletionStage, Runnable) public
     * abstract java.util.concurrent.CompletionStage
     * <java.lang.Void> java.util.concurrent.CompletionStage.runAfterEither(java.util.concurrent.CompletionStage
     * <?>,java.lang.Runnable)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletionStage#runAfterEither(java.util.concurrent.CompletionStage, Runnable) public
     * abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.runAfterEither(java.util.concurrent.CompletionStage,java.lang.Runnable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#runAfterEither(java.util.concurrent.CompletionStage, Runnable) public
     *      abstract java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.runAfterEither(java.util.concurrent.CompletionStage,java.lang.Runnable)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.CompletionStage#thenRunAsync(Runnable, java.util.concurrent.Executor)
     * public abstract java.util.concurrent.CompletionStage<java.lang.Void>
     * java.util.concurrent.CompletionStage.thenRunAsync(java.lang.Runnable,java.util.concurrent.Executor)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletionStage#thenRunAsync(Runnable, java.util.concurrent.Executor)
     * public abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.thenRunAsync(java.lang.Runnable,java.util.concurrent.Executor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#thenRunAsync(Runnable, java.util.concurrent.Executor) public abstract
     *      java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.thenRunAsync(java.lang.Runnable,java.util.concurrent.Executor) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.CompletionStage#thenRunAsync(Runnable) public abstract
     * java.util.concurrent.CompletionStage
     * <java.lang.Void> java.util.concurrent.CompletionStage.thenRunAsync(java.lang.Runnable)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.CompletionStage#thenRunAsync(Runnable) public abstract
     * java.util.concurrent.CompletionStage java.util.concurrent.CompletionStage.thenRunAsync(java.lang.Runnable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#thenRunAsync(Runnable) public abstract
     *      java.util.concurrent.CompletionStage java.util.concurrent.CompletionStage.thenRunAsync(java.lang.Runnable)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * {@link java.util.concurrent.CompletionStage#runAfterBothAsync(java.util.concurrent.CompletionStage, Runnable, java.util.concurrent.Executor)
     * public abstract java.util.concurrent.CompletionStage
     * <java.lang.Void> java.util.concurrent.CompletionStage.runAfterBothAsync(java.util.concurrent.CompletionStage
     * <?>,java.lang.Runnable,java.util.concurrent.Executor)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletionStage#runAfterBothAsync(java.util.concurrent.CompletionStage, Runnable, java.util.concurrent.Executor)
     * public abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.runAfterBothAsync(java.util.concurrent.CompletionStage,java.lang.Runnable,java.util.concurrent.Executor)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#runAfterBothAsync(java.util.concurrent.CompletionStage, Runnable,
     *      java.util.concurrent.Executor) public abstract java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.runAfterBothAsync(java.util.concurrent.CompletionStage,java.lang.
     *      Runnable,java.util.concurrent.Executor) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * {@link java.util.concurrent.CompletionStage#runAfterBothAsync(java.util.concurrent.CompletionStage, Runnable)
     * public abstract java.util.concurrent.CompletionStage
     * <java.lang.Void> java.util.concurrent.CompletionStage.runAfterBothAsync(java.util.concurrent.CompletionStage
     * <?>,java.lang.Runnable)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.CompletionStage#runAfterBothAsync(java.util.concurrent.CompletionStage, Runnable)
     * public abstract java.util.concurrent.CompletionStage
     * java.util.concurrent.CompletionStage.runAfterBothAsync(java.util.concurrent.CompletionStage,java.lang.Runnable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.CompletionStage#runAfterBothAsync(java.util.concurrent.CompletionStage, Runnable)
     *      public abstract java.util.concurrent.CompletionStage
     *      java.util.concurrent.CompletionStage.runAfterBothAsync(java.util.concurrent.CompletionStage,java.lang.
     *      Runnable) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_runAfterBothAsync_CompletionStage_Runnable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
