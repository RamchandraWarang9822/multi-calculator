const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter the calculation: ', (string) => {
    let result = eval(string);
    console.log(result);

    rl.close();
});
