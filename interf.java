import java.io.*;
import java.util.*;
import java.lang.*;
interface one
{
public void read();
}
interface two
{
public void write();
}
interface three extends one,two
{
public void read();

}
class child implements three
{
	public void read()
	{
		System.out.println("read");
	}
	public void write()
	
	{
		System.out.println("write");
	}
}

class interf{
	public static void main(String args[])
	{
		child c= new child();
		c.read();
		c.write();
		c.read();
}}
		
		

		