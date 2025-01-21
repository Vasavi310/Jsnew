//Write a function createProfile that accepts an object with name, age, and an array
interests. Use object destructuring to extract name and age, and array destructuring
to extract the first two interests. The function should return a new object with the
following structure:
{name: ‘John’, age: 25, primaryInterest: ‘Reading’, secondaryInterest: ‘Traveling’}

function createprof({ name, age, interests }) {
    
    const [primaryint, secondaryint] = interests;
    return {
        name,
        age,
        primaryint,
        secondaryint
    };
}

const user = {
    name: 'Vasavi',
    age: 20,
    interests: ['Reading', 'Traveling', 'Cooking']
};

const profile = createprof(user);
console.log(profile);