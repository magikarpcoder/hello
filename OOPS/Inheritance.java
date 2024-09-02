//this is to try out method overriding;
class Figure
{
    //declare the variables
    double dim1,dim2;
    //using the java book example because I am a retard;
    Figure(double a,double b)
    {
        dim1=a;dim2=b;
    }
    double area()
    {
        System.out.println("the dimensions are not defined");
        return 0;
    }
}
class triangle extends Figure
{
    triangle(double a,double b)
    {
        super(a,b);//calls the constructor of the super class??
    }
    double area()
    {
        return 0.5*dim1*dim2;
    }
}
class rectangle extends Figure
{
    rectangle(double a,double b)
    {
        super(a,b);
    }
    double area()
    {
        return dim1*dim2;
    }
}
// The area method is over-ridden here by the multiple classes
class inhertiance
{
    public static void main(String[] args)
    {
        Figure f=new Figure(10,10);
       rectangle r=new rectangle(14,43);
       triangle t=new triangle(56,23);
        // let's create a super class reference variable
       Figure figref;
       figref=r;
       figref.area();
       System.out.println(figref.area());
       System.out.println();
       figref=t;
       System.out.println(figref.area());
        figref=f;
        figref.area();
    }
}
