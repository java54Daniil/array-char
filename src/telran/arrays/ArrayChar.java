package telran.arrays;

public class ArrayChar {
	private char[] array;

	public ArrayChar(char[] array) {
		this.array = array;
	}

	char[] getArray() {
		return array;
	}

	public int compareTo(ArrayChar another) {
		int length = Math.min(this.array.length, another.array.length);
		int index = 0;
		while (index < length && this.array[index] == another.array[index]) {
			index++;
		}
		return index == length ? this.array.length - another.array.length : this.array[index] - another.array[index];
	}
	

	public int indexOf(char character) {
		int index = 0;
		while (index < array.length && array[index] != character) {
			index++;
		}
		return index == array.length ? -1 : index;
	}

	public int lastIndexOf(char characther) {
		int index = array.length - 1;
		while (index >=0 && array[index] != characther) {
			index--;
		}
		return index;
	}
//HW
	public int compareToIgnporeCase(ArrayChar another) {
		int length = Math.min(this.array.length, another.array.length);
		int index = 0;
		while (index < length && Character.toLowerCase(this.array[index]) == Character.toLowerCase(another.array[index])) {
			index++;
		}
		return index == length ? this.array.length - another.array.length : Character.toLowerCase(this.array[index]) - Character.toLowerCase(another.array[index]);
	}
	public int count(char characther) {
		int count = 0;
		int i = 0;
		while (i < array.length) {
			if (array[i] == characther) {
				count++;
			}
			i++;
		}
		return count;
	}

	public boolean contains(char characther) {
		int i = 0;
		boolean answer = false;
		while (i < array.length) {
			if (array[i] == characther) {
				answer = true;
			}
			i++;
		}
		return answer;
	}

	public boolean equals(ArrayChar another) {
		boolean answer = true;
		int i = 0;
		while (i < array.length) {
			if (this.array[i] != another.array[i] || this.array.length != another.array.length) {
				answer = false;
				break;
			}
			i++;
		}

		return answer;
	}
	public boolean  equalsIgnoreCase(ArrayChar another) {
		boolean answer = true;
		int i = 0;
		while (i < array.length) {
			if (Character.toLowerCase(this.array[i]) != Character.toLowerCase(another.array[i]) || this.array.length != another.array.length) {
				answer = false;
				break;
			}
			i++;
		}

		return answer;
	}

}
