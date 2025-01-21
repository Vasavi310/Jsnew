//Create a generator function that computes the cumulative sum of an array. Return the
final sum when the iteration is completed and explain how to access both the yielded
values and the return value.

function* cumulativeSum(array) {
    let sum = 0;
    for (const num of array) {
        sum += num;  
        yield sum;
    }
    return sum;
}

const array = [1, 2, 3, 4, 5];
const gen = cumulativeSum(array);

let result = gen.next();
while (!result.done) {
    console.log(result.value);
    result = gen.next();
}

console.log("Final sum:", result.value);
