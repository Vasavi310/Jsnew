//Create an object where two properties are defined using unique Symbols. Demonstrate
how you can access them and show that they do not conflict with each other even if
they have the same description.



const symbol1 = Symbol('uniqueProperty');
const symbol2 = Symbol('uniqueProperty');


const myobject = {
    [symbol1]: 'Value for symbol1',
    [symbol2]: 'Value for symbol2'
};

console.log(myobject[symbol1]);
console.log(myobject[symbol2]);


console.log(symbol1 === symbol2);
