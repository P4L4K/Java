class person
{
    String name;
    int age;
    void talk(){
        System.out.println("Hello I'm "+name);
        System.out.println("My age is "+ age);
    }
}
class person_main
{
    public static void main(String args[])
    {
        person Raju = new person();
        Raju.talk();  // variable are not initialised thus given null  or the default value
        System.out.println("Hashcode: "+ Raju.hashCode());
        Raju.name="Raju";
        Raju.age=32;
        Raju.talk();

        person Riya = new person();
        System.out.println("Hashcode: "+ Riya.hashCode());
        Riya.name="Riya";
        Riya.age=30;
        Riya.talk(); 
    }
}

/*
    datatypes                 default value
    char                         space
    bool/string/class type       null
    int/long/short                 0
    float/double                  0.0

    it is the duty of the THERE ARE VARIOUS WAYS TO DO THIS
         1. initialise the  instance variable of one class in another class
         2. using acess specifiers: 
               an access specifier is a key word that specifies how to acess memebers of a class or a class itself
               we can use acess specifiers before a class or before its members
                4 types:
                   1.] private
                            private members of a class are not acessible anywhere outside the class, they are acessible only within the class by the help of methods of the class
                            cannot be inhereted
                   2.] public 
                            public members of a class are acessible everywhere outside the class, everyone can acess them
                            can be inherited to all subclasses
                   3.] protector
                            protected members of a class are acessible outside the class but generally within the same directory
                            can be inherited to a derived class but the usage of protected members is not limited within the package
                   4.] default
                            if no acess specifiers are written by the program, then the java compiler uses the default acess specifier, default memebers are acessed outside the class but within the same directory 
                            can be inherited to the derived class within the same package
         3. using the constructors
                a constructor is similar to methods which is used to initialise the instance variables or to initialise an object
                their are some certain rules to declare a constructor:
                            the constructor name should be same as the class name
                            no return type
                            


 */
