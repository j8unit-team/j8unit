package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.Observable class java.util.Observable}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link ObservableClassTests}.
 * </p>
 *
 * @see java.util.Observable class java.util.Observable (the hereby targeted class-under-test class)
 * @see ObservableClassTests ObservableClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ObservableTests<SUT extends java.util.Observable>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.Observable#notifyObservers(Object) public void
     * java.util.Observable.notifyObservers(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.Observable#notifyObservers(Object) public void
     * java.util.Observable.notifyObservers(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Observable#notifyObservers(Object) public void
     *      java.util.Observable.notifyObservers(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_notifyObservers_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Observable#notifyObservers() public void java.util.Observable.notifyObservers()}
     * .
     *
     * <p>
     * Test method for {@link java.util.Observable#notifyObservers() public void java.util.Observable.notifyObservers()}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Observable#notifyObservers() public void java.util.Observable.notifyObservers() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_notifyObservers()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Observable#countObservers() public synchronized int
     * java.util.Observable.countObservers()}.
     *
     * <p>
     * Test method for {@link java.util.Observable#countObservers() public synchronized int
     * java.util.Observable.countObservers()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Observable#countObservers() public synchronized int java.util.Observable.countObservers() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_countObservers()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Observable#deleteObserver(java.util.Observer) public synchronized void
     * java.util.Observable.deleteObserver(java.util.Observer)}.
     *
     * <p>
     * Test method for {@link java.util.Observable#deleteObserver(java.util.Observer) public synchronized void
     * java.util.Observable.deleteObserver(java.util.Observer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Observable#deleteObserver(java.util.Observer) public synchronized void
     *      java.util.Observable.deleteObserver(java.util.Observer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_deleteObserver_Observer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Observable#hasChanged() public synchronized boolean
     * java.util.Observable.hasChanged()}.
     *
     * <p>
     * Test method for {@link java.util.Observable#hasChanged() public synchronized boolean
     * java.util.Observable.hasChanged()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Observable#hasChanged() public synchronized boolean java.util.Observable.hasChanged() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hasChanged()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Observable#deleteObservers() public synchronized void
     * java.util.Observable.deleteObservers()}.
     *
     * <p>
     * Test method for {@link java.util.Observable#deleteObservers() public synchronized void
     * java.util.Observable.deleteObservers()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Observable#deleteObservers() public synchronized void java.util.Observable.deleteObservers() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_deleteObservers()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Observable#addObserver(java.util.Observer) public synchronized void
     * java.util.Observable.addObserver(java.util.Observer)}.
     *
     * <p>
     * Test method for {@link java.util.Observable#addObserver(java.util.Observer) public synchronized void
     * java.util.Observable.addObserver(java.util.Observer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Observable#addObserver(java.util.Observer) public synchronized void
     *      java.util.Observable.addObserver(java.util.Observer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addObserver_Observer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
