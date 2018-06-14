package LiveProject;

public class ClassX {
protected int a =10;
protected int b =20;

protected void add(){
System.out.println(a+b);
}
public static void main(String[] args) {
ClassX objX = new ClassX();
System.out.println(objX.a);
objX.add();
}
}