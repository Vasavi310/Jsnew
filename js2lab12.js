Write a function createProfile that accepts an object with name, age, email, and
address. Use object destructuring to extract the name and email and return a new
object containing only the name and email.

function createProfile({ name, email }) {
    return { name, email };
}

const user = {
    name: "Chanda Vasavi",
    age: 20,
    email: "chandavasavi1@gmail.com",
    address: "Mbnr"
};

const prof = createProfile(user);
console.log(prof);