class student{
String name,address,program;
int age;
student(String n,String add,String prog){
name=n;
address=add;
program=prog;
}
public void setAge(int a){
age=a;
try{
 if(age<0)
throw new ArithmeticException("Age Cannot be negative");
else
getAge();
}catch(ArithmeticException e){
System.out.println("Exception: "+e.getMessage());
}
}

public void getdetails(){
System.out.println("Student Name: "+name);
System.out.println("Address: "+address);
System.out.println("Programme: "+program);
}

public void getAge(){
System.out.println("Age: "+age);
}

public static void main(String args[]){

student s1= new student("Ram","34 Delhi","BCA");
s1.getdetails();
s1.setAge(21);
}
}