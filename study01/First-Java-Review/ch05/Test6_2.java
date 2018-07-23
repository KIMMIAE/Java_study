/* 자연수 1부터 시작, 모든 홀수와 3의 배수인 짝수 더하기. 
그 합이 언제 1000이 넘어서는지, 그리고 1000을 넘어선 값은 얼마가 되는지 계산하여 출력.
반복문을 while문+무한루프 사용할 것.*/
class Test6_2{
    public static void main(String[] args){
     
     int sum = 0;
     int num = 1;
     while(true)
     {
        if(num%2 != 0){
             sum+=num;
         }
         else{
             if(num%3==0)
             sum+=num;
             }
         if(num>1000)
         {
             System.out.println(num+"더할 때 1000을 넘는다");
             System.out.println("초과된 값 : "+sum);
             break;
         }
         num++;
     }
    }
}