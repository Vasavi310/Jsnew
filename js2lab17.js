//Create two global symbols with the same key using Symbol.for(). When retrieved from
the global symbol registry, show that they are the same symbol and explain the
difference between Symbol() and Symbol.for().



const globalSymbol1 = Symbol.for('globalKey');
const globalSymbol2 = Symbol.for('globalKey');


console.log(globalSymbol1 === globalSymbol2);

console.log(Symbol.keyFor(globalSymbol1)); 
console.log(Symbol.keyFor(globalSymbol2));
