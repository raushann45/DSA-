public class AllVariable {
    public static void main(String[] args) {

        // Basic Variables
        int num1 = 10;
        int num2 = 20;

             System.out.println("num1 = " + num1);
             System.out.println("num2 = " + num2);

             // Addition
             int sum = num1 + num2;
        System.out.println("Sum = " + sum);

        // Swap Variables
        int temp = num1;
        num1 = num2;
        num2 = temp;

            System.out.println("After Swap:");
             System.out.println("num1 = " + num1);
             System.out.println("num2 = " + num2);

        // Increment and Decrement
                num1++;
                 num2--;

            System.out.println("num1 after increment = " + num1);
             System.out.println("num2 after decrement = " + num2);


        int result1 = num1++ + ++num2;
              System.out.println("Result1 = " + result1);
               System.out.println("num1 = " + num1);
                 System.out.println("num2 = " + num2);
        // some tricky 
        int value = 5;
        int answer = value++ + value++ + ++value;

                System.out.println("Answer = " + answer);
                  System.out.println("Final value = " + value);

        // Different Data Types
             double price = 99.5;
             char grade = 'A';
              boolean isJavaEasy = true;
              String studentName = "Raushan";

                System.out.println("Price = " + price);
                System.out.println("Grade = " + grade);
                System.out.println("Java Easy? " + isJavaEasy);
                System.out.println("Student Name = " + studentName);

    }
}