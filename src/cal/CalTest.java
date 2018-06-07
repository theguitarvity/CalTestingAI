package cal;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;

public class CalTest {

	@Test
	void testFirstOfMounth() {
		Cal cal = new Cal();
		assertEquals(6, cal.firstOfMonth(02, 1997));
	}
	
	@Test
	void testFirstOfMounth2() {
		Cal cal = new Cal();
		assertEquals(6, cal.firstOfMonth(03, 2008));
	}
	
	@Test
	void testFirstOfMounth4() {
		Cal cal = new Cal();
		assertNotEquals(1, cal.firstOfMonth(3, 1657));
	}
	@Test
	void testFirstOfMounth3() {
		Cal cal = new Cal();
		assertEquals(0, cal.firstOfMonth(10,1752));
	}
	@Test	
	void testNumberOfDaysSet1752() {
		Cal cal = new Cal();
		assertEquals(19, cal.numberOfDays(9, 1752));
	}
	@Test
	void testIsLeap() {
		Cal cal = new Cal();
		assertEquals(true, cal.isLeap(2008));
	}
	
	@Test
	void testeJan() {
		Cal cal = new Cal();
		assertEquals(4, cal.jan1(1998));
	}
	
	@Test 	
	void testNotFirstOfMounth() {
		Cal cal = new Cal();
		assertNotSame(7, cal.firstOfMonth(1, 1998));
	}
	
	@Test
	void testNumberOfDayFeb() {
		Cal cal = new Cal();
		assertEquals(28, cal.numberOfDays(2, 2009));
	}
	
	@Test
	void testNumberOfDaysFebLeapYear() {
		Cal cal = new Cal();
		assertEquals(29, cal.numberOfDays(2, 2008));
	}

	@Test
	void testIsNotLeap() {
		Cal cal = new Cal();
		assertNotEquals(true, cal.isLeap(2010));
	}
	
	@Test
	void testLastOfYear() {
		Cal cal = new Cal();
		assertSame(31, cal.numberOfDays(12, 2019));
	}
	
	@Test
	void testFirstWeekDayJan() {
		Cal cal = new Cal();
		assertEquals(1, cal.jan1(2018));
	}
	
	@Test
	
	void testArrayLeap() {
		Cal cal = new Cal();
		boolean[] years = {cal.isLeap(2008), cal.isLeap(2012), cal.isLeap(2004), cal.isLeap(2016)};
		boolean[] res = {true, true, true, true};
		assertArrayEquals(res, years);
	}
	@Test
	void testMain() {
		String[] args = {"2", "2008"};
		Cal.main(args);
		
	}
	@Test
	void testMain2(){
		String[] args = {"2008"};
		Cal.main(args);
		String[] args2 = {""};
		Cal.main(args2);
	}
	@Test
	void testMain3() {
		String[] args = new String[0];
		Cal.main(args);
	}
	
	@Test
	void testMain4(){
		String[] argv = {"13","-1"};
		Cal.main(argv);
		
		
		
	}
	
	@Test
	void invalidTest() {
		Cal cal = new Cal();
		String expected = "       1  2 14 15 16\n17 18 19 20 21 22 23\n24 25 26 27 28 29 30";
		//cal.cal(0, 1752);
		assertEquals(expected, cal.cal(2,19));
		
	}
	@Test
	void catchOnTry() {
		Cal cal = new Cal();
		String[] args = {"0xlok44977dnkdendied", "89000000000000009999", "edhudhe"};
		cal.main(args);
	}
	@Test
	void testNumberOf2000() {
		Cal cal = new Cal();
		assertEquals(29, cal.numberOfDays(2, 2000));
		assertNotEquals(29, cal.numberOfDays(2, 2100));
	}
	
	@Test
	void testNegativeYear() {
		String[] args = {"-1998"};
		Cal.main(args);
	}
}