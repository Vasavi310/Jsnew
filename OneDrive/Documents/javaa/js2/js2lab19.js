//Write an iterator that generates an infinite sequence of numbers starting from 1.
Include a mechanism for stopping the iteration after a certain number of steps.



function createInfiniteSequence() {
    let current = 1;
    return {
        [Symbol.iterator]() {
            return {
                next() {
                    return { value: current++, done: false };
                }
            };
        }
    };
}

const infiniteSequence = createInfiniteSequence();
const iterator = infiniteSequence[Symbol.iterator]();

const maxSteps = 10;
for (let i = 0; i < maxSteps; i++) {
    console.log(iterator.next().value);
}
