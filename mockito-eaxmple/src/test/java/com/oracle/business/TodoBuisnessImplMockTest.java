package com.oracle.business;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.oracle.data.api.TodoService;
import com.oracle.data.api.TodoServiceStub;

public class TodoBuisnessImplMockTest {

	
	@Test
	public void testRetrieveTodosRelatedToStping_usingAStub() {
		TodoService todoServiceStub = new TodoServiceStub();
		
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToStping("Dummy");
		
		assertEquals(2, filteredTodos.size());
		assertEquals("Learn Spring MVC", filteredTodos.get(0));
		assertEquals("Learn Spring", filteredTodos.get(1));
	}
	
	
	@Test
	public void testRetrieveTodosRelatedToStping_usingAStub2() {
		TodoService todoServiceStub = new TodoServiceStub();
		
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToStping("Dummy1");
		
		assertEquals(0, filteredTodos.size());
	}
	
	

}
