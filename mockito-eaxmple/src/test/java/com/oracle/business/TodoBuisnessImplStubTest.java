package com.oracle.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.oracle.data.api.TodoService;

public class TodoBuisnessImplStubTest {

	
	@Test
	public void testRetrieveTodosRelatedToStping_usingAMock() {
		TodoService todoServiceMock = mock(TodoService.class);
		
		List<String> todo = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
		
		when(todoServiceMock.retrieveTodos("dummy")).thenReturn(todo);
		
		when(todoServiceMock.retrieveTodos("dummy1")).thenReturn(Arrays.asList("1","2"));
		
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToStping("dummy");
		
		assertEquals(2, filteredTodos.size());
	}
	
	@Test
	public void testRetrieveTodosRelatedToStping_withEmptyList() {
		TodoService todoServiceMock = mock(TodoService.class);
		
		List<String> todo = Arrays.asList();
		
		when(todoServiceMock.retrieveTodos("dummy")).thenReturn(todo);
		
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToStping("dummy");
		
		assertEquals(0, filteredTodos.size());
	}
	
	

}
