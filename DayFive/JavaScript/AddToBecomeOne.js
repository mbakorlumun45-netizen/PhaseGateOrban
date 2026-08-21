
let sumNum = 0;
let count = 0;

let number = 38;

while(count != 0){

    let lastNum = number % 10;

    sumNum += lastNum;

    number /= 10;    
}

console.log(number);
