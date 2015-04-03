package de.informaticum.j8junit.repository.java.util;

import java.util.List;

@FunctionalInterface
public abstract interface UnmodifiableListTests<L extends List<E>, E>
extends UnmodifiableCollectionTests<L, E>, ListTests<L, E> {
}
