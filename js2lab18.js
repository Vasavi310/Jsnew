//Create a custom iterable object that allows iteration through an array in reverse
order. Ensure that it uses a proper iterator with the next() method and handles the
done state correctly.
Example Input: const arr = [1, 2, 3, 4]
Expected Output: 4 3 2 1

const create = (array) => ({
    [Symbol.iterator]: function* () {
        for (let i = array.length - 1; i >= 0; i--) {
            yield array[i];
        }
    }
});


const a = [1, 2, 3, 4];
const reve = create(a);

for (const value of reve) {
    console.log(value);
}
