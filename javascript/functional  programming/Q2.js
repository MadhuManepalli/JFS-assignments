var x=prompt("enter the value of x");
function square(x)
{
    return x*x;
}
function double(x)
{
    return (x*2);
}
var f1=function compose()
{
    return square(double(x));
}
var f2=function compose()
{
    return double(square(x));
}

document.write("Compose value of f1 is" + f1()+"<br>"
    +"Compose value of f2 is" + f2());