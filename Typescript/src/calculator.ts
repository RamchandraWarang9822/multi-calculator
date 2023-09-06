const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

rl.question('Enter the number with operator: ', (input: string) => {
    let result: number = eval(input);
    console.log(result);
})

// console.log('Select an operation:');
// console.log('1. Add');
// console.log('2. Subtract');
// console.log('3. Multiply');
// console.log('4. Divide');

// class Calculator {

//     add(a: number,b:number) :number {
//         return a + b;
//     }

//     substract(a: number,b:number) :number {
//         return a - b;
//     }

//     multiply(a: number,b:number) :number {
//         return a * b;
//     }

//     divide(a: number,b:number) :number {
//         return a / b;
//     }

//     raiseTo(a: number,b:number) :number {
//         return a ^ b;
//     }

// }



// const calculator = new Calculator();