package Traingle_Casification_class_1.Traingle_Casification_class_1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


import static org.junit.Assert.*;
import  org.junit.Test;

public class AppTest {

	TriangleClassifier triangle = new TriangleClassifier();

	@Test

	public void C1FC2FC3FC4F(){
		int a = 3;
		int b = 4;
		int c=7;
		TriangleClassifier.classifyTriangle(a,b,c);
		String expected =Triangle_Types.Nottriangle.toString();
		String result = TriangleClassifier.get_type().toString();

		assertEquals(expected, result.toString());
	}
	@Test
	public void C1FC2FC3FC4T(){
		int a = 4;
		int b = 2;
		int c=2;
		TriangleClassifier.classifyTriangle(a,b,c);
		String expected =Triangle_Types.Nottriangle.toString();
		String result = TriangleClassifier.get_type().toString();
		assertEquals(expected, result.toString());
	}

	@Test
	public void C1FC2FC3TC4F(){
		int a = 2;
		int b = 5;
		int c = 2;
		TriangleClassifier.classifyTriangle(a,b,c);
		String expected =Triangle_Types.Nottriangle.toString();
		String result = TriangleClassifier.get_type().toString();
		assertEquals(expected, result.toString());
	}
	@Test
	public void C1FC2FC3TC4T(){
		int a = 2;
		int b = 5;
		int c = 2;
		TriangleClassifier.classifyTriangle(a,b,c);
		String expected =Triangle_Types.ERROR.toString();
		String result = TriangleClassifier.get_type().toString();
		assertEquals(expected, result.toString());
	}
	@Test
	public void C1FC2TC3FC4F(){
		int a = 2;
		int b = 2;
		int c = 4;
		TriangleClassifier.classifyTriangle(a,b,c);
		String expected =Triangle_Types.Nottriangle.toString();
		String result = TriangleClassifier.get_type().toString();
		assertEquals(expected, result.toString());
	}
	@Test
	public void C1FC2TC3FC4T(){
		int a = 3;
		int b = 3;
		int c = 6;
		TriangleClassifier.classifyTriangle(a,b,c);
		String expected =Triangle_Types.ERROR.toString();
		String result = TriangleClassifier.get_type().toString();
		assertEquals(expected, result.toString());

	}
	@Test
	public void C1FC2TC3TC4F(){
		int a = 4;
		int b = 4;
		int c = 8;
		TriangleClassifier.classifyTriangle(a,b,c);
		String expected =Triangle_Types.ERROR.toString();
		String result = TriangleClassifier.get_type().toString();
		assertEquals(expected, result.toString());

	}
	@Test
	public void C1FC2TC3Tc4T(){
		int a = 5;
		int b = 5;
		int c = 10;
		TriangleClassifier.classifyTriangle(a,b,c);
		String expected =Triangle_Types.ERROR.toString();
		String result = TriangleClassifier.get_type().toString();
		assertEquals(expected, result.toString());
	}  
	@Test
	public void C1TC2FC3FC4F(){
		int a = 3;
		int b = 5;
		int c = 4;
		TriangleClassifier.classifyTriangle(a,b,c);
		String expected =Triangle_Types.Scalene.toString();
		String result = TriangleClassifier.get_type().toString();
		assertEquals(expected, result.toString());
	} 
	@Test
	public void C1TC2FC3FC3T(){
		int a = 4;
		int b = 5;
		int c = 5;
		TriangleClassifier.classifyTriangle(a,b,c);
		String expected =Triangle_Types.isosceles.toString();
		String result = TriangleClassifier.get_type().toString();
		assertEquals(expected, result.toString());
	} 
	@Test
	public void C1TC2FC3TC4F(){
		int a = 5;
		int b = 4;
		int c = 5;
		TriangleClassifier.classifyTriangle(a,b,c);
		String expected =Triangle_Types.isosceles.toString();
		String result = TriangleClassifier.get_type().toString();
		assertEquals(expected, result.toString());
	}  
	@Test
	public void C1TC2FC3TC4T(){
		int a = 5;
		int b = 6;
		int c = 5;
		TriangleClassifier.classifyTriangle(a,b,c);
		String expected =Triangle_Types.ERROR.toString();
		String result = TriangleClassifier.get_type().toString();
		assertEquals(expected, result.toString());
	}  
	@Test
	public void C1TC2FC3TC3T(){
		int a = 4;
		int b = 5;
		int c = 5;
		TriangleClassifier.classifyTriangle(a,b,c);
		String expected =Triangle_Types.isosceles.toString();
		String result = TriangleClassifier.get_type().toString();
		assertEquals(expected, result.toString());
	}  
	@Test
	public void C1TC2TC3FC4F(){
		int a = 7;
		int b = 7;
		int c = 5;
		TriangleClassifier.classifyTriangle(a,b,c);
		String expected =Triangle_Types.isosceles.toString();
		String result = TriangleClassifier.get_type().toString();
		assertEquals(expected, result.toString());
	} 
	@Test
	public void C1TC2TC3FC4T(){
		int a = 5;
		int b = 5;
		int c = 5;
		TriangleClassifier.classifyTriangle(a,b,c);
		String expected =Triangle_Types.ERROR.toString();
		String result = TriangleClassifier.get_type().toString();
		assertEquals(expected, result.toString());
	} 
	@Test
	public void C1TC2TC3TC4F(){
		int a = 6;
		int b = 6;
		int c = 6;
		TriangleClassifier.classifyTriangle(a,b,c);
		String expected =Triangle_Types.ERROR.toString();
		String result = TriangleClassifier.get_type().toString();
		assertEquals(expected, result.toString());
	} 
	@Test
	public void C1TC2TC3TC4T(){
		int a = 8;
		int b = 8;
		int c = 8;
		TriangleClassifier.classifyTriangle(a,b,c);
		String expected =Triangle_Types.equilateral.toString();
		String result = TriangleClassifier.get_type().toString();
		assertEquals(expected, result.toString());
	} 
	
	
}