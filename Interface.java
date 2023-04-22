interface A{
    static int a=5;
    void print(int a);
}
interface B{
    static int a=10;
    static int b=5;
    void print(int a,int b);
}
class C implements A,B{
    public void print(int a){
        System.out.println(a*a);
    }
    public void print(int a,int b){
        System.out.println(a*b);
    }
    public static void main(String[] args){
        C ob = new C();
        ob.print(5);
        ob.print(2,4);
    }
}
