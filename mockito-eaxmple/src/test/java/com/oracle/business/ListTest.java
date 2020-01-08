package com.oracle.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void lestMockListSizeMethod() {
		
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2);
		
		assertEquals(2, listMock.size());
	}
	
	@Test
	public void lestMockListSize_ReturnMultipleValues() {
		
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2).thenReturn(3);
		
		assertEquals(2, listMock.size());
		assertEquals(3, listMock.size());
	}
	
	@Test
	public void lestMockListGet() {
		
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("Oracle");
		
		when(listMock.get(anyInt())).thenReturn("Oracle");
		
		assertEquals("Oracle", listMock.get(0));
		assertEquals("Oracle", listMock.get(1));
	}
	
	@Test(expected=RuntimeException.class)
	public void lestMockList_throwException(){
		
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("Oracle");
		
		when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something"));
		listMock.get(0);
		
	}

}
