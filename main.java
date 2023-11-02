public class main {
    public static int addNumbers(int num1, int num2){
        return num1 + num2;
    }
    public static void main(String[] args){
        int number1=5;
        int number2=7;
        int result=addNumbers(number1, number2);
        System.out.println("the sum of" + number1+"and"+ number2+"is:"+result);
    }
}
