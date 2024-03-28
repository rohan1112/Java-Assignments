package Developer_Generic;

public class Q02_Generic<T> {

	T value;

	/**
	 * @return the value
	 */
	public T getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(T value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "MyClass [value=" + value + "]";
	}

}
