public class Calculator {
    public int a;
    public int b;
    
    Calculator(int a, int b){
        this.a=a;
        this.b=b;
    }
    public int getSum(int a,int b){
        return a+b;
    }
    public int getFactorial(int n){
            if (n < 0) {
                return -1; // Return -1 to indicate an error for negative input
            }
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
        return result;

        }
        public double getMutiply(double a,double b){
        return a*b;
    }
    public int pow(int a, int b){
       return (int) Math.pow(a,b);
    }
    public int getMutiply(){
        return a*b;
    }

}
