/*class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  
class BabyDog extends Dog{  
void weep(){System.out.println("weeping...");}  
}  
class TestInheritance2{  
public static void main(String args[]){  
BabyDog d=new BabyDog();  
d.weep();  
d.bark();  
d.eat();  
}*/  


class monkey
{

void jump()
{
System.out.println("jumping");

}
/*void bite()
{
System.out.println("biting");
}*/}
class human extends monkey
{
void eat()
{
	System.out.println("eating");
}
void sleep()
{
	System.out.println("sleeping");
}
}

class monk
{
public static void main(String args[])
{
 human h =new human();
 h.eat();
 h.sleep();
 /*monkey m=new monkey();
 m.bite();
 m.jump();*/
 }}
