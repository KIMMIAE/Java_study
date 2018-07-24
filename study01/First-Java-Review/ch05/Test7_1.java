// 구구단의 짝수단만 출력. 2단은 2x2까지, 4단은 4x4까지, 8단은 8x8까지
class Test7_1{
    public static void main(String[] args){

        for(int i=2; i<10; i+=2){
            for(int j=1; j<10; j++){
                System.out.println(i + "x" + j + "=" + i*j);
                if(j>=i){
                    break;
                }
            }
        }
    }
}