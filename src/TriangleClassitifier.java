public class TriangleClassitifier {
    private int a;
    private int b;
    private int c;

    public TriangleClassitifier(int a,int b , int c ){
        if(a <= 0 || b <= 0 || c <= 0){
            System.out.println("Not Triangle");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int checkTypeTriangle(){
        boolean isTriangle = false;
        if (a < b + c && b < a + c && c < a + b){
            isTriangle = true;
        }
        if (isTriangle){
            if (a==b && b==c){
                return 2;
            } else if (a !=b && a!=c && b!=c){
                return 0;
            } else {
                return 1;
            }
        } return -1;
    }
}
