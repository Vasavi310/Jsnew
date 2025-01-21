const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
function cal(a,b,op)
{
   if(op=='+')
     return a+b;
   else if(op=='-')
     return a-b;
   else if(op=='*')
     return a*b;
   else if(op=='/')
   {
      if(b!=0)
         return a/b;
      else
         return "enter again resulting division by zero";
   }
}
rl.question("enter num1: ",(a)=>{
rl.question("enter num2: ",(b)=>{
  rl.question("enter operator: ",(op)=>{
      a=parseFloat(a);
      b=parseFloat(b);
      let res=cal(a,b,op);
      console.log(res);
      rl.close();
  });
});
});
