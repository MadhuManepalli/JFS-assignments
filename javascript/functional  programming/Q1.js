 //var x=5;
var x=prompt("enter a number");
    function square(x)
{
    return (x*x);
    }
    function double(x)
    {
    return(x*2);
    }
    function composedValue()
    {
    return(square(double(x)));
    }
    document.write("value of composed function is:"+composedValue());