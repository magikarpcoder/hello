abstract class A
{
    abstract void call_me();
    void call_me_too()
    {
        System.out.println("Hey there, I am a concrete method ");
    }
}
class B extends A
{
    void call_me()
    {
        System.out.println("this is B's implementation of callme");
    }
}
// The area method is over-ridden here by the multiple classes
class abstract_class
{
    public static void main(String[] args)
    {
        B b=new B();
        b.call_me();
        b.call_me_too();
    }
}
