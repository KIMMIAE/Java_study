class Test1_1{
    public static void main(String[] args){

        calculator(2, 10);
        System.out.println("---------------------");
        calculator(29, 3);
        System.out.println("---------------------");
        calculator(42, 6);




    }

    public static void calculator(int num1, int num2){
        System.out.println("덧셈결과 : " + (num1+num2));
        System.out.println("뺄셈결과 : " + (num1-num2));
        System.out.println("곱셈결과 : " + (num1*num2));
        System.out.println("나눗셈의 몫  : " + (num1/num2));
        System.out.println("나눗셈의 나머지 : " + (num1%num2));
    }
}