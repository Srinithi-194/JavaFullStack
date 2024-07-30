const display = document.getElementById("display");

function appendToDisplay(input){
    display.value += input;
}
function clearDisplay(){
    display.value = "";
}
function deleteCharacter(){
    display.value = display.value.substring(0, display.value.length - 1);
}
function calculate(){
    display.value = eval(display.value);
}

