package telran.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.arrays.ArrayChar;

class ArrayCharTest {

	@Test
	void compareToTest() {
		char[] ar1 = {'1', '2', '3'}; //"123"
		char[] ar2 = {'9'};
		char[] ar3 = {'1', '2', '3'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);
		assertEquals(8, arrayChar2.compareTo(arrayChar1));
		assertEquals(-8, arrayChar1.compareTo(arrayChar2));
		assertEquals(1, new ArrayChar(new char[] {'a','a'})
				.compareTo(new ArrayChar(new char[] {'a'})));
		assertEquals(-1, new ArrayChar(new char[] {'a'})
				.compareTo(new ArrayChar(new char[] {'a', 'a'})));
		assertEquals(0, arrayChar1.compareTo(arrayChar3));
	}
	@Test
	void indexOfTest () {
		char[] ar1 = {'1','2','3','2'};//"123"
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		assertEquals(1, arrayChar1.indexOf('2'));
		assertEquals(-1,arrayChar1.indexOf('9'));
	}
	@Test 
	void lastIndexOfTest () {
		char[] ar1 = {'1','2','3','2'};//"123"
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		assertEquals(3, arrayChar1.lastIndexOf('2'));
		assertEquals(-1,arrayChar1.lastIndexOf('9'));
	}
	//HW
	@Test
	void compareToIgnporeCase() {
		char[] ar1 = {'H', 'E', 'L', 'L', 'O'}; //"123"
		char[] ar2 = {'h', 'e', 'l', 'l', 'o'};
		char[] ar3 = {'W', 'o', 'r', 'l', 'd'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);
		assertEquals(0, arrayChar2.compareToIgnporeCase(arrayChar1));
		assertEquals(0, arrayChar1.compareToIgnporeCase(arrayChar2));
		assertEquals(-15, arrayChar1.compareToIgnporeCase(arrayChar3));
	}
	
	@Test
	public void countTest() {
		char[] ar1 = {'1','2','3','2'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		assertEquals(2, arrayChar1.count('2'));
		assertEquals(1, arrayChar1.count('1'));
		assertEquals(0, arrayChar1.count('7'));
	}
	@Test
	public void containsTest() {
		char[] ar1 = {'1','2','3','2'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		assertTrue(arrayChar1.contains('2'));
		assertFalse(arrayChar1.contains('7'));
	}
	@Test 
	public void equalsTest() {
		char[] ar1 = {'1','2','3','2'};
		char[] ar2 = {'1','2','3','2'};
		char[] ar3 = {'1','1','1','1'};
		char[] ar4 = {'1','2','3'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);
		ArrayChar arrayChar4 = new ArrayChar(ar4);
		assertTrue(arrayChar1.equals(arrayChar2));
		assertFalse(arrayChar1.equals(arrayChar3));
		assertFalse(arrayChar1.equals(arrayChar4));
	}
	@Test 
	public void equalsIgnoreCaseTest() {
		char[] ar1 = {'H','E','L','L','O'};
		char[] ar2 = {'h','e','l','l','o'};
		char[] ar3 = {'w','h','y','n','o'};
		char[] ar4 = {'h','e','l','l'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);
		ArrayChar arrayChar4 = new ArrayChar(ar4);
		assertTrue(arrayChar1.equalsIgnoreCase(arrayChar2));
		assertFalse(arrayChar2.equalsIgnoreCase(arrayChar3));
		assertFalse(arrayChar1.equalsIgnoreCase(arrayChar4));
		
	}

}
