package proton.inject.internal.util;

import android.util.SparseArray;

public class SparseClassArray<T> {
	private SparseArray<T> mArray = new SparseArray<T>();

	public void put(Class<?> key, T value) {
		mArray.put(key.hashCode(), value);
	}

	public T get(Class<?> key) {
		return mArray.get(key.hashCode());
	}
}