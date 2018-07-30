class Test1_2{
    public static void main(String[]args){

        abs(10, 6);
        abs(5, 30);

    }
    public static void abs(int n1, int n2){
        if(n1>n2){
            System.out.println(n1-n2);
        }
        else {
            System.out.println(n2-n1);
        }
    }
}