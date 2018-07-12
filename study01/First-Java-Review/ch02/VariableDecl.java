/* 결과값 오차 확인. -> 변수 저장하는 과정에서 발생한 오차 */
class VariableDecl {
    public static void main(String[] args){
        double num1, num2, result;
        num1 = 1.0000001;
        num2 = 2.0000001;
        result = num1+num2;

        System.out.println(result);
    }
}