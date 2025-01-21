function cal(a,b,op)
{
   if(op=='+')
     return a+b;
   elsif(op=='-')
     return a-b;
   elsif(op=='*')
     return a*b;
   elsif(op=='/')
   {
      if(b!=0)
         return a/b;
      else
         return "enter again resulting division by zero";
   }
}
let a=prompt("enter num1: ");
let b=prompt("enter num2: ");
let op=prompt("enter operator: ");
let res=cal(a,b,op);
console.log(res);