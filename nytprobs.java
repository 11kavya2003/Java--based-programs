1.)

import java.io.*;
import java.util.*;
class pb233
{
public static void main(String args[])
{

Scanner s=new Scanner(System.in);

int a[]=new int[6];

int i,j,ans=0,aa=0,bb=0;

for(i=0;i<a.length;i++)
{
a[i]=s.nextInt();
}

for(i=0;i<a.length;i++)
{
for(j=0;j<a.length;j++)
{
if(a[i]+a[j]==2020)
{
aa=a[i];
bb=a[j];
}

}
}
System.out.println(aa);
System.out.println(bb);

ans=aa*bb;
System.out.println("answer is: "+ ans);
}
}

2.)


import java.util.*;

class prob4
{
public static void main(String args[])
{
int n,i;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of masses");

n=sc.nextInt();

int m[]=new int[n];


System.out.println("Enter mass ");


for(i=0;i<n;i++)
{
  
m[i]=sc.nextInt();  

}



int fuel=0;
for(i=0;i<n;i++)
{
  
m[i]/=3;
m[i]-=2;  
 fuel+=m[i];
}





System.out.println("The Fuel required is "+fuel);


}
}


3..)
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n],max=0;
		for(int i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		        int ans=(a[i]-1)*(a[j]-1);
		        if(ans>=max)
		        {
		            max=ans;
		        }
		    }
		}
		System.out.println(max);
	}
}

4.)
import java.util.*;

class night
{
public static void main(String args[])
{

int n,i,j,s;
int count=1;
Scanner sc=new Scanner(System.in);
System.out.println("Array size A");

n=sc.nextInt();

int a[]=new int[n];

System.out.println("Array elements A");
for(i=0;i<n;i++)
{

a[i]=sc.nextInt();  

}



int b[]=new int[n];

System.out.println("Array elements B");
for(i=0;i<n;i++)
{

b[i]=sc.nextInt();  

}
int c[]=new int[n];


for(i=0;i<n;i++)
{
if(count==1)
{
s=(a[i]*b[i]);

c[i]=s+a[i];

count++;
}

else if(count==2)
{
s=(a[i]*b[i]);

c[i]=s-a[i];
count++;
}

else if(count==3)
{
s=(a[i]*b[i]);

c[i]=s;
count=1;
}
else
{

}


}

for(i=0;i<n;i++)
{
System.out.print(c[i]+" ");


}
System.out.println(" ");



for(i=0;i<n;i++)
{
if(c[i]<10)
{

System.out.print("S ");

}
else
{

System.out.print("D ");

}

}



int d[]=new int[n];

for(i=0;i<n;i++)
{

d[i]=b[i]%a[i];

}
System.out.println(" ");



for(i=0;i<n;i++)
{

System.out.print(d[i]+" ");

}
System.out.println(" ");


for(i=0;i<n;i++)
{
if(d[i]==0)
System.out.print("N ");

else if(d[i]%2==0)
System.out.print("E ");
else
System.out.print("O ");

}

}
}

5.)
class night1
{
public static void main(String args[])
{

int n,i,j,s=0,min,max;
int count=1;
Scanner sc=new Scanner(System.in);
System.out.println("Array size A");

n=sc.nextInt();

int a[]=new int[n];

System.out.println("Array elements A");
for(i=0;i<n;i++)
{

a[i]=sc.nextInt(); 
 
s+=a[i];
}


max=min=a[0];


for(i=0;i<n;i++)
{

if(a[i]<min)
{
min=a[i];
}
if(a[i]>max)
{
max=a[i];
}




}


System.out.println("Max is "+(s-min));

System.out.println("min is "+(s-max));
}}

6.)
import java.util.*;

class night2
{
public static void main(String args[])
{

int n,i,j,p,max=0;
int count=1;
Scanner sc=new Scanner(System.in);
System.out.println("Array size A");

n=sc.nextInt();

int a[]=new int[n];

System.out.println("Array elements A");
for(i=0;i<n;i++)
{

a[i]=sc.nextInt();  

}




for(i=0;i<n;i++)
{for(j=i+1;j<n;j++)
{



p=(a[i]-1)*(a[j]-1);

if(max<p)
{
max=p;
}



}
}





System.out.println(max);
}
}

