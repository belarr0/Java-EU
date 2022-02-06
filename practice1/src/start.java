public class start {
    public static void main (String[] args){   //String[] args //pupAge
        /*
        int b = 216;    //1
        short s = 1123;
        int i = 64536;
        long l = 2147483648L;
        System.out.println(i);
        System.out.println(b);
        System.out.println(s);
        System.out.println(l);
        */

        /*
        double a, b = 4.12;
        a = 22.1 + b;
        double pi = 3.14;
        float anotherPi = (float) 3.14;
        double c = 27;
        double d = pi * c;
        System.out.println(d);
         */

        /*
        int age = 0;
        age = age + 7;
        System.out.println("Возраст щенка: " + age);
    }
    public static void main (String args[]){
        start test = new start();
        test.pupAge();
    }
         */

        /*
        public String name;

        private double salary;

        public Name (String empName){
            name = empName;
        }

        public void setSalary(double empSal){
            salary = empSal;
        }

        public void printEmp(){
            System.out.println("имя: " + name);
            System.out.println("зарплата: " + salary);
        }

        public static void main (String args[]){
            Name empOne = new Name("Василь:");
            empOne.setSalary(1000);
            empOne.printEmp();
         */

        int a = 30;
        int b = 45;
        System.out.println("Перед тим як передати занчення аргументів а = " + a + " та b = " + b);

        swapFunction(a,b);

        System.out.println("\nЗараз, до та після передачі значення аргументів");
        System.out.println("залишилися незмінними, а = " + a + " і b = " + b);
        }

        public static void swapFunction(int a, int b){
        System.out.println("До зміни: a = " + a + " b = " + b);

        int c = a;
        a=b;
        b=c;
        System.out.println("Після заміни: a = " + a + " b = " + b);
        }
}
