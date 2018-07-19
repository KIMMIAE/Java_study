// 1~99까지 합을 구하는 프로그램을 작성하시오. 단, While문을 쓸 것.
class Test4_1{
    public static void main(String[] args){
    int num=1, sum=0;

    while(num<100)
    {
      sum+=num;
      num++;
    }
      System.out.println(sum);

 }
}