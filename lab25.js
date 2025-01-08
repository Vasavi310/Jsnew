// Write a function updateProductInfo that extracts the id and name properties from a
// product object and then adds new properties (discount and inStock) using the spread
// operator.
// Example Input:
// const product = {id: 101, name: ‘Laptop’, price: 1000, category:

// ‘Electronics’}

// Example Output:
// {id: 101, name: ‘Laptop’, discount: 10, inStock: true}


function updprod(product,discount,instock)
{
    const {id,name}=product;
    this.discount=discount;
    this.instock=instock;
    return {id,name,discount,instock}
}
const product = {id: 101, name: 'Laptop', price: 1000, category:'Electronics'}
let res=updprod(product,25,true)
console.log(res)