function Factorial(number) {

    let product = 1;

    for (let count = number; count > 0; count--) {

        product = product * count;

    return product;
}

let number = Number(prompt("Enter a number: "));

let result = factorial(number);

console.log(result);
}
