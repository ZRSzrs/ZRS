package cn.com.superdemo;
//子类
public class Son extends Father{
    //子类重写方法不可以比父类方法访问权限小。可以扩大方法的访问权限
    //子类方法只要访问权限不严与父类，就构成了方法重写
    public void m1(){
        System.out.println("子类重写后的m1方法");
    }
//子类方法返回值类型可以是父类方法返回值类型的子类1111111
    public Son m2(){
        System.out.println("子类重写后的m2方法");
        return new Son();
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.m1();
        son.m2();
    }
}
