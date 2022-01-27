package objecthomework;

public class InheritanceRunClass {

    public static void main(String[] args) {
        InheritanceFoodCalories cal1 = new InheritanceFoodCalories();
        cal1.indianFood();
        InheritanceChildClass cal2 = new InheritanceChildClass();
        cal2.junkFood();
        InheritanceChildClass2 cal3 = new InheritanceChildClass2();
        cal3.chineseFood();
        OverRiding obj1 = new OverRiding();
        obj1.indianFood();
    }

}
