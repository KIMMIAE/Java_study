/* 자연수 1부터 시작, 모든 홀수와 3의 배수인 짝수 더하기. 
그 합이 언제 1000이 넘어서는지, 그리고 1000을 넘어선 값은 얼마가 되는지 계산하여 출력.
반복문을 while문+무한루프 사용할 것.*/
class Test6_2{
    public static void main(String[] args){
     int count=0;

        for(int num=1; num<=100; num++){
            if(num%5!=0 || num%7!=0)            
            continue;
            

            count++;
            System.out.println(num);
        } 
            System.out.println("count : " +count);

    }
}