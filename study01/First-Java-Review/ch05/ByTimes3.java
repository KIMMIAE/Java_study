// 복습 - for문 while문을 사용해서 구구단을 출력하라. 각 한번씩
class ByTimes3{
    public static void main(String[] args){
        
        int i = 2, j;

        while(i<10)
        {
            j=1; // j=1 인게 반복이 되어야 되는데 자꾸 까먹음. 생각하며 코딩할 것.
            while(j<10){
                j++;
                System.out.println(i + "x" + j + "=" + i*j);
            }
            i++;
        }

        //for문 사용
        // for(int i=2; i<10; i++){
        //     for(int j=1; j<10; j++)
        //     System.out.println(i + "x" + j + "=" + i*j);
        // }

        
    }
}