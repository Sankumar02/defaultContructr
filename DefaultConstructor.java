package com.Class.org;

//Constructor is a block of codes similar to the method. It is called when an instance of the class
//is created. At the time of calling constructor, memory for the object is allocated in the memory.
//It is a special type of method which is used to initialize the object.
//Every time an object is created using the new() keyword, at least one constructor is called.
//It calls a default constructor if there is no constructor available in the class. In such case, Java compiler provides a default constructor by default.

public class DefaultConstructor {
	
	//DefaultConstructor- When user didn't provide any values , compiler will automatically provides one and it will be in class file and
	//cannot be see by us. It is used to provide default values to the object like null, 0 etc..., depending on the type.
      
	//Now i will create a String class and initialize it and also i didn't assigned any value for this.
	String Default_constructor;
	
	//Now i will create a int Data type and initialize it and also i didn't assigned any value for this.
	int defaultConstructor;
	
	public static void main(String[] args) {
		
		//Create an object for the class.
		DefaultConstructor constructors=new DefaultConstructor();
		//In this already the class is calling the function, So only constructor is called as special kind of function.
		
		System.out.println(constructors.Default_constructor);
		System.out.println(constructors.defaultConstructor);
		
		//Output: For String class will 'null' and for int data type will be '0'.


	}

}