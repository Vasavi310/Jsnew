//Implement an iterable object (e.g., a list of numbers) with a reset method. After
the iteration, ensure the iterator can be reset to the initial position and used
again.

function createIterableWithReset(array) {
    let index = 0;

    return {
        // The iterable object that implements the [Symbol.iterator] method
        [Symbol.iterator]() {
            return {
                next: () => {
                    if (index < array.length) {
                        return { value: array[index++], done: false };
                    }
                    return { done: true };
                }
            };
        },

        reset() {
            index = 0;
        }
    };
}

const iterable = createIterableWithReset([1, 2, 3, 4, 5]);

for (const value of iterable) {
    console.log(value);
}
iterable.reset();

for (const value of iterable) {
    console.log(value); 
}
