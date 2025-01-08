// Write a function updateEmployeeDetails that takes an object representing an
// employee’s details and updates their role while maintaining the other properties
// using the spread operator.
// Example Input:
// const employee = {name: ‘Afroz’, role: ‘Developer’, age: 28, location: ‘IN’}
// updateEmployeeDetails (employee, ‘Senior Developer’)
// Example Output:
// {name: ‘Afroz’, role: ‘Senior Developer’, age: 28, location: ‘IN’}


function empupdate(obj,age1)
{
    return {...obj,age:age1}
}
const obj = {name:'vasavi',
    age:20,
    role:'student'}
let res=empupdate(obj,21)
console.log(res)