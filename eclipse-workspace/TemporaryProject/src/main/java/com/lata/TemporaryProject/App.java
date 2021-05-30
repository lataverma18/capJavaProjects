package com.lata.TemporaryProject;

/**
 * Hello world!
 *
 */
public class App 
{
	static int sum(int a,int b)
	{
		return a+b;
	}
	
	static int sub(int a,int b)
	{
		return a-b;
	}
	
	static int mul(int a,int b)
	{
		return a*b;
	}
	static int div(int a,int b)
	{
		return a/b;
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(App.sum(10,2));
        System.out.println(App.sub(5,2));
        System.out.println(App.mul(7,2));
        System.out.println(App.div(8,2));
    }
}
