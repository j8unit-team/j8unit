package org.j8unit.repository.java.net;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.net.ResponseCache class java.net.ResponseCache}, containing all instance relevant test
 * methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.net.ResponseCacheClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ResponseCacheTests<SUT extends java.net.ResponseCache>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.net.ResponseCache#get(java.net.URI,java.lang.String,java.util.Map) public abstract
     * java.net.CacheResponse java.net.ResponseCache.get(java.net.URI,java.lang.String,java.util.Map) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_URI_String_Map()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.ResponseCache#put(java.net.URI,java.net.URLConnection) public abstract
     * java.net.CacheRequest java.net.ResponseCache.put(java.net.URI,java.net.URLConnection) throws java.io.IOException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_put_URI_URLConnection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
