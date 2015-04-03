package de.informaticum.j8junit.repository.java.util;

import java.util.List;

@FunctionalInterface
public abstract interface ListTests<L extends List<E>, E>
extends CollectionTests<L, E> {
}
