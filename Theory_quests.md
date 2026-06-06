1)Explain Java Exception hierarchy:

Throwable
Exception
Error

Give one example for each.throwable error exception 
egs-StackoverflowError
exceptions-NullPointerException


2)Can we have multiple catch blocks?
Explain with example when it is useful.
yes we can have multiple catch block
if we want to handel airthmetic errors then inside catch(Airthmeticerror e) in another for suppose index verificationin another catch which helps us to print our statemenet accourding to our error handling


3)A program crashes when user enters text instead of number.

What exception occurs? input mismatch error occurs

How will you handle it?-by using try and catch

Where should try-catch be placed?-inside try we can take the input 
and in catch(inputmismatcherror e)-we can print wrong input given



4)try {
    int a = 10 / 0;
    
    System.out.println("Hello");

}

catch(Exception e) {

    System.out.println("Error handled");

}

System.out.println("End");

Predict the output - error handeled
                    Hello

What prints first? Error handeled

Does program stop? no as we have resolved the eeror and managed it




