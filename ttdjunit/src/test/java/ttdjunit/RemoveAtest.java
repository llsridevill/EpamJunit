package ttdjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAtest {
	
	RemoveA removea;
	
	@BeforeEach
	void setUp()
	{
		removea=new RemoveA();
	}

	@Test
	void test2char2a() {
		assertEquals("",removea.remove("AA"));
	}
	
	@Test
	void test2char1a() {
		assertEquals("B",removea.remove("AB"));
	}
	
	@Test
	void test2char0a() {
		assertEquals("BC",removea.remove("BC"));
	}
	
	@Test
	void testnchar() {
		assertEquals("BAA",removea.remove("AABAA"));
	}
	
	@Test
	void testnchar0a() {
		assertEquals("JDKJD",removea.remove("JDKJD"));
	}
	
	void testempty() {
		assertEquals("",removea.remove(""));
	}
	

}
