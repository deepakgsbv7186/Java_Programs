interface a{
void m();
}
interface b{
void m();
}
class example1 implements a
{
public void m(){
System.out.println("Hello first");
}
}
class example2 implements b
{
public void m(){
System.out.println("Hello second");
}
}
class sample implements a,b{
public void happy()
{
System.out.println("HappY");
a.super.m();
b.super.m();
}
}
class trying{
public static void main(String args[]){
sample ob=new sample();
ob.m();
}
}