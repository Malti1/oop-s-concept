package objecthomework;

public class polymorphismOverLoading {

    static double myMethodDouble(double x, double y){

        return x-y;
    }
    static float myMethodFloat(float z,float e){
        return z*e;
    }

    public static void main(String[] args) {
        double myNum1 = myMethodDouble(7,5);
        float myNum2 = myMethodFloat(8,10);
        System.out.println("double: " + myNum2);
        System.out.println("float: "+ myNum1);

    }


}


