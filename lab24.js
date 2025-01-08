// You are given multiple objects representing user details and preferences.
// Write a function mergeUserData that merges all the objects into one using the spread
// operator.

// Example Input:
// const userDetails = {name: ‘CVR’, age: 25}
// const userAddress = {address: ‘Mangalpally’, city: ‘Hyderabad’}
// const userPreferences = {theme: ‘Engineering Edu’, language: ‘EN’}
// Example Output:
// {name: ‘CVR’, age: 25, address: ‘Mangalpally’, city: ‘Hyderabad’,

// theme: ‘Engineering Edu’, language: ‘EN’}
function mergeobj(...args)
{
    return args.reduce((tot,curr)=>{
        return {...tot,...curr};
    },{})
}
const userDetails = {name: 'cvr', age: 25}
const userAddress = {address: 'Mangalpally', city: 'Hyderabad'}
const userPreferences = {theme: 'Engineering Edu', language: 'EN'}
let res=mergeobj(userDetails,userAddress,userPreferences)
console.log(res)