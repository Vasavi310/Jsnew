//You have the following array of 5 numbers:
const nums = [10, 20, 30, 40, 50];
Use array destructuring to swap the first and third elements of the array and the
second and fourth elements. Then, log the modified array.

const l= [10, 20, 30, 40, 50];

[l[0], l[2], l[1], l[3]] = [l[2], l[0], l[3], l[1]];

console.log(l); 
