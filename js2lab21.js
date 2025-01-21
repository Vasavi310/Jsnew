//Write a generator function that generates an infinite Fibonacci sequence. Use the
generator to get the next Fibonacci number and explain how the generator pauses and
resumes.


function* fibonacciGenerator() {
    let [a, b] = [0, 1]; 
    while (true) {
        yield a; 
        [a, b] = [b, a + b];
    }
}
const fib = fibonacciGenerator();

console.log(fib.next().value); // Output: 0 
console.log(fib.next().value); // Output: 1
console.log(fib.next().value); // Output: 1 
console.log(fib.next().value); // Output: 2 
console.log(fib.next().value); // Output: 3
