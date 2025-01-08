console.log(varh)//not accessible
var varh="hi var hoisting"
let leth="hi let hoisting"
console.log(varh)
console.log(leth)
if(true)
{
  let a="p";
  var b="q";
  const="r";
  console.log(a);
  console.log(b);
  console.log(c);
}
console.log(a)//not accessible
console.log(b) #q
console.log(c)//not accessible

//reassignment
let a1=10;
var b1=10;
const c=true;
a1=20;//allowed
b1=30//allowed
c=false;//not allowed

let x=10;
var y="Helloo";
let z=true;
console.log(x);
console.log(y);
console.log(z);