7.)
import java.io.*;
import java.util.Scanner;

class Ni243{
public static void main(String args[]){
int n,i,rem;
Scanner s=new Scanner(System.in);
	n=s.nextInt();
	int a[]=new int[n];
	int b[]=new int[n];
	int c[]=new int[n];
	
	System.out.println("Enter the elements of a:");
	for(i=0;i<n;i++){
	a[i]=s.nextInt();}
	System.out.println("Enter the elements of b:");
	for(i=0;i<n;i++){
	b[i]=s.nextInt();}
	
	
	for(i=0;i<n;i++){
		if(i==0 || i==3){
		c[i]=((a[i]*b[i])+a[i]);}
		
		else if(i==1 || i==4){
		c[i]=((a[i]*b[i])-a[i]);}
		
		else if(i==2 || i==5){
		c[i]=(a[i]*b[i]);}
		
		else{
		}
	System.out.print(c[i]+" ");}
	
	System.out.println();
	
	for(i=0;i<n;i++){
		if(c[i]>9){
		System.out.print("S ");}
			else{
				System.out.print("D ");
			}
	System.out.println();}
	
	for(i=0;i<n;i++){
		rem=b[i]%a[i];
		System.out.print(rem+" ");
		}
		System.out.println();
	for(i=0;i<n;i++){
	    rem=b[i]%a[i];
		if(rem==0){
		System.out.print("N ");}
		else if(rem==1){
			System.out.print("O ");}
		else if(rem==2){
		System.out.print("E ");}
			else{
			}
		}
			
			
	
}}

8.)
import java.util.*;

class main
{

public static void main(String args[])
{


bank A=new bankA();
A.getbalance();

bank B=new bankA();
B.getbalance();


bank C=new bankA();
C.getbalance();






}}




abstract class bank
{

abstract void getbalance();


}


class bankA extends bank
{

void getbalance()
{

System.out.println("Money deposited in bankA is $1000");

}


}

class bankB extends bank
{

void getbalance()
{

System.out.println("Money deposited in bankB is $1500");

}


}

class bankC extends bank
{

void getbalance()
{

System.out.println("Money deposited in bankC is $2000");

}


}


9.)


import java.io.*;
import java.util.*;
class eve271
{
public static void main(String args[])
{
int i,add=0,add1=0,sub=0,sub1=0,mut=0,mut1=0;
Scanner s=new Scanner(System.in);
int num=s.nextInt();

int arr[]=new int[num];
int brr[]=new int[num];

for(i=0;i<num;i++)
{
arr[i]=s.nextInt();
}


for(i=0;i<num;i++)
{
brr[i]=s.nextInt();
}


for(i=0;i<num;i++)
{
add=arr[0]+brr[0];
add1=arr[1]+brr[1];
sub=arr[0]-brr[0];
sub1=arr[1]-brr[1];
mut=(arr[0]*brr[0])-(arr[1]*brr[1]);
mut1=(arr[0]*brr[1])+(arr[1]*brr[0]);
}
System.out.printf("add %d + %d i \n",add,add1);
System.out.printf("sub %d + %d i \n",sub,sub1);
System.out.printf("mul %d + %d i \n",mut,mut1);


}}

10.)

class Emp

{

String Name;

int Year;

String Address;

Emp(String nam,int years, String addr)

{

 Name=nam;

 Year=years;

 Address=addr;

     }

void Sam()

{

   

 System.out.println(Name+ "        " +Year + "         "     +Address);                                          

}

void Robert()

{

   

     System.out.println(Name+ "     " +Year + "         "     +Address);                                          

}

void John()

{

 System.out.println(Name+ "    "+Year + "       "     +Address);                                          

}

}

class Employee

{

public static void main(String args[])

{

 System.out.println("Name" +   "  Year of Joining     " + "Address" );

 Emp e=new Emp("Sam", 2000, "68D-WallsStreet");

 e.Sam();

 Emp e1=new Emp("Robert", 1994, "64C-WallsStreet");

 e1.Robert();

 Emp e2=new Emp("John", 2002, "70F-WallsStreet");

 e2.Sam();

}

}

