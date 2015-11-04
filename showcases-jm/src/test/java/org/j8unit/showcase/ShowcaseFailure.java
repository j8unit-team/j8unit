package org.j8unit.showcase;

/**
 * Marker interface to tag intentional showcase failures (enabling JUnit exclusion). If, otherwise, not excluded the
 * maven build will abort by failing tests.
 */
public abstract interface ShowcaseFailure {
}
