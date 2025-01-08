// Write a function mergeArrays that accepts any number of arrays as arguments and
// merges them into a single array. Use the spread operator to accomplish this.

// Example Input:
// mergeArrays ([1, 2], [3, 4], [5, 6])
// Example Output:
// [1, 2, 3, 4, 5, 6]

function merge(...args)
{
    return [].concat(...args)
}
let a=[10,20,30]
let b=[40]
let c=[50,60]
let p=merge(a,b,c)
console.log(p)