11.)
class Superclass
{
int age;
Superclass(int age)
{
this.age=age;
}
public void getAge()
{
System.out.println("value is "+age);
}
}

class Subclass extends Superclass
{
Subclass(int age)
{
super(age);
}



public static void main(String args[])
{
Subclass s=new Subclass(24);
s.getAge();
}
}

12.)
import java.io.*;
import java.util.*;



class Quadrilarea
{
public static void main(String args[])
{
System.out.println("enter the number");
Scanner s=new Scanner(System.in);
int num=s.nextInt();


int x1=s.nextInt();
int y1=s.nextInt();

int x2=s.nextInt();
int y2=s.nextInt();

int x3=s.nextInt();
int y3=s.nextInt();

int x4=s.nextInt();
int y4=s.nextInt();



int a=x2-x1;
System.out.println("side 1 is:"+a);

int b=y3-y2;
System.out.println("side 2 is:"+b);

int c=x3-x4;
System.out.println("side 3 is:"+c);

int d=y4-y1;
System.out.println("side 4 is:"+d);


switch(num)
{
case 1:
int rec=a*b;
System.out.println("Area of Rectangle is:"+rec);
break;

case 2:
int sq=a*a;
System.out.println("Area of Square is:"+sq);
break;

case 3:
int tro=(a+c)/2;
int tt=tro*d;
System.out.println("Area of Trop is:"+tt);
break;

case 4:
int par=a*d;
System.out.println("Area of Parlleo is:"+par);
break;
}



}}

13.)
import java.io.*;
import java.util.*;
class frequency
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int cx=0,cy=0,cz=0;
System.out.println("Enter the string");
String a=sc.nextLine();
char b[]=a.toCharArray();
for(int i=0;i<b.length;i++)
{
if(b[i]=='x')
{
cx++;
}
else if(b[i]=='y')
{
cy++;
}
else if(b[i]=='z')
{
cz++;
}
}
if(cx==cz && cx==cy && cz==cy)
{
System.out.println("Yes");
}
else if(cy==cz && cx<=cy && cx<=cz)
{
System.out.println("Yes");
}
else if(cx==cz && (cx+cz)==cy)
{
System.out.println("Yes");
}
else
{
System.out.println("No");
}
}
}


14.)

import java.util.Scanner;

public class p3 {
    public static void sortDesc(char chars[], int counts[]) {
        int n = chars.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (counts[i] < counts[j]) {
                    int temp = counts[i];
                    counts[i] = counts[j];
                    counts[j] = temp;
                    char ch = chars[i];
                    chars[i] = chars[j];
                    chars[j] = ch;
                    j = i;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int d = scan.nextInt();
        int size = str.length();
        String elements = "";
        for (int i = 0; i < size; i++) {
            if (!elements.contains(str.charAt(i) + "")) {
                elements += str.charAt(i);
            }
        }
        char chars[] = elements.toCharArray();
        int counts[] = new int[elements.length()];
        for (int i = 0; i < elements.length(); i++) {
            int count = 0;
            for (int j = 0; j < size; j++) {
                if (chars[i] == str.charAt(j))
                    count++;
            }
            counts[i] = count;
        }
        int n = chars.length;
        if(n >= d){
            sortDesc(chars, counts);
            boolean flag = true;
            while (flag) {
                sortDesc(chars, counts);
                for (int i = 0; i < n-1; i++) {
                    if (counts[i] == counts[i + 1]) {
                        if (chars[i] > chars[i + 1]) {
                            int temp = counts[i];
                            counts[i] = counts[i+1];
                            counts[i+1] = temp;
                            char ch = chars[i];
                            chars[i] = chars[i+1];
                            chars[i+1] = ch;
                        }
                    }
                }
                for (int i = 0; i < d; i++) {
                    if (counts[i] == 0) {
                        flag = false;
                        break;
                    }
                    System.out.print(chars[i]);
                    counts[i]--;
                }
            }
        }
        else
            System.out.println(" Cannot be rearranged ");
    }
}