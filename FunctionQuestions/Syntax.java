
//     public static void raushan(){
//         // code
//         System.out.println("Good Boy");
//     }
//     public static void main(String[] args) {
//         raushan();
//         System.out.println("Aman");
//         pawan();
//     } 
//     public static void pawan()
// {
// System.out.println("noo");
// }
// }


// access_modifier return_type function_name(list of parameters){
//.           body
//          }

/* features
1. Readibility
2. Modularity
3. reusability
4.easy to debug and test
parameterised function:- function with atleast one parameter 
Non parameterised:-function with no parameter


Components of function?


function and their local variable are created in stack memoery
variables are stored in static memory
each and every function creates its own area known as stack area.

function Overloading:----> Same function name with different parameter or different return type..
it is also called compiled time polymorphism....


Function overriding:---> Same function name and same parameter with different work..
class A{
int add(int a, int b){
      return a+b;
}
}
class B extends Class A{
    @override
     int add(int a, int b){
           return a*b;
     }
}
  

Recursive function:- Function callig own body..




*/
class Syntax {

    int age = 20; // instance variable

    void show(int age) {
        System.out.println(this.age);  // instance variable
    }

  void main() {
    show(5);
}
}

