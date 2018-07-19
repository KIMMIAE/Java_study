// 1000이하의 자연수 중에서 2의 배수이면서 7의 배수인 숫자를 출력하고 그 출력된 숫자들의 합을 구하는
// 프로그램을 while문을 이용해서 작성해보자.
class Test4_3{
    public static void main(String[] args){
    int num=0, sum=0;

    while(num<=1000)
    {
      if(num%2==0 && num%7==0){
      System.out.println(num);
      sum+=num;
      }
        num++;
    }
System.out.println("합 : " + sum);
 }
}