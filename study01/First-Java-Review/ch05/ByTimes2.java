//while문으로 재구성 해보기
// for(int i=2; i<10; i++){
//     for(int j=1; j<10; j++)
//         System.out.println(i + "x" + j + "=" + i*j);
            
class ByTimes2{
    public static void main(String[] args){
        int i = 2, j;

        while(i<10)
        {
            j=1;
            while(j<10){
            System.out.println(i + "x" + j + "=" + i*j);
            j++;
            }
        i++;
        }
        }
    }