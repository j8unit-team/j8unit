package org.j8unit.repository.categories;

/**
 * <p>
 * Marker interface to mark <em>SHOULD</em> requirements.
 *
 * For example,
 * <q>for any non-{@code null} reference value {@code x}, <code>x.{@link Object#equals(Object) equals}(null)</code>
 * <em>should</em> return {@code false}.</q>
 * </p>
 *
 * <p>
 * In result, your code might fail some of the tests provided by the <em>J8Unit Test Interface Repository</em>. In order
 * to prevent failing test runs, these test methods must be accordingly categorised to
 * <a href="https://github.com/junit-team/junit/wiki/Categories">category based enable exclusion</a>.
 * </p>
 *
 * @author Stefan Gasterst&auml;dt (SGA)
 */
public abstract interface Should {
}
