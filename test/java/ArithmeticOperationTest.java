import org.junit.Assert;
import org.junit.Test;

public class ArithmeticOperationTest {
    @Test
    public void testingSumFunction_shouldReturnSumOf5and8_TestCaseShouldPass(){
        ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
        arithmeticOperation.setNum1(15);
        arithmeticOperation.setNum2(15);
        arithmeticOperation.setNum3(15);
        int result = arithmeticOperation.sum();
        System.out.println("addition of three number is = "+result);
        Assert.assertEquals(45, result);
    }
    @Test
    public void provideThreeNumber_WhenReturnSubValueOfNumber_TestShouldPass(){
       ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
        arithmeticOperation.setNum1(15);
        arithmeticOperation.setNum2(15);
        arithmeticOperation.setNum3(15);
        int result = arithmeticOperation.sub();
        System.out.println("substraction of three number is = "+result);
        Assert.assertEquals(-15,result);
    }
    @Test
    public void provideThreeNumber_WhenMulValueOfNumber_TestShouldPass(){
        ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
        arithmeticOperation.setNum1(2);
        arithmeticOperation.setNum2(2);
        arithmeticOperation.setNum3(2);
        int result = arithmeticOperation.mul();
        System.out.println("multiplation of three number is = "+result);
        Assert.assertEquals(8,result);
    }
    @Test
    public void provideThreeNumber_WhenDivValueOfNumber_TestShouldPass(){
        ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
        arithmeticOperation.setNum1(2);
        arithmeticOperation.setNum2(2);
        arithmeticOperation.setNum3(2);
        int result = arithmeticOperation.div();
        System.out.println("division of three number is = "+result);
        Assert.assertEquals(0,result);
    }
    @Test
    public void persantagerOfThreeNumber_WhenDivByThreeHundred_TestShouldPass(){
        ArithmeticOperation arithmeticOperation= new ArithmeticOperation();
        arithmeticOperation.setNum1(50);
        arithmeticOperation.setNum2(50);
        arithmeticOperation.setNum3(50);
        int result = arithmeticOperation.per();
        System.out.println("persantage of three number is = "+result);
        Assert.assertEquals(50, result);
    }
    @Test
    public void reverseOfNumber_when_TestShouldPass(){
        ArithmeticOperation arithmeticOperation= new ArithmeticOperation();
        arithmeticOperation.setNum1(12345);
        int result = arithmeticOperation.rev();
        System.out.println("reverse of number is = "+result);
        Assert.assertEquals(54321, result);
    }

}
