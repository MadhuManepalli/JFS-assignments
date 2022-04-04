function Q2(){
    var result = "";
    var i = 0;
    while(i < 3){
    var value = parseInt(prompt("Enter a number between 1 and 30"));
    if(value >= 1 && value <= 30){
        result += "<br>" + "*".repeat(value);
        i++;
    }
    else{
        alert("Invalid input");
    }}
    document.getElementById("hello").innerHTML = result;

}