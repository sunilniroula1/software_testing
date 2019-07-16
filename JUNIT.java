package com.sn.softwaretesting;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class PTtest {

	@Test
	public void open_token_stream_test1() {
		Printtokens p= new  Printtokens();
		BufferedReader br=p.open_token_stream("C:\\\\Users\\\\sangi\\\\eclipse-workspace\\\\classify tokens\\\\src\\\\com\\\\sn\\\\softwaretesting\\\\input.txt");
		assertNotNull(br);
		
	
	}
	
	
	
	@Test
	public void open_token_stream_test2() {
		Printtokens p= new  Printtokens();
		BufferedReader br=p.open_token_stream(null);
		assertNotNull(br);
		
	
	}
	

	
	@Test
	public void open_character_token_test1() {
		Printtokens p=new Printtokens();
		BufferedReader br=p.open_character_stream(null);
		assertNotNull(br);
		
		
	}
	
	@Test
	public void open_character_token_test2() {
		Printtokens p=new Printtokens();
		BufferedReader br=p.open_character_stream("C:\\\\Users\\\\sangi\\\\eclipse-workspace\\\\classify tokens\\\\src\\\\com\\\\sn\\\\softwaretesting\\\\input.txt");
		assertNotNull(br);
		
		
	}
	
	@Test
	public void token_type_test1(){
		Printtokens p=new Printtokens();
		int type=p.token_type("and");
		assertEquals(1, type);
		
		
	}
	
	
	
	@Test
	public void token_type_test2(){
		Printtokens p=new Printtokens();
		int type=p.token_type("\\\\");
		assertEquals(0, type);
		
		
	}
	@Test
	public void token_type_test3(){
		Printtokens p=new Printtokens();
		int type=p.token_type("aa");
		assertEquals(3, type);
		
		
	}
	
	@Test
	public void token_type_test4(){
		Printtokens p=new Printtokens();
		int type=p.token_type("[");
		assertEquals(2, type);
		
		
	}
	
	@Test
	public void token_type_test5(){
		Printtokens p=new Printtokens();
		int type=p.token_type("123");
		assertEquals(41, type);
		
		
	}
	
	@Test
	public void token_type_test6(){
		Printtokens p=new Printtokens();
		int type=p.token_type("\"sdf\"");
		assertEquals(42, type);
		
		
	}
	
	@Test
	public void token_type_test7(){
		Printtokens p=new Printtokens();
		int type=p.token_type(";ab");
		assertEquals(5, type);
		
		
	}
	
	
	@Test
	public void token_type_test8(){
		Printtokens p=new Printtokens();
		int type=p.token_type("#a");
		assertEquals(43, type);
		
		
	}
	
	@Test
	public void print_token_test1()
	{
		Printtokens p=new Printtokens();
		int type=p.print_token("and");
		assertEquals(1, type); 
		
		
		
	}
	
	@Test
	public void print_token_test2()
	{
		Printtokens p=new Printtokens();
		int type=p.print_token("::");
		assertEquals(0, type); 
		
		
		
	}
	
	@Test
	public void print_token_test3()
	{
		Printtokens p=new Printtokens();
		int type=p.print_token("[");
		assertEquals(2, type); 
		
		
		
	}
	
	@Test
	public void print_token_test4()
	{
		Printtokens p=new Printtokens();
		int type=p.print_token("aa");
		assertEquals(3, type); 
		
		
		
	}
	
	@Test
	public void print_token_test5()
	{
		Printtokens p=new Printtokens();
		int type=p.print_token("123");
		assertEquals(41, type); 
		
		
		
	}
	
	@Test
	public void print_token_test6()
	{
		Printtokens p=new Printtokens();
		int type=p.print_token("#a");
		assertEquals(43, type); 
		
		
		
	}
	
	@Test
	public void print_token_test7()
	{
		Printtokens p=new Printtokens();
		int type=p.print_token(";ab");
		assertEquals(5, type); 
		
		
		
	}
	
	@Test
	public void print_token_test8()
	{
		Printtokens p=new Printtokens();
		int type=p.print_token("\"ab\"");
		assertEquals(42, type); 
		
		
		
	}
	@Test
	public void is_comment_test1()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_comment(";i");
		assertTrue(true);
		
	}
	
	@Test
	public void is_comment_test2()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_comment("a");
		assertFalse(false);
		
	}
	
	@Test
	public void is_keyword_test1() {
		Printtokens p=new Printtokens();
		boolean type=p.is_keyword("and");
		assertTrue(type);
		
	}
	
	@Test
	public void is_keyword_test2() {
		Printtokens p=new Printtokens();
		boolean type=p.is_keyword("xor");
		assertTrue(type);
		
	}
	
	@Test
	public void is_keyword_test3() {
		Printtokens p=new Printtokens();
		boolean type=p.is_keyword("or");
		assertTrue(type);
		
	}
	
	@Test
	public void is_keyword_test4() {
		Printtokens p=new Printtokens();
		boolean type=p.is_keyword("or");
		assertTrue(type);
		
	}
	
	
	@Test
	public void is_keyword_test5() {
		Printtokens p=new Printtokens();
		boolean type=p.is_keyword("if");
		assertTrue(type);
		
	}
	
	@Test
	public void is_keyword_test6() {
		Printtokens p=new Printtokens();
		boolean type=p.is_keyword("lambda");
		assertTrue(type);
		
	}
	
	@Test
	public void is_keyword_test7() {
		Printtokens p=new Printtokens();
		boolean type=p.is_keyword("=>");
		assertTrue(type);
		
	}
	
	@Test
	public void is_keyword_test8() {
		Printtokens p=new Printtokens();
		boolean type=p.is_keyword("sunil");
		assertFalse(type);
		
	}
	

	
	
	@Test
	public void is_char_constant_test1()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_char_constant("#");
		assertFalse(type);
		
		
		
	}
	
	@Test
	public void is_char_constant_test2()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_char_constant("#a");
		assertTrue(type);
		
		
		
	}
	
	@Test
	public void is_char_constant_test4()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_char_constant("#abc");
		assertFalse(type);
		
		
		
	}
	
	
	@Test
	public void is_char_constant_test3()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_char_constant("a");
		assertFalse(type);
		
		
		
	}
	
	
	@Test
	public void is_num_constant_test1()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_num_constant("1");
		assertTrue(type);
		
		
		
	}
	
	
	@Test
	public void is_num_constant_test2()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_num_constant("12");
		assertTrue(type);
		
		
		
	}
	
	@Test
	public void is_num_constant_test3()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_num_constant("123");
		assertTrue(type);
		
		
		
	}
	
	@Test
	public void is_num_constant_test4()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_num_constant("1234");
		assertTrue(type);
		
		
		
	}
	
	
	@Test
	public void is_num_constant_test5()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_num_constant("a");
		assertFalse(type);
		
		
		
	}
	
	@Test
	public void is_str_constant_test1()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_str_constant("\"asd\"");
		assertTrue(type);
		
		
		
	}
	
	@Test
	public void is_str_constant_test2()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_str_constant("\"123\"");
		assertTrue(type);
		
		
		
	}
	
	@Test
	public void is_str_constant_test3()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_str_constant("abc");
		assertFalse(type);
		
		
		
	}
	
	@Test
	public void is_str_constant_test4()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_str_constant("\"");
		assertTrue(type);
		
		
		
	}
	
	@Test
	public void is_str_constant_test5()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_str_constant("\"abcd\"");
		assertTrue(type);
		
		
		
	}
	
	
	@Test
	public void is_identifier_test1()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_identifier("a");
		assertTrue(type);
		
		
		
	}
	
	@Test
	public void is_identifier_test2()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_identifier("a1");
		assertTrue(type);
		
		
		
	}
	
	@Test
	public void is_identifier_test3()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_identifier("1a");
		assertFalse(type);
		
		
		
	}
	
	@Test
	public void is_identifier_test4()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_identifier("a'1");
		assertFalse(type);
		
		
		
	}
	
	
	
	
	@Test
	public void is_spec_symbol_test1()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_spec_symbol('(');
		assertTrue(type);
		
		
		
	}
	
	@Test
	public void is_spec_symbol_test2()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_spec_symbol(')');
		assertTrue(type);
		
		
		
	}
	
	@Test
	public void is_spec_symbol_test3()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_spec_symbol('[');
		assertTrue(type);
		
		
		
	}
	
	@Test
	public void is_spec_symbol_test4()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_spec_symbol(']');
		assertTrue(type);
		
		
		
	}
	
	
	@Test
	public void is_spec_symbol_test5()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_spec_symbol('/');
		assertFalse(type);
		
		
		
	}
	
	
	@Test
	public void is_spec_symbol_test6()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_spec_symbol(',');
		assertTrue(type);
		
		
		
	}
	
	
	@Test
	public void is_spec_symbol_test7()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_spec_symbol('`');
		assertTrue(type);
		
		
		
	}
	
	@Test
	public void is_spec_symbol_test8()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_spec_symbol('a');
		assertFalse(type);
		
		
		
	}
	
	
	@Test
	public void print_spec_symbol_test1()
	{
		Printtokens p=new Printtokens();
		int type=p.print_spec_symbol("{");
		assertEquals(90, type); 
		
		
		
	}
	
	@Test
	public void print_spec_symbol_test8()
	{
		Printtokens p=new Printtokens();
		int type=p.print_spec_symbol("(");
		assertEquals(32, type); 
		
		
		
	}   
	
	@Test
	public void print_spec_symbol_test2()
	{
		Printtokens p=new Printtokens();
		int type=p.print_spec_symbol(")");
		assertEquals(42, type); 
		
		
		
	}
	
	@Test
	public void print_spec_symbol_test3()
	{
		Printtokens p=new Printtokens();
		int type=p.print_spec_symbol("[");
		assertEquals(52, type); 
		
		
		
	}
	
	@Test
	public void print_spec_symbol_test4()
	{
		Printtokens p=new Printtokens();
		int type=p.print_spec_symbol("]");
		assertEquals(62, type); 
		
		
		
	}
	
	
	@Test
	public void print_spec_symbol_test5()
	{
		Printtokens p=new Printtokens();
		int type=p.print_spec_symbol("'");
		assertEquals(72, type); 
		
		
		
	}
	
	@Test
	public void print_spec_symbol_test6()
	{
		Printtokens p=new Printtokens();
		int type=p.print_spec_symbol("`");
		assertEquals(82, type); 
		
		
		
	}
	
	@Test
	public void print_spec_symbol_test7()
	{
		Printtokens p=new Printtokens();
		int type=p.print_spec_symbol("ab");
		assertEquals(90, type); 
		
		
		
	}
	
	
	
	@Test
	public void is_token_end_test1()
	{ 
		Printtokens p=new Printtokens();
		boolean type=p.is_token_end(1,-1);
		assertTrue(type);
		
		
		
	}
	
	@Test
	public void is_token_end_test2()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_token_end(2,10);
		assertTrue(type);
		
		
		
	}
	
	@Test
	public void is_token_end_test3()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_token_end(1,97);
		assertFalse(type);
		
		
		
	}
	
	@Test
	public void is_token_end_test4()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_token_end(0,47);
		assertFalse(type);
		
		
		
	}
	
	
	@Test
	public void is_token_end_test5()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_token_end(0,59);
		assertTrue(type);
		
		
		
	}
	
	
	@Test
	public void is_token_end_test6()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_token_end(0,10);
		assertTrue(type);
		
		
		
	}
	
	@Test
	public void is_token_end_test7()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_token_end(0,97);
		assertFalse(type);
		
		
		
	}
	
	
	@Test
	public void is_token_end_test8()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_token_end(1,34);
		assertFalse(type);
		
		
		
	}
	
	@Test
	public void is_token_end_test9()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_token_end(1,10);
		assertTrue(type);
		
		
		
	}
	@Test
	public void is_token_end_test10()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_token_end(2,34);
		assertTrue(type);
		
		
		
	}
	
	@Test
	public void is_token_end_test11()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_token_end(2,10);
		assertTrue(type);
		
		
		
	}
	
	
	@Test
	public void is_token_end_test12()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_token_end(0,10);
		assertTrue(type);
		
		
		
	}
	
	@Test
	public void is_token_end_test13()
	{
		Printtokens p=new Printtokens();
		boolean type=p.is_token_end(2,20);
		assertFalse(type);
		
		
		
	}
	
	@Test
	public void get_token_test1()
	{
		Printtokens p=new Printtokens(); 
		FileReader new_file;
		try {
			new_file=new FileReader("C:\\\\\\\\Users\\\\\\\\sangi\\\\\\\\eclipse-workspace\\\\\\\\classify tokens\\\\\\\\src\\\\\\\\com\\\\\\\\sn\\\\\\\\softwaretesting\\\\\\\\char_constant.txt");
			BufferedReader br=new BufferedReader(new_file);
			String type=p.get_token(br);
			assertEquals("#a", type);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
	
	@Test
	public void get_token_test2()
	{
		Printtokens p=new Printtokens(); 
		FileReader new_file;
		try {
			new_file=new FileReader("C:\\\\\\\\Users\\\\\\\\sangi\\\\\\\\eclipse-workspace\\\\\\\\classify tokens\\\\\\\\src\\\\\\\\com\\\\\\\\sn\\\\\\\\softwaretesting\\\\\\\\is_identifier.txt");
			BufferedReader br=new BufferedReader(new_file);
			String type=p.get_token(br);
			assertEquals("aa", type);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
	
	
	@Test
	public void get_token_test3()
	{
		Printtokens p=new Printtokens(); 
		FileReader new_file;
		try {
			new_file=new FileReader("C:\\\\\\\\Users\\\\\\\\sangi\\\\\\\\eclipse-workspace\\\\\\\\classify tokens\\\\\\\\src\\\\\\\\com\\\\\\\\sn\\\\\\\\softwaretesting\\\\\\\\error.txt");
			BufferedReader br=new BufferedReader(new_file);
			String type=p.get_token(br);
			assertEquals("///", type);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
	
	@Test
	public void get_token_test4()
	{
		Printtokens p=new Printtokens(); 
		FileReader new_file;
		try {
			new_file=new FileReader("C:\\\\\\\\Users\\\\\\\\sangi\\\\\\\\eclipse-workspace\\\\\\\\classify tokens\\\\\\\\src\\\\\\\\com\\\\\\\\sn\\\\\\\\softwaretesting\\\\\\\\is_comment.txt");
			BufferedReader br=new BufferedReader(new_file);
			String type=p.get_token(br);
			assertEquals(";a", type);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
	
	
	@Test
	public void get_token_test5()
	{
		Printtokens p=new Printtokens(); 
		FileReader new_file;
		try {
			new_file=new FileReader("C:\\\\\\\\Users\\\\\\\\sangi\\\\\\\\eclipse-workspace\\\\\\\\classify tokens\\\\\\\\src\\\\\\\\com\\\\\\\\sn\\\\\\\\softwaretesting\\\\\\\\spec_symbol.txt");
			BufferedReader br=new BufferedReader(new_file);
			String type=p.get_token(br);
			assertEquals("(", type);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
	
	@Test
	public void get_token_test6()
	{
		Printtokens p=new Printtokens(); 
		FileReader new_file;
		try {
			new_file=new FileReader("C:\\\\\\\\Users\\\\\\\\sangi\\\\\\\\eclipse-workspace\\\\\\\\classify tokens\\\\\\\\src\\\\\\\\com\\\\\\\\sn\\\\\\\\softwaretesting\\\\\\\\is_number.txt");
			BufferedReader br=new BufferedReader(new_file);
			String type=p.get_token(br);
			assertEquals("123", type);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
//	@Test
//	public void main_test1() throws IOException{
//		Printtokens.main(new String[] {});
//		 
//		
//		
//
//	}
	
	
	@Test
	public void main_test2() throws IOException{
		Printtokens.main(new String[] {"C:\\\\Users\\\\sangi\\\\eclipse-workspace\\\\classify tokens\\\\src\\\\com\\\\sn\\\\softwaretesting\\\\input.txt"});
		 
		
		

	}
	
//	@Test
//	public void main_test3() throws IOException{
//		Printtokens.main(new String[] {"C:\\\\Users\\\\sangi\\\\eclipse-workspace\\\\classify tokens\\\\src\\\\com\\\\sn\\\\softwaretesting\\\\input.txt","a","b"});
//		 
//		
//		
//
//	}
	
//	@Test
//	public void main_test3() throws IOException{
//		String [] double_args= {"arg1","arg2"};
//		//Printtokens.main(new String[] {"C:\\\\Users\\\\sangi\\\\eclipse-workspace\\\\classify tokens\\\\src\\\\com\\\\sn\\\\softwaretesting\\\\input.txt"});
//		String type=Printtokens.main(double_args);
//		assertEq
//		
//		
//
//	}
//	
//	
	

	

	

}
