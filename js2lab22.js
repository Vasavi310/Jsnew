function* combinedSequence(array) {
    let [a, b] = [0, 1]; 
    let index = 0; 


    while (true) {

        if (index < array.length) {
            yield array[index++];
        }
        yield a;
        [a, b] = [b, a + b]; 
    }
}

const a = [10, 20, 30, 40];
const combinedGen = combinedSequence(a);

console.log(combinedGen.next().value); //  10 (from array)
console.log(combinedGen.next().value); //  0 (from Fibonacci sequence)
console.log(combinedGen.next().value); //  20 (from array)
console.log(combinedGen.next().value); //  1 (from Fibonacci sequence)
console.log(combinedGen.next().value); //  30 (from array)
console.log(combinedGen.next().value); //  1 (from Fibonacci sequence)
console.log(combinedGen.next().value); //  40 (from array)
console.log(combinedGen.next().value); // 2 (from Fibonacci sequence)
console.log(combinedGen.next().value); // 3 (from Fibonacci sequence)
