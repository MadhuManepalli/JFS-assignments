function greeting(name) {
    return "Hello, " + name + "!";
}
function mul(v) {
    var mul = 1;
    for (var i = 1; i <= v; i++) {
        mul *= i;
    }
    return mul;
}
//returns the sum of  multiplies of 3 of the numbers 1 to n
function GetSum(v) {
    var sum = 0;
    for (var i = 1; i <= v; i++) {
        sum += i;
    }
    return sum;
}
//returns the sum of  multiplies of 3 of the numbers 1 to n
function GetSumofmutiples(v, m) {
    var sum = 0;
    for (var i = 1; i <= v; i++) {
        if (i % m == 0) {
            sum += i;
        }
    }
    return sum;
}

// program to check leap year
function checkLeapYear(year) {
    //three conditions to find out the leap year
    if ((0 == year % 4) && (0 != year % 100) || (0 == year % 400)) {
        return true;
    } else {
        return false;
    }
}
var arr = ["m","a","d","h","u",];
var arr1 = [2,45,125,20,450,3265,45895,124789,2314,5,20,35,1248,];
function fib(n) {
    var num1 = 0;
    var num2 = 1;
    var sum;
    var i = 0;
    for (i = 0; i < n; i++) {
        sum = num1 + num2;
        num1 = num2;
        num2 = sum;
    }
    return num2;
}
function Q1() {
    document.getElementById("hello").innerHTML = "<b> Hello World</b>";
}
function Q2() {
    var v = prompt('Enter The Name');
    alert(greeting(v));
}
function Q3() {
    var v = prompt('Enter The Name');
    (v.includes("Alice") || v.includes("Bob")) ? alert(greeting(v)) : alert("Hello");
}
//prints the sum of the numbers 1 to n
function Q4() {
    var v = parseInt(prompt('Enter The number'));
    document.getElementById("hello").innerHTML = "<b> The Sum Of The Numbers 1 To " + v + " Is : " + GetSum(v) + "</b>";
}
//prints the sum of  multiplies of 3 of the numbers 1 to n
function Q5() {
    var v = parseInt(prompt('Enter The number'));
    document.getElementById("hello").innerHTML = "<b> The Sum Of The Multiples Of 3 Of The Numbers 1 To " + v + " Is : " + GetSumofmutiples(v, 3) + "</b>";
}
//function that asks the user for a number n and gives them the
//possibility to choose between computing the sum and computing the product of 1 to n.
function Q6() {
    var v = parseInt(prompt('Enter The number'));
    var s = prompt('Enter The String' + "\n" + "For Sum : \"sum\" or \"+\" " + "\n" + "2.Product : \"product\" or *");
    if (s == "sum" || s == "+") {
        document.getElementById("hello").innerHTML = "<b> The Sum Of The Numbers 1 To " + v + " Is : " + GetSum(v) + "</b>";
    }
    else if (s == "product" || s == "*") {
        document.getElementById("hello").innerHTML = "<b> The Product Of The Numbers 1 To " + v + " Is : " + mul(v) + "</b>";
    }
}
// function that prints a multiplication table for numbers up to 12.
function Q7() {
    var i = 1;
    var s = "";
    j = 12;
    while (i <= 12) {
        s += j + " X " + i + " = " + i * j + "<br>";
        i++;
    }
    document.getElementById("hello").innerHTML = "<b>" + s + "</b>";
}
//checks a number is prime or not 
const isPrime = num => {
    for (let i = 2, s = Math.sqrt(num); i <= s; i++)
        if (num % i === 0) return false;
    return num > 1;
}
//Write a program that prints all prime numbers.
function Q8() {
    var i = 1;
    var s = "";
    var c = 0;
    while (i <= 100) {
        if (isPrime(i)) {
            c += 1;
            s += i + "<br>";
        }
        i++;
    }
    document.getElementById("hello").innerHTML = "<b>" + s + "</b>";
}


/* Write a guessing game where the user has to guess a secret number. After
every guess the program tells the user whether their number was too large
or too small. At the end the number of tries needed should be printed. It
counts only as one try if they input the same number multiple times
consecutively.*/
function Q9() {
    var secretNumber = Math.round(Math.random() * 999 + 1);
    console.log(secretNumber);
    var count = 1;
    var guess = parseInt(prompt("Guess a number between 1 and 1000"));
    while (count < 999) {
        if (guess == secretNumber) {
            alert("You Won" + "\n" + "It Took " + count + " Guesses");
            break;
            //return "You Won";
        }
        else if (guess > secretNumber) {
            count += 1;
            guess = parseInt(prompt("Too High. Guess Again"));
            //return "The Number is greater than the secret number";
        }
        else if (guess < secretNumber) {
            count += 1;
            guess = parseInt(prompt("Too Low. Guess Again"));
            //return "The Number is less than the secret number";
        }
    }
    // alert( checknum(guess, secretNumber));
}
//Write a program that prints the next 20 leap years.
function Q10() {
    var i = new Date().getFullYear();
    var s = "";
    var c = 0;
    while (c <= 20) {
        if (checkLeapYear(i)) {
            c += 1;
            s += i + "<br>";
        }
        i++;
    }
    document.getElementById("hello").innerHTML = "<b>" + s + "</b>";
}
//11) Write a function that returns the largest element in a list.
function Q11() {
    document.getElementById("hello").innerHTML = "<b> The Largest Element In The List Is : " + Math.max(...arr1) + "</b>";
}
// 12 ) reverse an array 
function Q12() {
    document.getElementById("hello").innerHTML = "The Original Array is : " + arr + "<br><b> The Reversed Array Is : " + arr.reverse() + "</b>";
}
//Write a function that checks whether an element occurs in a list.
function Q13() {
    var x = prompt("Enter the Element To Check");
    document.getElementById("hello").innerHTML = "The Element To Check Is : " + x + "<br>The Element Is Present In The List : " + arr.includes(x);
}
//Write a function that returns the elements on odd positions in a list.
function Q14() {
    document.getElementById("hello").innerHTML = "The Elements On Odd Positions In The List Are : " + arr.filter(function (item, index) {
        return index % 2 !== 0;
    });
}
//Write a function that computes the running total of a list.
function Q15() {
    document.getElementById("hello").innerHTML = "The Running Total Of The List Is : " + arr1.reduce(function (a, b) {
        return a + b;
    });
}