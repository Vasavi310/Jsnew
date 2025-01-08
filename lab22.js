function empupdate(obj,age1)
{
    return {...obj,age:age1}
}
const obj = {name:'vasavi',
    age:20,
    role:'student'}
let res=empupdate(obj,21)
console.log(res)