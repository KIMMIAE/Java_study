// 1~100까지 출력하고 다시 거꾸로 100~1까지 출력. While. do while 각각 한번씩 사용
class Test4_2{
    public static void main(String[] args){
    int num=0;

    while(num<100)
    {
      System.out.println(++num);
    }
    System.out.println("------------------------");
    do{
      System.out.println(num--);
    }while(num>0);

 }
}