function sortArrayDescending(arr) {
    return arr.sort((a, b) => {
       if (a < b) {
         return 1;
       }
       if (a > b) {
         return -1;
       }
       return 0;
    });
}
   
let array = [34, 56, 2, 100, 98, 45, 67, 89, 23];
console.log(sortArrayDescending(array));
   