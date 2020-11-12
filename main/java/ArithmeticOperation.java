public class ArithmeticOperation extends ArithmeticPojo {

    public int sum() {
        return getNum1()+getNum2()+getNum3();
    }

    public int sub() {
        return getNum1()-getNum2()-getNum3();
    }

    public int mul() {
        return getNum1()*getNum2()*getNum3();
    }
    public int div() {
        return getNum1()/getNum2()/getNum3();
    }
    public int per(){
        return (getNum1()+getNum2()+getNum3())/3;
    }
    public int rev() {
        int rev = 0;
        while (getNum1() != 0) {
            int digit = getNum1() % 10;
            rev = rev * 10 + digit;
            setNum1(getNum1() / 10);
        }
        return rev;
    }
}
